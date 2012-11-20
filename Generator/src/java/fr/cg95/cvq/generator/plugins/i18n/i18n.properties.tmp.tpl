${acronym}.duration.value =

${acronym}.property.subject.label = Sujet
<% steps.each { %>
${acronym}.step.${it.name}.label =
${acronym}.step.${it.name}.desc =
<% } %>
<% elements.each { %>
${it.i18nPrefixCode}.help =
${it.i18nPrefixCode}.validationError =
<% if (it.typeClass == "COLLECTION") { %>
# To customize the collection:
#${it.i18nPrefixCode}.message.howToAddCollectionItem=
#${it.i18nPrefixCode}.action.newCollectionItem=
#${it.i18nPrefixCode}.action.editCollectionItem=
#${it.i18nPrefixCode}.action.deleteCollectionItem=
#${it.i18nPrefixCode}.message.editCollectionItem=
#${it.i18nPrefixCode}.message.addCollectionItem=
#${it.i18nPrefixCode}.action.backToMainForm=
#${it.i18nPrefixCode}.action.add=
#${it.i18nPrefixCode}.action.save=

${it.i18nPrefixCode}.elementAdditionSuccess =
<% } %>
<% } %>
