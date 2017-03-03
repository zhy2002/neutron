package zhy2002.neutron;

import freemarker.template.Template;
import org.yaml.snakeyaml.Yaml;
import zhy2002.neutron.model.CodeGenInfo;
import zhy2002.neutron.model.DomainInfo;
import zhy2002.neutron.model.NodeInfo;
import zhy2002.neutron.model.RuleInfo;

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

    void generate(String definitionFile, String targetDirectory) {

        DomainInfo domainInfo = loadDomainInfo(definitionFile);
        TemplateBundle templateBundle = new TemplateBundle();
        CodeGenUtil.clearDirectory(targetDirectory);
        generateAllFiles(domainInfo, templateBundle, targetDirectory);
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

    private static void generateAllFiles(DomainInfo domainInfo, TemplateBundle templateBundle, String targetDirectory) {

        for (NodeInfo nodeInfo : domainInfo.getAllNodes()) {
            generateNodeFiles(nodeInfo, templateBundle, targetDirectory);
        }

        generateFile(targetDirectory, domainInfo.getRootType(), templateBundle.getContextTemplate(), "", "Context");
        generateFile(targetDirectory, domainInfo.getRootType(), templateBundle.getRegistryTemplate(), "", "ClassRegistry");
        //generateFile(targetDirectory, domainInfo.getRootType(), templateBundle.getFactoryTemplate(), "", "Factory");
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
                generateFile(targetDirectory, ruleInfo, templateBundle.getRuleTemplate(), "rule", "");
            }
        }
        generateFile(targetDirectory, nodeInfo, templateBundle.getRuleProviderTemplate(), "rule", "RuleProvider");

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
        try {
            Path directory = Paths.get(targetDirectory, relativePath);
            if (!Files.exists(directory)) {
                Files.createDirectories(directory);
            }

            String fileName = data.getTypeName() + typeSuffix + ".java";
            Path filePath = directory.resolve(fileName);
            try (FileOutputStream fileOutputStream = new FileOutputStream(filePath.toFile())) {
                nodeTemplate.process(data, new OutputStreamWriter(fileOutputStream));
            }
        } catch (Exception ex) {
            throw new RuntimeException("Error generating " + data.getTypeName() + typeSuffix, ex);
        }
    }
}
