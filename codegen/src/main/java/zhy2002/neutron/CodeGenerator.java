package zhy2002.neutron;

import freemarker.template.Template;
import org.yaml.snakeyaml.Yaml;
import zhy2002.neutron.data.CodeGenInfo;
import zhy2002.neutron.data.DomainInfo;
import zhy2002.neutron.data.NodeInfo;
import zhy2002.neutron.data.RuleInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Used to generateFile a neutron node structure.
 */
class CodeGenerator {

    void generate(String definitionFile, String targetDirectory) {

        DomainInfo domainInfo = loadDomainInfo(definitionFile);
        TemplateBundle templateBundle = new TemplateBundle();
        CodeGenUtil.clearDirectory(targetDirectory);
        generateFiles(domainInfo, templateBundle, targetDirectory);
    }

    private static void generateFiles(DomainInfo domainInfo, TemplateBundle templateBundle, String targetDirectory) {

        for (NodeInfo nodeInfo : domainInfo.getNodes()) {
            generateFiles(nodeInfo, templateBundle, targetDirectory);
        }

        generateFile(targetDirectory, domainInfo.getRootType(), templateBundle.getContextTemplate(), "", "Context");
        generateFile(targetDirectory, domainInfo.getRegistryInfo(), templateBundle.getRegistryTemplate(), "", "ClassRegistry");
    }

    private static void generateFiles(NodeInfo nodeInfo, TemplateBundle templateBundle, String targetDirectory) {

        generateFile(targetDirectory, nodeInfo, templateBundle.getNodeTemplate(), "", "");

        if (nodeInfo.hasFactory()) {
            generateFile(targetDirectory, nodeInfo, templateBundle.getNodeFactoryTemplate(), "", "Factory");
        }

        if (nodeInfo.isCanLoad()) {
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
            for (RuleInfo ruleDescription : nodeInfo.getRules()) {
                generateFile(targetDirectory, ruleDescription, templateBundle.getRuleTemplate(), "rule", "");
            }
        }

        if (nodeInfo.getModuleInfo() != null) {
            generateFile(targetDirectory, nodeInfo.getModuleInfo(), templateBundle.getModuleTemplate(), "di", "Module");
            generateFile(targetDirectory, nodeInfo.getModuleInfo(), templateBundle.getScopeTemplate(), "di", "Scope");
            generateFile(targetDirectory, nodeInfo.getModuleInfo(), templateBundle.getComponentTemplate(), "di", "Component");
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

    private static DomainInfo loadDomainInfo(String defFile) {
        try {
            DomainInfo domainInfo = new Yaml().loadAs(new FileInputStream(defFile), DomainInfo.class);
            domainInfo.initialize();
            return domainInfo;
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
}
