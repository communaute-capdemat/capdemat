package fr.capwebct.capdemat.plugins.externalservices.mailgeneric.utils;

import java.io.File;
import java.io.StringReader;

import org.apache.log4j.Logger;

import fr.cg95.cvq.business.authority.LocalAuthorityResource;
import fr.cg95.cvq.security.SecurityContext;
import fr.cg95.cvq.service.authority.ILocalAuthorityRegistry;

import au.com.bytecode.opencsv.CSVReader;

public class ExtractInformation {

    public static Logger logger = Logger.getLogger(ExtractInformation.class);

    public static String extractEmailFromCsv(String id, String csvFileName,
            ILocalAuthorityRegistry localAuthorityRegistry) {

        String email = null;
        File file = new File(localAuthorityRegistry.getAssetsBase()
                + SecurityContext.getCurrentSite().getName().toLowerCase() + "/"
                + LocalAuthorityResource.Type.LOCAL_REFERENTIAL.getFolder() + "/" + csvFileName
                + ".csv");
        if (file.exists()) {
            try {
                for (String[] line : new CSVReader(new StringReader(
                        localAuthorityRegistry.getFileContent(file))).readAll()) {
                    if (line[0].equals(id)) {
                        email = line[2];
                    }
                }
            } catch (Exception e) {
                logger.error("ExtractEmailFromCsv got error " + e.getMessage());
            }
        }
        return email;
    }

    public static String extractNameFromCsv(String id, String csvFileName,
            ILocalAuthorityRegistry localAuthorityRegistry) {

        String name = null;
        File file = new File(localAuthorityRegistry.getAssetsBase()
                + SecurityContext.getCurrentSite().getName().toLowerCase() + "/"
                + LocalAuthorityResource.Type.LOCAL_REFERENTIAL.getFolder() + "/" + csvFileName
                + ".csv");
        if (file.exists()) {
            try {
                for (String[] line : new CSVReader(new StringReader(
                        localAuthorityRegistry.getFileContent(file))).readAll()) {
                    if (line[0].equals(id)) {
                        name = line[1];
                    }
                }
            } catch (Exception e) {
                logger.error("extractNameFromCsv got error " + e.getMessage());
            }
        }
        return name;
    }
}
