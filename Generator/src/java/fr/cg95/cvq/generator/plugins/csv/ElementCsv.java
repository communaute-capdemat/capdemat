package fr.cg95.cvq.generator.plugins.csv;

import java.math.BigInteger;

import fr.cg95.cvq.generator.ElementTypeClass;
import fr.cg95.cvq.generator.common.ElementSpecific;

/**
 * 
 * @author vsi
 * 
 */
public class ElementCsv extends ElementSpecific<ElementCsv> {

    private String name;
    private String stepName;
    private String description;
    private String xmlSchemaType;
    private BigInteger minOccurs;
    private BigInteger maxOccurs;
    private int minLength;
    private int maxLength;
    private String pattern;
    private String defaultValue;
    private String enumValues;
    private String triggerConditions;
    private String filledCondition;
    private ElementTypeClass typeClass;

    public String getTypeClass() {
        return typeClass.toString();
    }

    public ElementCsv(String name) {
        this.name = name;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public String getMinLength() {
        return minLength == 0 ? "" : "" + minLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public String getMaxLength() {
        return maxLength == 0 ? "" : "" + maxLength;
    }

    public void setTypeClass(ElementTypeClass typeClass) {
        this.typeClass = typeClass;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return description == null ? "" : description;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public String getStepName() {
        return stepName == null ? "" : stepName;
    }

    public BigInteger getMinOccurs() {
        return minOccurs;
    }

    public void setMinOccurs(BigInteger minOccurs) {
        this.minOccurs = minOccurs;
    }

    public String getMaxOccurs() {
        return maxOccurs == null ? "n" : "" + maxOccurs;
    }

    public void setMaxOccurs(BigInteger maxOccurs) {
        this.maxOccurs = maxOccurs;
    }

    public void setXmlSchemaType(String xmlSchemaType) {
        this.xmlSchemaType = xmlSchemaType;
    }

    public String getXmlSchemaType() {
        return xmlSchemaType;
    }

    public String getPattern() {
        return pattern == null ? "" : pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setDefaultValue(String defaultValue) {
        if (defaultValue != null)
            this.defaultValue = defaultValue;
    }

    public String getDefaultValue() {
        return defaultValue == null ? "" : defaultValue;
    }

    public void setEnumValues(String enumValues) {
        this.enumValues = enumValues;
    }

    public String getEnumValues() {
        return enumValues == null ? "" : enumValues;
    }

    public void setTriggerConditions(String triggerConditions) {
        this.triggerConditions = triggerConditions;
    }

    public String getTriggerConditions() {
        return triggerConditions == null ? "" : triggerConditions;
    }

    public void setFilledCondition(String filledCondition) {
        this.filledCondition = filledCondition;
    }

    public String getFilledCondition() {
        return filledCondition == null ? "" : filledCondition;
    }

}
