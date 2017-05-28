package zhy2002.neutron;

import zhy2002.neutron.model.*;
import zhy2002.neutron.service.CodeGenUtil;
import zhy2002.neutron.service.CodeGenerationService;
import zhy2002.neutron.service.ResourceLoaderService;

/**
 * The Neutron code generator. One instance is used per execution.
 * Code gen = model + template.
 */
class CodeGenerator {

    private ResourceLoaderService resourceLoaderService = new ResourceLoaderService();
    private CodeGenerationService codeGenerationService = new CodeGenerationService();

    void generateDomain(String definitionFile, String targetDirectory) {
        DomainInfo domainInfo = resourceLoaderService.loadDomainInfo(definitionFile);
        TemplateBundle templateBundle = resourceLoaderService.loadTemplateBundle();
        CodeGenUtil.clearDirectory(targetDirectory);
        generateDomainFiles(domainInfo, templateBundle, targetDirectory);
    }

    void generateProfile(String nodeFile, String ruleFile, String targetDirectory) {
        DomainInfo domainInfo = resourceLoaderService.loadDomainInfo(nodeFile);
        ProfileInfo profileInfo = resourceLoaderService.loadProfileInfo(ruleFile, domainInfo);
        TemplateBundle templateBundle = resourceLoaderService.loadTemplateBundle();
        CodeGenUtil.clearDirectory(targetDirectory);
        generateProfileFiles(profileInfo, templateBundle, targetDirectory);
    }

    private void generateDomainFiles(DomainInfo domainInfo, TemplateBundle templateBundle, String targetDirectory) {
        for (NodeInfo nodeInfo : domainInfo.getAllNodes()) {
            generateNodeFiles(nodeInfo, templateBundle, targetDirectory);
        }

        codeGenerationService.generateFile(targetDirectory, "", domainInfo.getRootType(), templateBundle.getContextTemplate(), "", "Context");
        codeGenerationService.generateFile(targetDirectory, "event", domainInfo.getRootType(), templateBundle.getRegistryTemplate(), "", "EventRegistry");
        codeGenerationService.generateFile(targetDirectory, "rule", domainInfo, templateBundle.getRulePackageTemplate(), "package-info");
        codeGenerationService.generateFile(targetDirectory, "di", domainInfo, templateBundle.getManifestModuleTemplate(), "ManifestModule");
    }

    private void generateNodeFiles(NodeInfo nodeInfo, TemplateBundle templateBundle, String targetDirectory) {

        codeGenerationService.generateFile(targetDirectory, "node", nodeInfo, templateBundle.getNodeTemplate());
        if (nodeInfo.getItemTypeName() != null) {
            codeGenerationService.generateFile(targetDirectory, "node", nodeInfo, templateBundle.getItemFactoryTemplate(), "", "ItemProvider");
        } else if (nodeInfo.getChildren() != null && nodeInfo.getChildren().size() > 0) {
            codeGenerationService.generateFile(targetDirectory, "node", nodeInfo, templateBundle.getChildFactoryTemplate(), "", "ChildProvider");
        }

        if (nodeInfo.isUnloadable()) {
            codeGenerationService.generateFile(targetDirectory, "event", nodeInfo, templateBundle.getNodeLoadEventTemplate(), "", "LoadEvent");
            codeGenerationService.generateFile(targetDirectory, "event", nodeInfo, templateBundle.getNodeUnloadEventTemplate(), "", "UnloadEvent");
        }
        if (nodeInfo.isListItem()) {
            codeGenerationService.generateFile(targetDirectory, "event", nodeInfo, templateBundle.getNodeAddEventTemplate(), "", "AddEvent");
            codeGenerationService.generateFile(targetDirectory, "event", nodeInfo, templateBundle.getNodeRemoveEventTemplate(), "", "RemoveEvent");
        }
        if (nodeInfo.getChangeEventInfo() != null) {
            codeGenerationService.generateFile(targetDirectory, "event", nodeInfo.getChangeEventInfo(), templateBundle.getChangeEventTemplate(), "", "StateChangeEvent");
        }

        if (nodeInfo.getRules() != null) {
            for (RuleInfo ruleInfo : nodeInfo.getRules()) {
                if (!ruleInfo.isExisting()) {
                    codeGenerationService.generateFile(targetDirectory, "rule", ruleInfo, templateBundle.getRuleTemplate());
                }
            }
            if (nodeInfo.getChildren() != null) {
                for (ChildInfo childInfo : nodeInfo.getChildren()) {
                    if (childInfo.getRules() != null) {
                        for (RuleInfo ruleInfo : childInfo.getRules()) {
                            if (!ruleInfo.isExisting()) {
                                codeGenerationService.generateFile(targetDirectory, "rule", ruleInfo, templateBundle.getRuleTemplate());
                            }
                        }
                    }
                }
            }
        }

        codeGenerationService.generateFile(targetDirectory, "di", nodeInfo, templateBundle.getRuleProviderTemplate(), "", "RuleProvider");
        if (!nodeInfo.isAbstractNode()) {
            codeGenerationService.generateFile(targetDirectory, "di", nodeInfo, templateBundle.getScopeTemplate(), "", "Scope");
            codeGenerationService.generateFile(targetDirectory, "di", nodeInfo, templateBundle.getModuleTemplate(), "", "Module");
            codeGenerationService.generateFile(targetDirectory, "di", nodeInfo, templateBundle.getComponentTemplate(), "", "Component");
        }
    }

    private void generateProfileFiles(ProfileInfo profileInfo, TemplateBundle templateBundle, String targetDirectory) {
        codeGenerationService.generateFile(targetDirectory, "rule", profileInfo, templateBundle.getRulePackageTemplate(), "package-info");
        //todo generate rules

        codeGenerationService.generateFile(targetDirectory, "di", profileInfo, templateBundle.getProfileModuleTemplate(), "", "ProfileModule");
        for (NodeProfileInfo nodeProfileInfo : profileInfo.getConfiguredNodes()) {
            codeGenerationService.generateFile(targetDirectory, "di", nodeProfileInfo, templateBundle.getProfileRuleProviderTemplate(), profileInfo.getTypeName(), "RuleProvider");
        }

        for (ChildInfo childInfo : profileInfo.getConfiguredChildren()) {
            //todo generate child rule provider
        }
    }

}
