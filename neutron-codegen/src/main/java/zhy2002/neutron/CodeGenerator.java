package zhy2002.neutron;

import zhy2002.neutron.model.*;
import zhy2002.neutron.service.CodeGenUtil;
import zhy2002.neutron.service.CodeGenerationService;
import zhy2002.neutron.service.ResourceLoaderService;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

/**
 * The Neutron code generator. One instance is used per execution.
 * Code gen = model + template.
 */
class CodeGenerator {

    private ResourceLoaderService resourceLoaderService = new ResourceLoaderService();
    private CodeGenerationService codeGenerationService = new CodeGenerationService();

    //region generate domain

    void generateDomain(String nodeFile) {
        DomainInfo domainInfo = resourceLoaderService.loadDomainInfo(nodeFile);
        TemplateBundle templateBundle = resourceLoaderService.loadTemplateBundle();
        String targetDirectory = getTargetDirectory(nodeFile);
        CodeGenUtil.clearDirectory(targetDirectory);
        generateDomainFiles(domainInfo, templateBundle, targetDirectory);
    }

    private void generateDomainFiles(DomainInfo domainInfo, TemplateBundle templateBundle, String targetDirectory) {
        for (NodeInfo nodeInfo : domainInfo.getAllNodes()) {
            generateDomainNodeFiles(nodeInfo, templateBundle, targetDirectory);
        }

        for (ChildInfo childInfo : domainInfo.getConfiguredChildren()) {
            generateDomainChildFiles(templateBundle, targetDirectory, childInfo);
        }

        codeGenerationService.generateFile(targetDirectory, "", domainInfo.getRootType(), templateBundle.getContextTemplate(), "", "Context");
        codeGenerationService.generateFile(targetDirectory, "event", domainInfo.getRootType(), templateBundle.getRegistryTemplate(), "", "EventRegistry");
        codeGenerationService.generateFile(targetDirectory, "rule", domainInfo, templateBundle.getRulePackageTemplate(), "package-info");
        codeGenerationService.generateFile(targetDirectory, "di", domainInfo, templateBundle.getManifestModuleTemplate(), "ManifestModule");
    }

    private void generateDomainNodeFiles(NodeInfo nodeInfo, TemplateBundle templateBundle, String targetDirectory) {

        codeGenerationService.generateFile(targetDirectory, "node", nodeInfo, templateBundle.getNodeTemplate());

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

        codeGenerationService.generateFile(targetDirectory, "node", nodeInfo, templateBundle.getRuleProviderTemplate(), "", "RuleProvider");
        generateRules(nodeInfo.getRules(), templateBundle, targetDirectory);

        if (nodeInfo.getHasComponent()) {
            codeGenerationService.generateFile(targetDirectory, "di", nodeInfo, templateBundle.getComponentTemplate(), "", "Component");
        }
        if (!nodeInfo.isAbstractNode()) {
            codeGenerationService.generateFile(targetDirectory, "di", nodeInfo, templateBundle.getModuleTemplate(), "", "Module");
        }
    }

    private void generateDomainChildFiles(TemplateBundle templateBundle, String targetDirectory, ChildInfo childInfo) {
        codeGenerationService.generateFile(
                targetDirectory,
                "node",
                childInfo,
                templateBundle.getChildRuleProviderTemplate(),
                String.format("%sChild%sRuleProvider", childInfo.getParentType().getTypeName(), CodeGenUtil.firstCharUpper(childInfo.getName()))
        );
        generateRules(childInfo.getRules(), templateBundle, targetDirectory);
    }

    //endregion

    //region generate profile

    void generateProfiles(String nodeFile, List<String> ruleFiles) {
        DomainInfo domainInfo = resourceLoaderService.loadDomainInfo(nodeFile);
        TemplateBundle templateBundle = resourceLoaderService.loadTemplateBundle();

        for (String ruleFile : ruleFiles) {
            ProfileInfo profileInfo = resourceLoaderService.loadProfileInfo(ruleFile, domainInfo);
            String targetDirectory = getTargetDirectory(ruleFile);
            CodeGenUtil.clearDirectory(targetDirectory);
            generateProfileFiles(profileInfo, templateBundle, targetDirectory);
        }
    }

    private void generateProfileFiles(ProfileInfo profileInfo, TemplateBundle templateBundle, String targetDirectory) {
        for (ProfileNodeInfo profileNodeInfo : profileInfo.getAllNodes()) {
            generateProfileNodeFiles(profileInfo, templateBundle, targetDirectory, profileNodeInfo);
        }

        for (ProfileChildInfo childInfo : profileInfo.getConfiguredChildren()) {
            generateProfileChildFiles(templateBundle, targetDirectory, childInfo);
        }

        codeGenerationService.generateFile(targetDirectory, "rule", profileInfo, templateBundle.getRulePackageTemplate(), "package-info");
        codeGenerationService.generateFile(targetDirectory, "di", profileInfo, templateBundle.getProfileModuleTemplate(), "", "ProfileModule");
    }

    private void generateProfileNodeFiles(ProfileInfo profileInfo, TemplateBundle templateBundle, String targetDirectory, ProfileNodeInfo profileNodeInfo) {
        if (profileNodeInfo.getHasRuleProvider()) {
            codeGenerationService.generateFile(targetDirectory, "node", profileNodeInfo, templateBundle.getProfileRuleProviderTemplate(), profileInfo.getTypeName(), "RuleProvider");
            generateRules(profileNodeInfo.getRules(), templateBundle, targetDirectory);
        }
    }

    private void generateProfileChildFiles(TemplateBundle templateBundle, String targetDirectory, ProfileChildInfo childInfo) {
        codeGenerationService.generateFile(
                targetDirectory,
                "node",
                childInfo,
                templateBundle.getProfileChildRuleProviderTemplate(),
                String.format("%s%sChild%sRuleProvider", childInfo.getProfileInfo().getTypeName(), childInfo.getParentType().getTypeName(), CodeGenUtil.firstCharUpper(childInfo.getName())));
        generateRules(childInfo.getRules(), templateBundle, targetDirectory);
    }

    //endregion

    private void generateRules(List<RuleInfo> rules, TemplateBundle templateBundle, String targetDirectory) {
        if (rules == null)
            return;

        for (RuleInfo ruleInfo : rules) {
            if (!ruleInfo.isExisting()) {
                codeGenerationService.generateFile(targetDirectory, "rule", ruleInfo, templateBundle.getRuleTemplate());
            }
        }
    }

    private static String getTargetDirectory(String ymlFile) {
        File file = new File(ymlFile);
        return Paths.get(file.getParent(), "gen").toString();
    }

}
