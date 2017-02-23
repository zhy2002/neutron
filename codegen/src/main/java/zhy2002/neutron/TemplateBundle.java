package zhy2002.neutron;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.IOException;

/**
 * Load all the ftl templates used in code gen.
 */
class TemplateBundle {

    private final Template nodeTemplate;
    private final Template nodeLoadEventTemplate;
    private final Template nodeUnloadEventTemplate;
    private final Template nodeAddEventTemplate;
    private final Template nodeRemoveEventTemplate;
    private final Template changeEventTemplate;
    private final Template ruleTemplate;
    private final Template ruleProviderTemplate;
    private final Template registryTemplate;
    private final Template contextTemplate;
    private final Template itemFactoryTemplate;
    private final Template childFactoryTemplate;
    private final Template scopeTemplate;
    private final Template moduleTemplate;
    private final Template componentTemplate;
    private final Template manifestModuleTemplate;

    TemplateBundle() {
        Configuration configuration = createTemplateConfiguration();
        try {
            nodeTemplate = configuration.getTemplate("node.ftl");
            nodeLoadEventTemplate = configuration.getTemplate("load_event.ftl");
            nodeUnloadEventTemplate = configuration.getTemplate("unload_event.ftl");
            nodeAddEventTemplate = configuration.getTemplate("add_event.ftl");
            nodeRemoveEventTemplate = configuration.getTemplate("remove_event.ftl");
            changeEventTemplate = configuration.getTemplate("change_event.ftl");
            ruleTemplate = configuration.getTemplate("rule.ftl");
            ruleProviderTemplate = configuration.getTemplate("rule_provider.ftl");
            registryTemplate = configuration.getTemplate("registry.ftl");
            contextTemplate = configuration.getTemplate("context.ftl");
            itemFactoryTemplate = configuration.getTemplate("item_factory.ftl");
            childFactoryTemplate = configuration.getTemplate("child_factory.ftl");
            scopeTemplate = configuration.getTemplate("scope.ftl");
            moduleTemplate = configuration.getTemplate("module.ftl");
            componentTemplate = configuration.getTemplate("component.ftl");
            manifestModuleTemplate = configuration.getTemplate("manifest_module.ftl");

        } catch (IOException ex) {
            throw new RuntimeException("Failed to load one or more templates.", ex);
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

    Template getNodeTemplate() {
        return nodeTemplate;
    }

    Template getNodeLoadEventTemplate() {
        return nodeLoadEventTemplate;
    }

    Template getNodeUnloadEventTemplate() {
        return nodeUnloadEventTemplate;
    }

    Template getNodeAddEventTemplate() {
        return nodeAddEventTemplate;
    }

    Template getNodeRemoveEventTemplate() {
        return nodeRemoveEventTemplate;
    }

    Template getChangeEventTemplate() {
        return changeEventTemplate;
    }

    Template getRuleTemplate() {
        return ruleTemplate;
    }

    Template getRuleProviderTemplate() {
        return ruleProviderTemplate;
    }

    Template getRegistryTemplate() {
        return registryTemplate;
    }

    Template getContextTemplate() {
        return contextTemplate;
    }

    Template getItemFactoryTemplate() {
        return itemFactoryTemplate;
    }

    Template getChildFactoryTemplate() {
        return childFactoryTemplate;
    }

    Template getScopeTemplate() {
        return scopeTemplate;
    }

    Template getModuleTemplate() {
        return moduleTemplate;
    }

    Template getComponentTemplate() {
        return componentTemplate;
    }

    Template getManifestModuleTemplate() {
        return manifestModuleTemplate;
    }
}
