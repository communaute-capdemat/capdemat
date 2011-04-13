<%
def showLine(element,conteneur) {
    def line = 
    """ "${conteneur}","${element.stepName}","${element.name}","${element.description}","${element.xmlSchemaType}","${element.minOccurs}","${element.maxOccurs}","${element.minLength}","${element.maxLength}","${element.pattern}","${element.defaultValue}","${element.enumValues}","${element.triggerConditions}","${element.filledCondition}" """
    println line
}
%>
"Conteneur","Etape","Nom xml","Description","Type XML Schema ","Occurence minimum","Occurence maximum","Longueur minimum","Longueur maximum","Expression régulière","Valeur par défaut","Valeurs de l'énumération","Conditions déclenchées","Condition reçue"
<%
requestCsv.elements.each {
    showLine(it,'Demande')
    if(it.typeClass == "COMPLEX")
    {
        def name = it.name
        it.elements.each {
            showLine(it, name)
        }
    }
}
%>
