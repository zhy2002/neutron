package zhy2002.neutron;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Helper class that can load the ftl templates used in code generation.
 */
public class TemplateBundle {

    private final Configuration configuration = createTemplateConfiguration();
    private final Map<String, Template> cache = new HashMap<>();

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

    private Template getTemplate(String name) {
        if (!cache.containsKey(name)) {
            try {
                Template template = configuration.getTemplate(name);
                cache.put(name, template);
            } catch (IOException ex) {
                throw new RuntimeException("Failed to load template: " + name, ex);
            }
        }
        return cache.get(name);
    }

    Template getNodeTemplate() {
        return getTemplate("node.ftl");
    }

    Template getNodeLoadEventTemplate() {
        return getTemplate("load_event.ftl");
    }

    Template getNodeUnloadEventTemplate() {
        return getTemplate("unload_event.ftl");
    }

    Template getNodeAddEventTemplate() {
        return getTemplate("add_event.ftl");
    }

    Template getNodeRemoveEventTemplate() {
        return getTemplate("remove_event.ftl");
    }

    Template getChangeEventTemplate() {
        return getTemplate("change_event.ftl");
    }

    Template getRuleTemplate() {
        return getTemplate("rule.ftl");
    }

    Template getRuleProviderTemplate() {
        return getTemplate("rule_provider.ftl");
    }

    Template getRegistryTemplate() {
        return getTemplate("registry.ftl");
    }

    Template getContextTemplate() {
        return getTemplate("context.ftl");
    }

    Template getItemFactoryTemplate() {
        return getTemplate("item_factory.ftl");
    }

    Template getChildFactoryTemplate() {
        return getTemplate("child_factory.ftl");
    }

    Template getScopeTemplate() {
        return getTemplate("scope.ftl");
    }

    Template getModuleTemplate() {
        return getTemplate("module.ftl");
    }

    Template getComponentTemplate() {
        return getTemplate("component.ftl");
    }

    Template getManifestModuleTemplate() {
        return getTemplate("manifest_module.ftl");
    }

    Template getRulePackageTemplate() {
        return getTemplate("rule_package.ftl");
    }

    Template getProfileModuleTemplate() {
        return getTemplate("profile_module.ftl");
    }

    Template getProfileRuleProviderTemplate() {
        return getTemplate("profile_rule_provider.ftl");
    }

    Template getProfileChildProviderTemplate() {
        return getTemplate("profile_child_factory.ftl");
    }
}
