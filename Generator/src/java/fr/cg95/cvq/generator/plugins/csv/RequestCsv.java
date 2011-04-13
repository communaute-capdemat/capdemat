package fr.cg95.cvq.generator.plugins.csv;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

/**
 * 
 * @author vsi
 *
 */
public class RequestCsv {
    
    private String name;
    private String acronym;
    private List<ElementCsv> elements;
    
    public RequestCsv(String name, String targetNamespace) {
        this.name =  StringUtils.uncapitalize(name);
        this.acronym = StringUtils.substringAfterLast(targetNamespace, "/");
    }
    
    public String getName() {
        return name;
    }
    
    public String getCamelCaseName() {
        return StringUtils.uncapitalize(name);
    }
    
    public String getAcronym() {
        return acronym;
    }
    
    public List<ElementCsv> getElements() {
        return elements;
    }
    
    public void addElement (ElementCsv element) {
        if (elements == null)
            elements = new ArrayList<ElementCsv>();
        elements.add(element);
    }
}
