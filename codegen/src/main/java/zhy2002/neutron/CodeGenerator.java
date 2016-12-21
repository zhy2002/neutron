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
import java.util.Map;

/**
 * Used to generate a neutron node structure.
 */
public class CodeGenerator {

    private Configuration configuration;
    private String targetDirectory = "C:\\zhy\\tfs\\eLodgeTech\\codegen\\target\\neutron\\";

    public CodeGenerator() {
        configuration = createTemplateConfiguration();
    }

    public void generate(String defFile) {

        try {
            Object root = new Yaml().load(new FileInputStream(defFile));

            Path directory = Paths.get(targetDirectory);
            directory.toFile().delete();
            Files.createDirectories(directory);

            DomainDescription domainDescription = extractDomain(root);
            Template nodeTemplate = configuration.getTemplate("node.ftl");
            for (Map<String, Object> nodeDescription : domainDescription.getNodeList()) {
                generate(nodeDescription, nodeTemplate, "");
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private void generate(Map<String, Object> nodeDescription, Template nodeTemplate, String relativePath)
            throws IOException, TemplateException {
        Path directory = Paths.get(targetDirectory, relativePath);
        Files.createDirectories(directory);
        String fileName = nodeDescription.get("typeName") + ".java";
        Path filePath = directory.resolve(fileName);
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath.toFile())) {
            nodeTemplate.process(nodeDescription, new OutputStreamWriter(fileOutputStream));
        }
    }

    private DomainDescription extractDomain(Object data) {
        DomainDescription domainDescription = new DomainDescription();
        domainDescription.load((Map<String, Object>) data);
        return domainDescription;
    }

    private static Configuration createTemplateConfiguration() {
        try {
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
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
