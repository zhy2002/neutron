package zhy2002.neutron.model;

import javax.validation.Valid;
import java.util.List;

public class ProfileNodeInfo extends CodeGenInfo {
    //region mapped data

    @Valid
    private List<ProfileChildInfo> children;
    @Valid
    private List<ProfileNodeInfo> childTypes;
    @Valid
    private List<InitInfo> init;
    @Valid
    private List<RuleInfo> rules;
    private ProfileInfo profileInfo;

    public List<ProfileChildInfo> getChildren() {
        return children;
    }

    public void setChildren(List<ProfileChildInfo> children) {
        this.children = children;
    }

    public List<ProfileNodeInfo> getChildTypes() {
        return childTypes;
    }

    public void setChildTypes(List<ProfileNodeInfo> childTypes) {
        this.childTypes = childTypes;
    }

    public List<InitInfo> getInit() {
        return init;
    }

    public void setInit(List<InitInfo> init) {
        this.init = init;
    }

    public List<RuleInfo> getRules() {
        return rules;
    }

    public void setRules(List<RuleInfo> rules) {
        this.rules = rules;
    }

    //endregion

    private NodeInfo nodeInfo;

    public NodeInfo getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(NodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public ProfileInfo getProfileInfo() {
        return profileInfo;
    }

    public void setProfileInfo(ProfileInfo profileInfo) {
        this.profileInfo = profileInfo;
    }

    @Override
    void initialize() {
        initializeRules(rules);

        if (getChildren() != null) {
            for (ProfileChildInfo childInfo : getChildren()) {
                childInfo.setDomainInfo(getDomainInfo());
                childInfo.setParentProfileNodeInfo(this);
                childInfo.initialize();
                initializeRules(childInfo.getRules());
            }
        }
    }

    private void initializeRules(List<RuleInfo> rules) {
        if (rules != null) {
            for (RuleInfo ruleInfo : rules) {
                ruleInfo.setDomainInfo(getDomainInfo());
                ruleInfo.setProfileInfo(getProfileInfo());
                ruleInfo.setOwnerType(getNodeInfo());
                ruleInfo.initialize();
            }
        }
    }

    public boolean getHasRuleProvider() {
        return getInit() != null && getInit().size() > 0 || getRules() != null && getRules().size() > 0;
    }

}
