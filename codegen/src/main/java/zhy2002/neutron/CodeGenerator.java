package zhy2002.neutron;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import org.yaml.snakeyaml.Yaml;
import zhy2002.neutron.data.DomainDescription;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Used to generate a neutron node structure.
 */
public class CodeGenerator {

    private Configuration configuration;

    public CodeGenerator() {
        configuration = createTemplateConfiguration();
    }

    public void generate(String defFile, String targetDirectory) {

        try {
            Object root = new Yaml().load(new FileInputStream(defFile));

            Path directory = Paths.get(targetDirectory);
            if (deleteDir(directory.toFile())) {
                Files.createDirectories(directory);
            } else {
                throw new RuntimeException("Cannot delete generated directory: " + directory);
            }

            DomainDescription domainDescription = extractDomain(root);

            Template nodeTemplate = configuration.getTemplate("node.ftl");
            Template nodeFactoryTemplate = configuration.getTemplate("node_factory.ftl");
            Template nodeLoadEventTemplate = configuration.getTemplate("load_event.ftl");
            Template nodeUnloadEventTemplate = configuration.getTemplate("unload_event.ftl");
            Template nodeAddEventTemplate = configuration.getTemplate("add_event.ftl");
            Template nodeRemoveEventTemplate = configuration.getTemplate("remove_event.ftl");
            Template contextTemplate = configuration.getTemplate("context.ftl");

            List<Object> childNodes = new ArrayList<>();
            List<Object> addEventNodes = new ArrayList<>();
            List<Object> loadEventNodes = new ArrayList<>();

            for (Map<String, Object> nodeDescription : domainDescription.getNodeList()) {
                generate(targetDirectory, nodeDescription, nodeTemplate, "");
                if (nodeDescription.get("parent") != null && Boolean.FALSE.equals(nodeDescription.get("isAbstract"))) {
                    generate(targetDirectory, nodeDescription, nodeFactoryTemplate, "", "Factory");
                    childNodes.add(nodeDescription);
                }

                if (Boolean.TRUE.equals(nodeDescription.get("canLoad"))) {
                    generate(targetDirectory, nodeDescription, nodeLoadEventTemplate, "event", "LoadEvent");
                    generate(targetDirectory, nodeDescription, nodeUnloadEventTemplate, "event", "UnloadEvent");
                    loadEventNodes.add(nodeDescription);
                }

                if (nodeDescription.get("parent") != null && nodeDescription.get("typeName").equals(((Map<String, Object>) nodeDescription.get("parent")).get("itemTypeName"))) {
                    generate(targetDirectory, nodeDescription, nodeAddEventTemplate, "event", "AddEvent");
                    generate(targetDirectory, nodeDescription, nodeRemoveEventTemplate, "event", "RemoveEvent");
                    addEventNodes.add(nodeDescription);
                }

                if (nodeDescription.get("parent") == null) {
                    generate(targetDirectory, nodeDescription, contextTemplate, "", "Context");
                }
            }

            domainDescription.addRegistryList("childNodes", childNodes);
            domainDescription.addRegistryList("addEventNodes", addEventNodes);
            domainDescription.addRegistryList("loadEventNodes", loadEventNodes);

            Template registryTemplate = configuration.getTemplate("registry.ftl");
            generate(targetDirectory, domainDescription.getRegistryDescription(), registryTemplate, "", "ClassRegistry");

            Template ruleTemplate = configuration.getTemplate("rule.ftl");
            for (Map<String, Object> ruleDescription : domainDescription.getRuleList()) {
                generate(targetDirectory, ruleDescription, ruleTemplate, "rule");
            }

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private void generate(String targetDirectory, Map<String, Object> description, Template template, String relativePath)
            throws IOException, TemplateException {
        generate(targetDirectory, description, template, relativePath, "");
    }

    private void generate(String targetDirectory, Map<String, ?> nodeDescription, Template nodeTemplate, String relativePath, String typeSuffix)
            throws IOException, TemplateException {
        Path directory = Paths.get(targetDirectory, relativePath);
        Files.createDirectories(directory);
        String fileName = nodeDescription.get("typeName") + typeSuffix + ".java";
        Path filePath = directory.resolve(fileName);
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath.toFile())) {
            nodeTemplate.process(nodeDescription, new OutputStreamWriter(fileOutputStream));
        }
    }

    @SuppressWarnings("unchecked")
    private DomainDescription extractDomain(Object data) {
        DomainDescription domainDescription = new DomainDescription();
        domainDescription.load((Map<String, Object>) data);
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


    private static boolean deleteDir(File file) {
        if (!file.exists())
            return true;

        File[] contents = file.listFiles();
        if (contents != null) {
            for (File f : contents) {
                if (!deleteDir(f))
                    return false;
            }
        }
        return file.delete();
    }
}
