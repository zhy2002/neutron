package zhy2002.neutron;

import freemarker.template.Template;
import org.yaml.snakeyaml.Yaml;
import zhy2002.neutron.model.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The Neutron code generator. One instance is used per execution.
 * Code gen = model + template.
 */
class CodeGenerator {

    void generateDomain(String definitionFile, String targetDirectory) {
        DomainInfo domainInfo = loadDomainInfo(definitionFile);
        TemplateBundle templateBundle = new TemplateBundle();
        CodeGenUtil.clearDirectory(targetDirectory);
        generateDomainFiles(domainInfo, templateBundle, targetDirectory);
    }

    private static DomainInfo loadDomainInfo(String defFile) {
        try {
            DomainInfo domainInfo = new Yaml().loadAs(new FileInputStream(defFile), DomainInfo.class);
            domainInfo.initialize();
            return domainInfo;
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static void generateDomainFiles(DomainInfo domainInfo, TemplateBundle templateBundle, String targetDirectory) {
        for (NodeInfo nodeInfo : domainInfo.getAllNodes()) {
            generateNodeFiles(nodeInfo, templateBundle, targetDirectory);
        }

        generateFile(targetDirectory, domainInfo.getRootType(), templateBundle.getContextTemplate(), "", "Context");
        generateFile(targetDirectory, domainInfo.getRootType(), templateBundle.getRegistryTemplate(), "", "ClassRegistry");
        generateFile(targetDirectory, domainInfo, templateBundle.getRulePackageTemplate(), "rule", "package-info");
        generateFile(targetDirectory, domainInfo, templateBundle.getManifestModuleTemplate(), "di", "ManifestModule");

        //todo per profile
        //generateFile(targetDirectory, domainInfo, templateBundle.getProfileComponentTemplate(), "di", "DefaultProfileComponent");
    }

    private static void generateNodeFiles(NodeInfo nodeInfo, TemplateBundle templateBundle, String targetDirectory) {

        generateFile(targetDirectory, nodeInfo, templateBundle.getNodeTemplate(), "node", "");

        if (nodeInfo.isUnloadable()) {
            generateFile(targetDirectory, nodeInfo, templateBundle.getNodeLoadEventTemplate(), "event", "LoadEvent");
            generateFile(targetDirectory, nodeInfo, templateBundle.getNodeUnloadEventTemplate(), "event", "UnloadEvent");
        }

        if (nodeInfo.isListItem()) {
            generateFile(targetDirectory, nodeInfo, templateBundle.getNodeAddEventTemplate(), "event", "AddEvent");
            generateFile(targetDirectory, nodeInfo, templateBundle.getNodeRemoveEventTemplate(), "event", "RemoveEvent");
        }

        if (nodeInfo.getChangeEventInfo() != null) {
            generateFile(targetDirectory, nodeInfo.getChangeEventInfo(), templateBundle.getChangeEventTemplate(), "event", "StateChangeEvent");
        }

        if (nodeInfo.getRules() != null) {
            for (RuleInfo ruleInfo : nodeInfo.getRules()) {
                if (!ruleInfo.isExisting()) {
                    generateFile(targetDirectory, ruleInfo, templateBundle.getRuleTemplate(), "rule", "");
                }
            }
            if (nodeInfo.getChildren() != null) {
                for (ChildInfo childInfo : nodeInfo.getChildren()) {
                    if (childInfo.getRules() != null) {
                        for (RuleInfo ruleInfo : childInfo.getRules()) {
                            if (!ruleInfo.isExisting()) {
                                generateFile(targetDirectory, ruleInfo, templateBundle.getRuleTemplate(), "rule", "");
                            }
                        }
                    }
                }
            }
        }
        generateFile(targetDirectory, nodeInfo, templateBundle.getRuleProviderTemplate(), "node", "RuleProvider");

        if (nodeInfo.getItemTypeName() != null) {
            generateFile(targetDirectory, nodeInfo, templateBundle.getItemFactoryTemplate(), "node", "ItemProvider");
        } else if (nodeInfo.getChildren() != null && nodeInfo.getChildren().size() > 0) {
            generateFile(targetDirectory, nodeInfo, templateBundle.getChildFactoryTemplate(), "node", "ChildProvider");
        }

        if (!nodeInfo.isAbstractNode()) {
            generateFile(targetDirectory, nodeInfo, templateBundle.getScopeTemplate(), "di", "Scope");
            generateFile(targetDirectory, nodeInfo, templateBundle.getModuleTemplate(), "di", "Module");
            generateFile(targetDirectory, nodeInfo, templateBundle.getComponentTemplate(), "di", "Component");
        }
    }

    private static void generateFile(String targetDirectory, CodeGenInfo data, Template nodeTemplate, String relativePath, String typeSuffix) {
        generateFile(targetDirectory, data, nodeTemplate, relativePath, "", typeSuffix);
    }

    private static void generateFile(String targetDirectory, CodeGenInfo data, Template nodeTemplate, String relativePath, String typePrefix, String typeSuffix) {
        try {
            Path directory = Paths.get(targetDirectory, relativePath);
            if (!Files.exists(directory)) {
                Files.createDirectories(directory);
            }

            String fileName = typePrefix + (data instanceof ProfileInfo ? "" : data.getTypeName()) + typeSuffix + ".java";
            Path filePath = directory.resolve(fileName);
            try (FileOutputStream fileOutputStream = new FileOutputStream(filePath.toFile())) {
                nodeTemplate.process(data, new OutputStreamWriter(fileOutputStream));
            }
        } catch (Exception ex) {
            throw new RuntimeException("Error generating " + data.getTypeName() + typeSuffix, ex);
        }
    }

    void generateProfile(String nodeFile, String ruleFile, String targetDirectory) {
        DomainInfo domainInfo = loadDomainInfo(nodeFile);
        ProfileInfo profileInfo = loadProfileInfo(ruleFile, domainInfo);
        TemplateBundle templateBundle = new TemplateBundle();
        CodeGenUtil.clearDirectory(targetDirectory);
        generateProfileFiles(profileInfo, templateBundle, targetDirectory);
    }

    private ProfileInfo loadProfileInfo(String ruleFile, DomainInfo domainInfo) {
        try {
            ProfileInfo profileInfo = new Yaml().loadAs(new FileInputStream(ruleFile), ProfileInfo.class);
            profileInfo.setDomainInfo(domainInfo);
            profileInfo.initialize();
            return profileInfo;
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static void generateProfileFiles(ProfileInfo profileInfo, TemplateBundle templateBundle, String targetDirectory) {
        generateFile(targetDirectory, profileInfo, templateBundle.getProfileModuleTemplate(), "di", profileInfo.getTypeName(), "ProfileModule");
        generateFile(targetDirectory, profileInfo, templateBundle.getRulePackageTemplate(), "rule", "package-info");

        for (NodeProfileInfo nodeProfileInfo : profileInfo.getConfiguredNodes()) {
            generateFile(targetDirectory, nodeProfileInfo, templateBundle.getProfileRuleProviderTemplate(), "di", profileInfo.getTypeName(), "RuleProvider");
        }

        for (ChildInfo childInfo : profileInfo.getConfiguredChildren()) {
            //todo
        }

    }


}
