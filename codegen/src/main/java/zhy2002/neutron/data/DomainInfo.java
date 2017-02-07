package zhy2002.neutron.data;

import java.util.ArrayList;
import java.util.List;

public class DomainInfo {

    private String targetPackage;
    private NodeInfo rootType;
    private List<NodeInfo> commonTypes = new ArrayList<>();
    private RegistryInfo registryInfo = new RegistryInfo();
    private List<NodeInfo> allNodes = new ArrayList<>();
    ;

    public String getTargetPackage() {
        return targetPackage;
    }

    public void setTargetPackage(String targetPackage) {
        this.targetPackage = targetPackage;
    }

    public NodeInfo getRootType() {
        return rootType;
    }

    public void setRootType(NodeInfo rootType) {
        this.rootType = rootType;
    }

    public List<NodeInfo> getCommonTypes() {
        return commonTypes;
    }

    public void setCommonTypes(List<NodeInfo> commonTypes) {
        this.commonTypes = commonTypes;
    }

    public RegistryInfo getRegistryInfo() {
        return registryInfo;
    }

    public List<NodeInfo> getNodes() {
        return allNodes;
    }

    public String getContextName() {
        return getRootType().getTypeName();
    }

    public void initialize() {
        registryInfo.setTypeName(getContextName());
        registryInfo.setDomainInfo(this);
        getRootType().setParentTypeName("VoidUiNode");
        getRootType().setCanLoad(true);
        getRootType().setDomainInfo(this);

        getRootType().initialize();

        NodeInfo genericParentType = new NodeInfo();
        genericParentType.setTypeName("P");

        for (NodeInfo nodeInfo : commonTypes) {
            String parentBaseTypeName = nodeInfo.getParentBaseTypeName();
            if (nodeInfo.isIsAbstract()) {
                nodeInfo.setParentTypeName("P");
                nodeInfo.setParent(genericParentType);
            } else {
                nodeInfo.setParentTypeName(parentBaseTypeName);
                NodeInfo p = new NodeInfo();
                p.setTypeName(parentBaseTypeName);
                nodeInfo.setParent(p);
            }
            nodeInfo.setIsAbstract(true);
            nodeInfo.setDomainInfo(this);
            nodeInfo.initialize();
        }
    }

}
