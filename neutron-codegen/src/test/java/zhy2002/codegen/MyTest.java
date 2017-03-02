package zhy2002.codegen;


import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import org.junit.Before;
import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class MyTest {

    private Configuration cfg;

    @Before
    public void setup() throws IOException {
        cfg = new Configuration(Configuration.VERSION_2_3_23);
        File templateDir = new File("./src/test/resources/zhy2002/codegen");
        cfg.setDirectoryForTemplateLoading(templateDir);
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
        cfg.setLogTemplateExceptions(false);
    }

    @Test
    public void testYaml() {
        Yaml yaml = new Yaml();
        Object obj = yaml.load("a: 1\nb: 2\nc:\n  - aaa\n  - bbb");
        System.out.println(obj);
    }

    @Test
    public void testFreeMarker() throws IOException, TemplateException {

        // Create the root hash. We use a Map here, but it could be a JavaBean too.
        Map<String, Object> root = new HashMap<>();

// Put string "user" into the root
// Put string "user" into the root
        root.put("user", "Big Joe");

// Create the "latestProduct" hash. We use a JavaBean here, but it could be a Map too.
        Product latest = new Product();
        latest.setUrl("products/greenmouse.html");
        latest.setName("green mouse");
// and put it into the root
        root.put("latestProduct", latest);

        Template temp = cfg.getTemplate("test.ftl");

        Writer out = new OutputStreamWriter(System.out);
        temp.process(root, out);
    }

    @Test
    public void testYamlWithFreeMarker() {
        generateCode("test2.yml", "test2.ftl");
    }

    private void generateCode(String dataFile, String templateFile) {
        Object root = new Yaml().load(this.getClass().getResourceAsStream(dataFile));

        try {
            Template temp = cfg.getTemplate(templateFile);

            Writer out = new OutputStreamWriter(System.out);
            temp.process(root, out);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}


