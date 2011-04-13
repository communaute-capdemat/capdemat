package fr.cg95.cvq.generator.plugins.csv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.codehaus.groovy.control.CompilationFailedException;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import fr.cg95.cvq.generator.ApplicationDocumentation;
import fr.cg95.cvq.generator.ElementProperties;
import fr.cg95.cvq.generator.ElementTypeClass;
import fr.cg95.cvq.generator.IPluginGenerator;
import fr.cg95.cvq.generator.UserDocumentation;
import fr.cg95.cvq.generator.common.Condition;
import fr.cg95.cvq.generator.common.ConditionListener;
import fr.cg95.cvq.generator.common.ElementCommon;
import fr.cg95.cvq.generator.common.ElementStack;
import groovy.text.SimpleTemplateEngine;
import groovy.text.Template;

/**
 * 
 * @author vsi
 * 
 */
public class CsvPlugin implements IPluginGenerator {

    private static Logger logger = Logger.getLogger(CsvPlugin.class);

    private int depth;
    private String outputDir;
    private String csvTemplate;
    private RequestCsv requestCsv;

    private ElementStack<ElementCsv> elementCsvStack;

    @Override
    public void endElement(String elementName) {
        logger.debug("endElement()");
        if (depth <= 1)
            requestCsv.addElement(elementCsvStack.pop(depth));
        else
            elementCsvStack.store(depth);
        depth--;
    }

    @Override
    public void endElementProperties() {
        logger.debug("endElementProperties()");
    }

    @Override
    public void endRequest(String requestName) {
        logger.debug("endRequest()");
        try {
            String output = outputDir + "/";
            if (!new File(output).exists())
                new File(output).mkdir();

            SimpleTemplateEngine templateEngine = new SimpleTemplateEngine();
            Template template = templateEngine.createTemplate(new File(csvTemplate));
            Map<String, Object> bindingMap = new HashMap<String, Object>();
            bindingMap.put("requestCsv", requestCsv);
            template.make(bindingMap).writeTo(new FileWriter(output + requestCsv.getName() + ".csv"));
            logger.warn("endRequest() - csv.tpl OK");
        } catch (CompilationFailedException cfe) {
            logger.error(cfe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            logger.error(cnfe.getMessage());
        } catch (IOException ioe) {
            logger.error(ioe.getMessage());
        }
    }

    @Override
    public void initialize(Node configurationNode) {
        logger.debug("initialize()");
        try {
            NamedNodeMap childAttributesMap = configurationNode.getFirstChild().getAttributes();
            outputDir = childAttributesMap.getNamedItem("outputdir").getNodeValue();
            csvTemplate = childAttributesMap.getNamedItem("csvtemplate").getNodeValue();
        } catch (NullPointerException npe) {
            throw new RuntimeException("Check csv-plugin.xml");
        }
    }

    @Override
    public void onApplicationInformation(ApplicationDocumentation appDoc) {
        logger.debug("onApplicationInformation()");
        ElementCsv elementCsv = elementCsvStack.peek(depth);
        if (appDoc.getRequestCommon().getCurrentElementCommon() != null) {
            ElementCommon elementCommon = appDoc.getRequestCommon().getCurrentElementCommon();
            elementCsv.setStepName(elementCommon.getStep().getName());
            
            if (elementCommon.getConditionListener() != null) {
                ConditionListener filled = elementCommon.getConditionListener();
                elementCsv.setFilledCondition(filled.getCondition().getName());
            }
            
            if (elementCommon.getTriggeredConditions() != null) {
                String trigger = "";
                for (Condition myTrigger : elementCommon.getTriggeredConditions()) {
                    trigger += myTrigger.getName() + ",";
                }
                if (trigger.length() > 1)
                    trigger = StringUtils.chop(trigger);
                elementCsv.setTriggerConditions(trigger);
            }
        }
    }

    @Override
    public void onUserInformation(UserDocumentation userDoc) {
        logger.debug("onUserInformation()");
        ElementCsv elementCsv = elementCsvStack.peek(depth);
        if (elementCsv != null 
                && userDoc.getSourceUri().equals(IPluginGenerator.SHORT_DESC)
                && userDoc.getLang().equals("fr")) {
                    elementCsv.setDescription(userDoc.getText());
        }
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void startElement(String elementName, String type) {
        logger.debug("startElement()");
        elementCsvStack.push(++depth, new ElementCsv(elementName));

    }

    @Override
    public void startElementProperties(ElementProperties elementProp) {
        logger.debug("startElementProperties()");
        ElementCsv elementCsv = elementCsvStack.peek(depth);
        if (elementProp.getXmlSchemaType() == null) {
            String xmlBeanType = elementProp.getXmlBeanType();
            xmlBeanType = xmlBeanType.substring(xmlBeanType.lastIndexOf(".") + 1);
            elementCsv.setXmlSchemaType(xmlBeanType);
        } else
            elementCsv.setXmlSchemaType(elementProp.getXmlSchemaType());
        elementCsv.setMinOccurs(elementProp.getMinOccurs());
        elementCsv.setMaxOccurs(elementProp.getMaxOccurs());
        if (elementProp.getMinLength() != 0)
            elementCsv.setMinLength(elementProp.getMinLength());
        if (elementProp.getXmlSchemaType() == "string")
            elementCsv.setMaxLength(255);
        else
            elementCsv.setMaxLength(elementProp.getMaxLength());
        if (elementProp.getPatterns().length > 0)
            elementCsv.setPattern(elementProp.getPatterns()[0]);
        elementCsv.setDefaultValue(elementProp.getDefaultValue());
        if (elementProp.getEnumValues() != null) {
            String enumsAsString = StringUtils.join(elementProp.getEnumValues(), ",");
            elementCsv.setEnumValues(enumsAsString);
        }
        
        if (elementProp.isSimpleType() || elementProp.getXmlSchemaType().equals("AddressType"))
            elementCsv.setTypeClass(ElementTypeClass.SIMPLE);
        else if (elementProp.isComplexType())
            elementCsv.setTypeClass(ElementTypeClass.COMPLEX);
        if (elementProp.getMaxOccurs() == null
                || elementProp.getMaxOccurs().compareTo(BigInteger.valueOf(1)) == 1)
            elementCsv.setTypeClass(ElementTypeClass.COLLECTION);
        // TODO - refactor typClass managment
        if (elementProp.getXmlSchemaType() != null
                && elementProp.getXmlSchemaType().equals("LocalReferentialDataType"))
            elementCsv.setTypeClass(ElementTypeClass.SIMPLE);
    }

    @Override
    public void startRequest(String requestName, String targetNamespace) {
        logger.debug("startRequest()");
        depth = 0;
        requestCsv = new RequestCsv(requestName, targetNamespace);
        elementCsvStack = new ElementStack<ElementCsv>();
    }
}
