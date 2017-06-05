package zhy2002.neutron.model;

import zhy2002.neutron.service.CodeGenUtil;
import zhy2002.neutron.util.ValueUtil;

import javax.validation.Valid;
import java.util.*;

public class ProfileNodeInfo extends CodeGenInfo {

    private ProfileInfo profileInfo;
    @Valid
    private List<ProfileChildInfo> children;
    @Valid
    private List<ProfileNodeInfo> childTypes;
    @Valid
    private List<InitInfo> init;
    @Valid
    private List<RuleInfo> rules;
    @Valid
    private List<ConfigInfo> config;

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

    public List<ConfigInfo> getConfig() {
        return config;
    }

    public void setConfig(List<ConfigInfo> config) {
        this.config = config;
    }

    ////////////////////////////////////////////////////////

    private NodeInfo nodeInfo;
    private Set<ChildInfo> notAutoLoadedChildren;

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

    public Set<ChildInfo> getNotAutoLoadedChildren() {
        if (notAutoLoadedChildren == null && nodeInfo.getChildren() != null) {
            Map<String, ChildInfo> map = new HashMap<>();
            nodeInfo.getChildren().forEach(childInfo -> map.put(childInfo.getName(), childInfo));
            if (getChildren() != null) {
                getChildren().forEach(childInfo -> map.remove(childInfo.getName()));
            }
            notAutoLoadedChildren = new HashSet<>(map.values());
        }
        return notAutoLoadedChildren;
    }

    @Override
    public void initialize() {
        initializeInit(getInit());
        initializeRules(getRules());
        initializeConfig();

        if (getChildren() != null) {
            for (ProfileChildInfo childInfo : getChildren()) {
                childInfo.setDomainInfo(getDomainInfo());
                childInfo.setParentProfileNodeInfo(this);
                childInfo.setParentType(this.getNodeInfo());
                childInfo.setChildType(getProfileInfo().getNodeInfo(childInfo.getTypeName()));
                childInfo.initialize();
            }
        }
    }

    private void initializeInit(List<InitInfo> init) {
        ValueUtil.ifNull(init, Collections.emptyList()).forEach(item -> item.initialize(this));
    }

    private void initializeRules(List<RuleInfo> rules) {
        ValueUtil.ifNull(rules, Collections.emptyList()).forEach(rule -> {
            rule.setDomainInfo(getDomainInfo());
            rule.setOwnerType(getNodeInfo());
            rule.initialize();
        });
    }

    private void initializeConfig() {
        ValueUtil.ifNull(getConfig(), Collections.emptyList()).forEach(configInfo -> {
            if (configInfo.getProperty().startsWith("@")) {
                String defaultNodeName = getProfileInfo().getRootType() == this ? "" : CodeGenUtil.firstCharLower(getTypeName());
                configInfo.setProperty(defaultNodeName + "/" + configInfo.getProperty()); //prepend default child name
            }
        });
    }

    public boolean getHasRuleProvider() {
        return getInit() != null && getInit().size() > 0 || getRules() != null && getRules().size() > 0;
    }

}
