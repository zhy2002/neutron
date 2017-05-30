package zhy2002.neutron.model;

import zhy2002.neutron.service.CodeGenUtil;

import javax.validation.Valid;
import java.util.List;

public class NodeProfileInfo extends CodeGenInfo {
    //region mapped data

    @Valid
    private List<ChildInfo> children;
    @Valid
    private List<NodeProfileInfo> childTypes;
    @Valid
    private List<InitInfo> init;
    @Valid
    private List<RuleInfo> rules;
    private ProfileInfo profileInfo;

    public List<ChildInfo> getChildren() {
        return children;
    }

    public void setChildren(List<ChildInfo> children) {
        this.children = children;
    }

    public List<NodeProfileInfo> getChildTypes() {
        return childTypes;
    }

    public void setChildTypes(List<NodeProfileInfo> childTypes) {
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
            for (ChildInfo childInfo : getChildren()) {
                if (childInfo.getName() == null) {
                    childInfo.setName(CodeGenUtil.firstCharLower(childInfo.getTypeName()));
                }
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


}
