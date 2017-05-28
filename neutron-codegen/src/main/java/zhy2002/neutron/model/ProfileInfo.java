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
    private NodeProfileInfo rootType;
    @Valid
    private List<NodeProfileInfo> commonTypes = new ArrayList<>();

    public NodeProfileInfo getRootType() {
        return rootType;
    }

    public void setRootType(NodeProfileInfo rootType) {
        this.rootType = rootType;
    }

    public List<NodeProfileInfo> getCommonTypes() {
        return commonTypes;
    }

    public void setCommonTypes(List<NodeProfileInfo> commonTypes) {
        this.commonTypes = commonTypes;
    }

    //endregion

    private final Map<String, NodeInfo> nodeInfoMap = new HashMap<>();
    private final List<NodeProfileInfo> configuredNodes = new ArrayList<>();
    private final List<ChildInfo> configuredChildren = new ArrayList<>();

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

        initializeConfiguredNodes();
    }

    private void initializeConfiguredNodes() {
        addConfiguredNodes(getRootType());
        if (getCommonTypes() != null) {
            for (NodeProfileInfo nodeProfileInfo : getCommonTypes()) {
                addConfiguredNodes(nodeProfileInfo);
            }
        }
    }

    private void addConfiguredNodes(NodeProfileInfo nodeProfileInfo) {
        nodeProfileInfo.setProfileInfo(this);
        nodeProfileInfo.setNodeInfo(nodeInfoMap.get(nodeProfileInfo.getTypeName()));
        nodeProfileInfo.setDomainInfo(getDomainInfo());

        if (nodeProfileInfo.getInit() != null || nodeProfileInfo.getRules() != null) {
            configuredNodes.add(nodeProfileInfo);
        }

        if (nodeProfileInfo.getChildTypes() != null) {
            for (NodeProfileInfo info : nodeProfileInfo.getChildTypes()) {
                addConfiguredNodes(info);
            }
        }

        if (nodeProfileInfo.getChildren() != null) {
            for (ChildInfo childInfo : nodeProfileInfo.getChildren()) {
                if (childInfo.getInit() != null || childInfo.getRules() != null) {
                    configuredChildren.add(childInfo);
                }
            }
        }
    }

    public List<NodeProfileInfo> getConfiguredNodes() {
        return configuredNodes;
    }

    public List<ChildInfo> getConfiguredChildren() {
        return configuredChildren;
    }
}
