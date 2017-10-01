package zhy2002.neutron.model;

import zhy2002.neutron.service.CodeGenUtil;
import zhy2002.neutron.core.util.ValueUtil;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;


/**
 * The root model for a profile.
 */
public class ProfileInfo extends CodeGenInfo {

    @NotNull
    @Valid
    private ProfileNodeInfo rootType;
    @Valid
    private List<ProfileNodeInfo> commonTypes = new ArrayList<>();
    @Valid
    private List<ConfigInfo> config;

    public ProfileNodeInfo getRootType() {
        return rootType;
    }

    public void setRootType(ProfileNodeInfo rootType) {
        this.rootType = rootType;
    }

    public List<ProfileNodeInfo> getCommonTypes() {
        return commonTypes;
    }

    public void setCommonTypes(List<ProfileNodeInfo> commonTypes) {
        this.commonTypes = commonTypes;
    }

    public List<ConfigInfo> getConfig() {
        return config;
    }

    public void setConfig(List<ConfigInfo> config) {
        this.config = config;
    }

    ////////////////////////////////////////////////////////

    private final Map<String, NodeInfo> nodeInfoMap = new HashMap<>();
    private final List<ProfileNodeInfo> allNodes = new ArrayList<>();
    private final List<ProfileChildInfo> configuredChildren = new ArrayList<>();

    public List<ProfileNodeInfo> getAllNodes() {
        return allNodes;
    }

    NodeInfo getNodeInfo(String typeName) {
        return nodeInfoMap.get(typeName);
    }

    public List<ProfileChildInfo> getConfiguredChildren() {
        return configuredChildren;
    }

    @Override
    public void setDomainInfo(DomainInfo domainInfo) {
        super.setDomainInfo(domainInfo);

        domainInfo.getAllNodes().forEach(nodeInfo -> nodeInfoMap.put(nodeInfo.getTypeName(), nodeInfo));
    }

    @Override
    public void initialize() {
        CodeGenUtil.validateMappedData(this);

        addNodes(getRootType());
        ValueUtil.ifNull(getCommonTypes(), Collections.emptyList()).forEach(this::addNodes);
    }

    private void addNodes(ProfileNodeInfo profileNodeInfo) {
        profileNodeInfo.setProfileInfo(this);
        profileNodeInfo.setNodeInfo(getNodeInfo(profileNodeInfo.getTypeName()));
        if (profileNodeInfo.getNodeInfo() == null) {
            raiseError("Node type not declared in the domain: " + profileNodeInfo.getTypeName());
        }
        profileNodeInfo.setDomainInfo(getDomainInfo());
        profileNodeInfo.initialize();
        allNodes.add(profileNodeInfo);

        if (profileNodeInfo.getChildTypes() != null) {
            for (ProfileNodeInfo info : profileNodeInfo.getChildTypes()) {
                addNodes(info);
            }
        }

        if (profileNodeInfo.getChildren() != null) {
            for (ProfileChildInfo childInfo : profileNodeInfo.getChildren()) {
                if (childInfo.getHasRuleProvider()) {
                    configuredChildren.add(childInfo);
                }
            }
        }
    }

}
