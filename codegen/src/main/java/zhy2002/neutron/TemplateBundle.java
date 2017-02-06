package zhy2002.neutron;


import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.IOException;

class TemplateBundle {

    private final Template nodeTemplate;
    private final Template nodeFactoryTemplate;
    private final Template nodeLoadEventTemplate;
    private final Template nodeUnloadEventTemplate;
    private final Template nodeAddEventTemplate;
    private final Template nodeRemoveEventTemplate;
    private final Template changeEventTemplate;
    private final Template ruleTemplate;
    private final Template registryTemplate;
    private final Template contextTemplate;

    TemplateBundle() {
        Configuration configuration = createTemplateConfiguration();
        try {
            nodeTemplate = configuration.getTemplate("node.ftl");
            nodeFactoryTemplate = configuration.getTemplate("node_factory.ftl");
            nodeLoadEventTemplate = configuration.getTemplate("load_event.ftl");
            nodeUnloadEventTemplate = configuration.getTemplate("unload_event.ftl");
            nodeAddEventTemplate = configuration.getTemplate("add_event.ftl");
            nodeRemoveEventTemplate = configuration.getTemplate("remove_event.ftl");
            changeEventTemplate = configuration.getTemplate("change_event.ftl");
            ruleTemplate = configuration.getTemplate("rule.ftl");
            registryTemplate = configuration.getTemplate("registry.ftl");
            contextTemplate = configuration.getTemplate("context.ftl");
        } catch (IOException ex) {
            throw new RuntimeException("Failed to load template.", ex);
        }
    }

    private Configuration createTemplateConfiguration() {
        try {
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
            cfg.setClassForTemplateLoading(getClass(), "templates");
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
            cfg.setLogTemplateExceptions(false);
            return cfg;
        } catch (Exception ex) {
            throw new RuntimeException("Failed to create template configuration.", ex);
        }
    }

    public Template getNodeTemplate() {
        return nodeTemplate;
    }

    public Template getNodeFactoryTemplate() {
        return nodeFactoryTemplate;
    }

    public Template getNodeLoadEventTemplate() {
        return nodeLoadEventTemplate;
    }

    public Template getNodeUnloadEventTemplate() {
        return nodeUnloadEventTemplate;
    }

    public Template getNodeAddEventTemplate() {
        return nodeAddEventTemplate;
    }

    public Template getNodeRemoveEventTemplate() {
        return nodeRemoveEventTemplate;
    }

    public Template getChangeEventTemplate() {
        return changeEventTemplate;
    }

    public Template getRuleTemplate() {
        return ruleTemplate;
    }

    public Template getRegistryTemplate() {
        return registryTemplate;
    }

    public Template getContextTemplate() {
        return contextTemplate;
    }
}
