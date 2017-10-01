package zhy2002.neutron.model;

import zhy2002.neutron.service.CodeGenUtil;
import zhy2002.neutron.core.util.ValueUtil;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static zhy2002.neutron.model.FrameworkNodes.*;

/**
 * The root model for code gen.
 */
public class DomainInfo extends CodeGenInfo {

    @NotNull
    private String targetPackage;
    @NotNull
    @Valid
    private NodeInfo rootType;
    @Valid
    private List<NodeInfo> commonTypes = new ArrayList<>();
    private Map<String, NodeInfo> nodeInfoMap;

    public DomainInfo() {
        setDomainInfo(this);
    }

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

    public Map<String, NodeInfo> getNodeInfoMap() {
        return nodeInfoMap;
    }

    ////////////////////////////////////////////////////////

    /**
     * All generated nodes.
     */
    private final List<NodeInfo> allNodes = new ArrayList<>();
    private final List<NodeInfo> addEventNodes = new ArrayList<>();
    private final List<NodeInfo> loadEventNodes = new ArrayList<>();
    private final Map<String, ChangeEventInfo> changeEventInfoMap = new HashMap<>();
    private final List<ChildInfo> configuredChildren = new ArrayList<>();

    public List<NodeInfo> getAllNodes() {
        return allNodes;
    }

    public List<NodeInfo> getAddEventNodes() {
        return addEventNodes;
    }

    public List<NodeInfo> getLoadEventNodes() {
        return loadEventNodes;
    }

    public Map<String, ChangeEventInfo> getChangeEventInfoMap() {
        return changeEventInfoMap;
    }

    public Collection<ChangeEventInfo> getChangeEvents() {
        return changeEventInfoMap.values();
    }

    public List<NodeInfo> getConcreteNodes() {
        return allNodes.stream().filter(nodeInfo -> !nodeInfo.isAbstractNode()).collect(Collectors.toList());
    }

    public List<ChildInfo> getConfiguredChildren() {
        return configuredChildren;
    }

    public String getContextName() {
        return getRootType().getTypeName();
    }

    @Override
    public void initialize() {
        CodeGenUtil.validateMappedData(this);

        initializeCommonTypes();
        initializeRootType();
        resolveReferences();
        cleanUp();
    }

    private void initializeCommonTypes() {
        for (NodeInfo nodeInfo : getCommonTypes()) {
            nodeInfo.setParentType(GENERIC_NODE_INFO);
            nodeInfo.setAbstractNode(true);
            addNodes(nodeInfo);
        }
    }

    private void initializeRootType() {
        NodeInfo nodeInfo = getRootType();
        if (!nodeInfo.getBaseTypeName().equals(ROOT_NODE_INFO.getTypeName()))
            raiseError("Root type must extends from RootUiNode");
        nodeInfo.setParentType(VOID_NODE_INFO);
        nodeInfo.setAbstractNode(false);
        nodeInfo.setUnloadable(Boolean.TRUE); //root node must be able to fire load/unload event
        addNodes(nodeInfo);
    }

    private void addNodes(NodeInfo nodeInfo) {
        nodeInfo.setDomainInfo(this);
        nodeInfo.initialize();
        getAllNodes().add(nodeInfo);

        if (nodeInfo.isUnloadable()) {
            getLoadEventNodes().add(nodeInfo);
        }
        if (nodeInfo.isListItem()) {
            getAddEventNodes().add(nodeInfo);
        }
        if (nodeInfo.getChangeEventInfo() != null) {
            getChangeEventInfoMap().put(nodeInfo.getChangeEventInfo().getTypeName(), nodeInfo.getChangeEventInfo());
        }
        ValueUtil.ifNull(nodeInfo.getChildTypes(), Collections.emptyList()).forEach(childNodeInfo -> {
            childNodeInfo.setParentType(nodeInfo);
            addNodes(childNodeInfo);
        });
        ValueUtil.ifNull(nodeInfo.getChildren(), Collections.emptyList()).forEach(childInfo -> {
            if (childInfo.getHasRuleProvider()) {
                getConfiguredChildren().add(childInfo);
            }
        });
    }

    private void resolveReferences() {
        nodeInfoMap = getAllNodes().stream().collect(Collectors.toMap(NodeInfo::getTypeName, Function.identity()));
        getAllNodes().forEach(nodeInfo -> nodeInfo.resolveBaseType(nodeInfoMap));
        getAllNodes().forEach(NodeInfo::resolveBaseTypes); //2nd pass
    }

    private void cleanUp() {
        getAllNodes().forEach(NodeInfo::cleanUp);
    }
}
