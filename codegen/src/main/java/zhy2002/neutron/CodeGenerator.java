package zhy2002.neutron;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to generateFile a neutron node structure.
 */
class CodeGenerator {

    private Configuration configuration;

    CodeGenerator() {
        configuration = createTemplateConfiguration();
    }

    void generateFile(String defFile, String targetDirectory) {

        try {
            DomainDescription domainDescription = extractDomain(defFile);
            CodeGenUtil.clearDirectory(targetDirectory);

            Template nodeTemplate = configuration.getTemplate("node.ftl");
            Template nodeFactoryTemplate = configuration.getTemplate("node_factory.ftl");
            Template nodeLoadEventTemplate = configuration.getTemplate("load_event.ftl");
            Template nodeUnloadEventTemplate = configuration.getTemplate("unload_event.ftl");
            Template nodeAddEventTemplate = configuration.getTemplate("add_event.ftl");
            Template nodeRemoveEventTemplate = configuration.getTemplate("remove_event.ftl");
            Template changeEventTemplate = configuration.getTemplate("change_event.ftl");
            Template ruleTemplate = configuration.getTemplate("rule.ftl");
            Template registryTemplate = configuration.getTemplate("registry.ftl");
            Template contextTemplate = configuration.getTemplate("context.ftl");

            List<Object> childNodes = new ArrayList<>();
            List<Object> addEventNodes = new ArrayList<>();
            List<Object> loadEventNodes = new ArrayList<>();
            List<Object> changeEventNodes = new ArrayList<>();

            for (Map<String, Object> nodeDescription : domainDescription.getNodeList()) {
                try {
                    generateFile(targetDirectory, nodeDescription, nodeTemplate, "", "");
                }catch (RuntimeException ex) {
                    String errorMessage = "Error occurred when generating " + nodeDescription.get("typeName");
                    System.out.println(errorMessage);
                    throw new RuntimeException(errorMessage, ex);
                }
                if (nodeDescription.get("parent") != null && Boolean.FALSE.equals(nodeDescription.get("isAbstract"))) {
                    generateFile(targetDirectory, nodeDescription, nodeFactoryTemplate, "", "Factory");
                    childNodes.add(nodeDescription);
                }

                if (Boolean.TRUE.equals(nodeDescription.get("canLoad"))) {
                    generateFile(targetDirectory, nodeDescription, nodeLoadEventTemplate, "event", "LoadEvent");
                    generateFile(targetDirectory, nodeDescription, nodeUnloadEventTemplate, "event", "UnloadEvent");
                    loadEventNodes.add(nodeDescription);
                }

                if (nodeDescription.get("parent") != null && nodeDescription.get("typeName").equals(((Map<String, Object>) nodeDescription.get("parent")).get("itemTypeName"))) {
                    generateFile(targetDirectory, nodeDescription, nodeAddEventTemplate, "event", "AddEvent");
                    generateFile(targetDirectory, nodeDescription, nodeRemoveEventTemplate, "event", "RemoveEvent");
                    addEventNodes.add(nodeDescription);
                }

                if(nodeDescription.get("valueTypeName") != null && Boolean.TRUE.equals(nodeDescription.get("generateEvent"))) {

                    Map<String, Object> eventDescription = new HashMap<>();
                    eventDescription.put("typeName", nodeDescription.get("valueTypeName"));
                    eventDescription.put("targetPackage", nodeDescription.get("targetPackage"));
                    generateFile(targetDirectory, eventDescription, changeEventTemplate, "event", "StateChangeEvent");
                    changeEventNodes.add(nodeDescription);
                }

                if (nodeDescription.get("parent") == null) {
                    generateFile(targetDirectory, nodeDescription, contextTemplate, "", "Context");
                }


            }

            for (Map<String, Object> ruleDescription : domainDescription.getRuleList()) {
                generateFile(targetDirectory, ruleDescription, ruleTemplate, "rule", "");
            }

            Map<String, Object> registryDescription = domainDescription.getRegistryDescription();
            registryDescription.put("childNodes", childNodes);
            registryDescription.put("addEventNodes", addEventNodes);
            registryDescription.put("loadEventNodes", loadEventNodes);
            registryDescription.put("changeEventNodes", changeEventNodes);
            generateFile(targetDirectory, registryDescription, registryTemplate, "", "ClassRegistry");

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private void generateFile(String targetDirectory, Map<String, ?> data, Template nodeTemplate, String relativePath, String typeSuffix)
            throws IOException, TemplateException {
        Path directory = Paths.get(targetDirectory, relativePath);
        Files.createDirectories(directory);
        String fileName = data.get("typeName") + typeSuffix + ".java";
        Path filePath = directory.resolve(fileName);
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath.toFile())) {
            nodeTemplate.process(data, new OutputStreamWriter(fileOutputStream));
        }
    }

    @SuppressWarnings("unchecked")
    private DomainDescription extractDomain(String defFile) throws IOException {
        Object def = new Yaml().load(new FileInputStream(defFile));
        DomainDescription domainDescription = new DomainDescription();
        domainDescription.load((Map<String, Object>) def);
        return domainDescription;
    }

    private static Configuration createTemplateConfiguration() {
        try {
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
            //todo change to class path based template loader
            File templateDir = new File("C:\\zhy\\code\\neutron\\codegen\\src\\main\\resources\\zhy2002\\neutron\\templates");

            cfg.setDirectoryForTemplateLoading(templateDir);
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
            cfg.setLogTemplateExceptions(false);
            return cfg;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }


}
