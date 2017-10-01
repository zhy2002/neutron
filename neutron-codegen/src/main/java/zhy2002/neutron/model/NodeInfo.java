package zhy2002.neutron.model;

import zhy2002.neutron.core.util.ValueUtil;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static zhy2002.neutron.model.FrameworkNodes.*;

/**
 * Contains information needed to generate a node.
 * At most one of children, itemTypeName and valueTypeName can be set for a node.
 */
public class NodeInfo extends CodeGenInfo {

    /**
     * The type name where this node is extended from.
     * This can be null if the node is no data mapped, i.e.
     * framework node or generic parameter node.
     */
    @NotNull
    private String baseTypeName;
    /**
     * If this node is abstract and the parent type parameter is open,
     * this is set to the base type of the parent type (i.e. P extends parentBaseTypeName).
     */
    private String parentBaseTypeName;
    private boolean abstractNode;
    @Valid
    private List<ChildInfo> children;
    @Valid
    private List<NodeInfo> childTypes;
    private String itemTypeName;
    private String valueTypeName;
    /**
     * Set this to true if a node can be loaded and unloaded
     * after the node hierarchy is loaded.
     * This switch is designed to avoid unnecessary code generation.
     */
    private boolean unloadable;
    /**
     * If parent has no value the required property
     * always returns false.
     */
    private boolean localRequired;
    @Valid
    private List<PropertyInfo> properties;
    @Valid
    private List<RuleInfo> rules;
    @Valid
    private List<ConfigInfo> config;
    @Valid
    private List<ActionInfo> actions;

    public String getBaseTypeName() {
        return baseTypeName;
    }

    public void setBaseTypeName(String baseTypeName) {
        this.baseTypeName = baseTypeName;
    }

    public void setParentBaseTypeName(String parentBaseTypeName) {
        this.parentBaseTypeName = parentBaseTypeName;
    }

    public boolean isAbstractNode() {
        return abstractNode;
    }

    public void setAbstractNode(boolean abstractNode) {
        this.abstractNode = abstractNode;
    }

    public List<ChildInfo> getChildren() {
        return children;
    }

    public void setChildren(List<ChildInfo> children) {
        this.children = children;
    }

    public List<NodeInfo> getChildTypes() {
        return childTypes;
    }

    public void setChildTypes(List<NodeInfo> childTypes) {
        this.childTypes = childTypes;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    public String getValueTypeName() {
        return valueTypeName;
    }

    public void setValueTypeName(String valueTypeName) {
        this.valueTypeName = valueTypeName;
    }

    public List<PropertyInfo> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyInfo> properties) {
        this.properties = properties;
    }

    public List<RuleInfo> getRules() {
        return rules;
    }

    public void setRules(List<RuleInfo> rules) {
        this.rules = rules;
    }

    public boolean isUnloadable() {
        return unloadable;
    }

    public void setUnloadable(boolean unloadable) {
        this.unloadable = unloadable;
    }

    public boolean isLocalRequired() {
        return localRequired;
    }

    public void setLocalRequired(boolean localRequired) {
        this.localRequired = localRequired;
    }

    public List<ConfigInfo> getConfig() {
        return config;
    }

    public void setConfig(List<ConfigInfo> config) {
        this.config = config;
    }

    public List<ActionInfo> getActions() {
        return actions;
    }

    public void setActions(List<ActionInfo> actions) {
        this.actions = actions;
    }

    ////////////////////////////////////////////////////////

    /**
     * typeName with wildcards (each type parameter is filled in with '?').
     * e.g. UiNode&lt;?&gt;
     */
    private String genericTypeName;
    /**
     * This should be null for the root type.
     */
    private NodeInfo parentType;
    /**
     * The direct base type NodeInfo.
     */
    private NodeInfo baseType;
    private ChangeEventInfo changeEventInfo;
    private final List<NodeInfo> baseTypes = new ArrayList<>();
    private Map<String, ChildInfo> childInfoMap;

    public String getParentBaseTypeName() {
        return parentBaseTypeName;
    }

    public NodeInfo getParentType() {
        return parentType;
    }

    void setParentType(NodeInfo parent) {
        this.parentType = parent;
    }

    public String getGenericTypeName() {
        return genericTypeName;
    }

    void setGenericTypeName(String genericTypeName) {
        this.genericTypeName = genericTypeName;
    }

    public ChangeEventInfo getChangeEventInfo() {
        return changeEventInfo;
    }

    private void setChangeEventInfo(ChangeEventInfo changeEventInfo) {
        this.changeEventInfo = changeEventInfo;
    }

    public List<NodeInfo> getBaseTypes() {
        return baseTypes;
    }

    void setBaseType(NodeInfo baseType) {
        this.baseType = baseType;
    }

    public NodeInfo getBaseType() {
        return baseType;
    }

    public boolean isListItem() {
        return getParentType() != null && getTypeName().equals(getParentType().getItemTypeName());
    }

    public boolean isBaseTypeInDomain() {
        return getDomainInfo().getNodeInfoMap() != null && getDomainInfo().getNodeInfoMap().get(baseTypeName) != null;
    }

    public boolean getHasComponent() {
        return !isAbstractNode() || getChildren() != null && getChildren().size() > 0 || getItemTypeName() != null;
    }

    public ChildInfo getChild(String name) {
        if (childInfoMap != null) {
            return childInfoMap.get(name);
        }

        return null;
    }

    @Override
    public void initialize() {
        initializeSelf();
        initializeProperties();
        initializeChangeEventInfo();
        initializeChildren();
        initializeRules();
        initializeConfig();
    }

    private void initializeSelf() {
        if (getParentType() == null)
            raiseError("parentType is not set");

        if (getChildren() == null && getItemTypeName() == null && getChildTypes() != null && getChildTypes().size() > 0) {
            setChildren(new ArrayList<>());
            getChildTypes().forEach(child -> {
                ChildInfo info = new ChildInfo();
                info.setTypeName(child.getTypeName());
                getChildren().add(info);
            });
        }

        int count = 0;
        if (getItemTypeName() != null) {
            count++;
        }
        if (getChildren() != null) {
            count++;
        }
        if (getValueTypeName() != null) {
            count++;
        }
        if (count > 1) {
            raiseError("Can only set one of [itemTypeName, children, valueItemName]");
        }
    }

    private void initializeProperties() {
        ValueUtil.ifNull(getProperties(), Collections.emptyList()).forEach(PropertyInfo::initialize);
    }

    private void initializeChangeEventInfo() {
        if (getValueTypeName() != null) {
            ChangeEventInfo changeEventInfo = getDomainInfo().getChangeEventInfoMap().get(getValueTypeName());
            if (changeEventInfo == null) {
                changeEventInfo = new ChangeEventInfo();
                changeEventInfo.setDomainInfo(getDomainInfo());
                changeEventInfo.setTypeName(getValueTypeName());
                changeEventInfo.initialize();
            }
            setChangeEventInfo(changeEventInfo);
        }
    }

    private void initializeChildren() {
        if (getChildren() == null)
            return;

        final Map<String, NodeInfo> childTypeMap = ValueUtil.ifNull(getChildTypes(), Collections.emptyList())
                .stream().collect(Collectors.toMap(NodeInfo::getTypeName, Function.identity()));

        childInfoMap = new HashMap<>();
        for (ChildInfo child : getChildren()) {
            child.setDomainInfo(getDomainInfo());
            child.setChildType(childTypeMap.get(child.getTypeName()));
            child.setParentType(this);
            child.initialize();
            childInfoMap.put(child.getName(), child);
        }
    }

    private void initializeRules() {
        ValueUtil.ifNull(getRules(), Collections.emptyList()).forEach(rule -> {
            rule.setDomainInfo(getDomainInfo());
            rule.setOwnerType(this);
            rule.initialize();
        });
    }

    private void initializeConfig() {
        ValueUtil.ifNull(getConfig(), Collections.emptyList()).forEach(configInfo -> {
            if (configInfo.getProperty().startsWith("@")) {
                configInfo.setProperty(".*/" + configInfo.getProperty()); //prepend default child name
            }
        });
    }

    void resolveBaseType(Map<String, NodeInfo> nodeInfoMap) {
        NodeInfo baseType = nodeInfoMap.get(getBaseTypeName());
        if (baseType == null) {
            baseType = FRAMEWORK_NODE_MAP.get(getBaseTypeName());
        }
        if (baseType == null)
            raiseError("Cannot resolve baseType:" + getBaseTypeName());
        else {
            if (!isAbstractNode() && !baseType.isAbstractNode())
                raiseError("Concrete node must be based on abstract node.");
        }

        setBaseType(baseType);
    }

    void resolveBaseTypes() {
        if (isAbstractNode()) //only resolve for concrete nodes
            return;

        NodeInfo nodeInfo = this;
        do {
            getBaseTypes().add(nodeInfo);
            nodeInfo = nodeInfo.getBaseType();
        } while (nodeInfo != null);
    }

    void cleanUp() {
        if (getDomainInfo().getCommonTypes().contains(this)) {
            if (getParentBaseTypeName() == null) {
                if (getBaseTypes().contains(LIST_NODE_INFO)) {
                    setParentBaseTypeName(OBJECT_NODE_INFO.getGenericTypeName());
                } else {
                    setParentBaseTypeName(PARENT_NODE_INFO.getGenericTypeName());
                }
            }
        } else { //cannot have this set
            setParentBaseTypeName(null);
        }

        if (getParentBaseTypeName() != null) {
            setGenericTypeName(getTypeName() + "<?>");
            if (isUnloadable()) {
                raiseError("Abstract nodes cannot be unloadable");
            }
        } else {
            setGenericTypeName(getTypeName());
        }
    }
}
