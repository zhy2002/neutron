package zhy2002.neutron.model;

import zhy2002.neutron.service.CodeGenUtil;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * The root model for a profile.
 */
public class ProfileInfo extends CodeGenInfo {

    //region mapped data
    @NotNull
    @Valid
    private ProfileNodeInfo rootType;
    @Valid
    private List<ProfileNodeInfo> commonTypes = new ArrayList<>();

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

    //endregion

    private final Map<String, NodeInfo> nodeInfoMap = new HashMap<>();
    private final List<ProfileNodeInfo> allNodes = new ArrayList<>();
    private final List<ProfileChildInfo> configuredChildren = new ArrayList<>();

    @Override
    public void setDomainInfo(DomainInfo domainInfo) {
        super.setDomainInfo(domainInfo);

        domainInfo.getAllNodes().forEach(nodeInfo -> {
            nodeInfoMap.put(nodeInfo.getTypeName(), nodeInfo);
        });
    }

    @Override
    public void initialize() {
        CodeGenUtil.validateMappedData(this);

        initializeNodes();
    }

    private void initializeNodes() {
        addNodes(getRootType());
        if (getCommonTypes() != null) {
            for (ProfileNodeInfo profileNodeInfo : getCommonTypes()) {
                addNodes(profileNodeInfo);
            }
        }
    }

    private void addNodes(ProfileNodeInfo profileNodeInfo) {
        profileNodeInfo.setProfileInfo(this);
        profileNodeInfo.setNodeInfo(nodeInfoMap.get(profileNodeInfo.getTypeName()));
        if (profileNodeInfo.getNodeInfo() == null) {
            throw new RuntimeException("Node type not declared in the domain: " + profileNodeInfo.getTypeName());
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

    public List<ProfileNodeInfo> getAllNodes() {
        return allNodes;
    }

    public List<ProfileChildInfo> getConfiguredChildren() {
        return configuredChildren;
    }
}
