package zhy2002.neutron.model;

import zhy2002.neutron.service.CodeGenUtil;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.util.logging.Logger;

/**
 * Contains information needed to generate a node.
 * At most one of children, itemTypeName and valueTypeName can be set for a node.
 */
public class NodeInfo extends CodeGenInfo {

    private static Logger logger = Logger.getLogger("NodeInfo");
    /**
     * This needs to be kept in sync with the Neutron framework.
     * todo construct this map using DI and reflection.
     */
    static Map<String, NodeInfo> FRAMEWORK_NODE_MAP = new HashMap<>();

    static {
        NodeInfo uiNode = new NodeInfo();
        uiNode.setTypeName("UiNode");
        uiNode.setGenericTypeName("UiNode<?>");
        uiNode.setParentBaseTypeName("ParentUiNode<?>");
        uiNode.setAbstractNode(true);
        uiNode.getBaseTypes().add(uiNode);
        FRAMEWORK_NODE_MAP.put(uiNode.getTypeName(), uiNode);

        NodeInfo parentUiNode = new NodeInfo();
        parentUiNode.setTypeName("ParentUiNode");
        parentUiNode.setGenericTypeName("ParentUiNode<?>");
        parentUiNode.setParentBaseTypeName("ParentUiNode<?>");
        parentUiNode.setBaseType(uiNode);
        parentUiNode.setAbstractNode(true);
        parentUiNode.getBaseTypes().add(parentUiNode);
        parentUiNode.getBaseTypes().add(uiNode);
        FRAMEWORK_NODE_MAP.put(parentUiNode.getTypeName(), parentUiNode);

        NodeInfo listUiNode = new NodeInfo();
        listUiNode.setTypeName("ListUiNode");
        listUiNode.setGenericTypeName("ListUiNode<?,?>");
        listUiNode.setParentBaseTypeName("ObjectUiNode<?>");
        listUiNode.setBaseType(parentUiNode);
        listUiNode.setAbstractNode(true);
        listUiNode.getBaseTypes().add(listUiNode);
        listUiNode.getBaseTypes().add(parentUiNode);
        listUiNode.getBaseTypes().add(uiNode);
        FRAMEWORK_NODE_MAP.put(listUiNode.getTypeName(), listUiNode);

        NodeInfo objectUiNode = new NodeInfo();
        objectUiNode.setTypeName("ObjectUiNode");
        objectUiNode.setGenericTypeName("ObjectUiNode<?>");
        objectUiNode.setParentBaseTypeName("ParentUiNode<?>");
        objectUiNode.setBaseType(parentUiNode);
        objectUiNode.setAbstractNode(true);
        objectUiNode.getBaseTypes().add(objectUiNode);
        objectUiNode.getBaseTypes().add(parentUiNode);
        objectUiNode.getBaseTypes().add(uiNode);
        FRAMEWORK_NODE_MAP.put(objectUiNode.getTypeName(), objectUiNode);

        NodeInfo rootUiNode = new NodeInfo();
        rootUiNode.setTypeName("RootUiNode");
        rootUiNode.setGenericTypeName("RootUiNode<?>");
        rootUiNode.setParentBaseTypeName("ObjectUiNode<?>");
        rootUiNode.setBaseType(objectUiNode);
        rootUiNode.setAbstractNode(true);
        rootUiNode.getBaseTypes().add(rootUiNode);
        rootUiNode.getBaseTypes().add(objectUiNode);
        rootUiNode.getBaseTypes().add(parentUiNode);
        rootUiNode.getBaseTypes().add(uiNode);
        FRAMEWORK_NODE_MAP.put(rootUiNode.getTypeName(), rootUiNode);

        NodeInfo leafUiNode = new NodeInfo();
        leafUiNode.setTypeName("LeafUiNode");
        leafUiNode.setGenericTypeName("LeafUiNode<?,?>");
        leafUiNode.setParentBaseTypeName("ParentUiNode<?>");
        leafUiNode.setBaseType(uiNode);
        leafUiNode.setAbstractNode(true);
        leafUiNode.getBaseTypes().add(leafUiNode);
        leafUiNode.getBaseTypes().add(uiNode);
        FRAMEWORK_NODE_MAP.put(leafUiNode.getTypeName(), leafUiNode);
    }

    //region mapped data

    /**
     * The type name where this node is extended from.
     * This can be null if the node is no data mapped, i.e.
     * framework node or generic parameter node.
     */
    @NotNull
    private String baseTypeName;
    private boolean abstractNode;
    /**
     * If this node is abstract and the parent type parameter is open,
     * this is set to the base type of the parent type (P extends ...).
     */
    private String parentBaseTypeName;
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
    private List<InitInfo> init;
    @Valid
    private List<ValueWrapperInfo> valueWrappers;
    @Valid
    private List<RuleInfo> rules;

    public String getBaseTypeName() {
        return baseTypeName;
    }

    public void setBaseTypeName(String baseTypeName) {
        this.baseTypeName = baseTypeName;
    }

    public boolean isAbstractNode() {
        return abstractNode;
    }

    public void setAbstractNode(boolean abstractNode) {
        this.abstractNode = abstractNode;
    }

    public String getParentBaseTypeName() {
        return parentBaseTypeName;
    }

    public void setParentBaseTypeName(String parentBaseTypeName) {
        this.parentBaseTypeName = parentBaseTypeName;
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

    public List<InitInfo> getInit() {
        return init;
    }

    public void setInit(List<InitInfo> init) {
        this.init = init;
    }

    public List<ValueWrapperInfo> getValueWrappers() {
        return valueWrappers;
    }

    public void setValueWrappers(List<ValueWrapperInfo> valueWrappers) {
        this.valueWrappers = valueWrappers;
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

    //endregion

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
     * This is used to fill in the parent type parameter of baseType,
     * e.g. extends baseTypeName&lt;${parentTypeName}&gt;
     */
    private String parentTypeName;
    /**
     * The direct base type NodeInfo.
     */
    private NodeInfo baseType;
    private CodeGenInfo changeEventInfo;
    private final List<NodeInfo> baseTypes = new ArrayList<>();
    private final Set<String> distinctChildTypeNames = new HashSet<>();

    @Override
    void initialize() {
        initializeSelf();
        initializeProperties();
        initializeChildTypes();
        initializeChildren();
        initializeValueWrappers();
        initializeInit();
        initializeRules();

        updateDomainInfo();
    }

    private void initializeSelf() {

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
            addErrorMessage("Can only set one of itemTypeName, children and valueItemName.");
        }

        if (getParentBaseTypeName() != null) {
            setAbstractNode(true);
        } else {
            if (isAbstractNode()) {
                if (getBaseTypeName().equals("ListUiNode")) {
                    setParentBaseTypeName("ObjectUiNode<?>");
                }
            }
        }

        if (getParentBaseTypeName() != null) {
            setGenericTypeName(getTypeName() + "<?>");
            if (this.isUnloadable()) {
                addErrorMessage("Only concrete nodes can be unloadable.");
            }
        } else {
            setGenericTypeName(getTypeName());
        }
    }

    private void initializeProperties() {
        if (getProperties() == null)
            return;

        for (PropertyInfo prop : getProperties()) {
            prop.setNameAllCaps(CodeGenUtil.allCaps(prop.getName()));
            if ("int".equals(prop.getExternalTypeName())) {
                prop.setTypeName("Integer");
            }
            if (prop.getExternalTypeName() == null) {
                prop.setExternalTypeName(prop.getTypeName());
            }
            if (prop.getTypeName() == null) {
                addErrorMessage("typeName is not set for property: " + prop.getName());
            }
        }
    }

    private void initializeChildTypes() {
        if (getChildTypes() == null)
            return;

        for (NodeInfo nodeInfo : getChildTypes()) {
            nodeInfo.setDomainInfo(getDomainInfo());
            nodeInfo.setParentType(this);
            nodeInfo.initialize();

            getDistinctChildTypeNames().add(nodeInfo.getTypeName());
        }
    }

    private void initializeChildren() {
        if (getChildren() == null)
            return;

        for (ChildInfo child : getChildren()) {
            if (child.getName() == null) {
                child.setName(CodeGenUtil.firstCharLower(child.getTypeName()));
            }
            if (!distinctChildTypeNames.contains(child.getTypeName())) {
                addErrorMessage("No childType found with typeName:" + child.getTypeName());
            }
        }
    }

    private void initializeValueWrappers() {
        if (getValueWrappers() == null)
            return;

        for (ValueWrapperInfo wrapper : getValueWrappers()) {
            if (wrapper.getWrap() == null) {
                wrapper.setWrap(wrapper.getName());
            }
        }
    }

    private void initializeInit() {
        if (getInit() == null)
            return;

        for (InitInfo item : init) {
            if (item.getMode() != null) {
                item.setNameAllCaps(CodeGenUtil.allCaps(item.getPropertyName()));
            }

            if (item.getMode() == null && item.getValue() == null) {
                addErrorMessage("Must set at least one of mode or value for property init:" + item.getPropertyName());
            }
        }
    }

    private void initializeRules() {
        if (getRules() == null)
            return;

        for (RuleInfo rule : getRules()) {
            rule.setDomainInfo(getDomainInfo());
            rule.setOwnerType(this);

            rule.initialize();
        }
    }

    private void addErrorMessage(String message) {
        getDomainInfo().addErrorMessageLine("[" + getTypeName() + "] " + message);
    }

    public String getParentTypeName() {
        return parentTypeName;
    }

    void setParentTypeName(String parentTypeName) {
        this.parentTypeName = parentTypeName;
    }

    public String getGenericTypeName() {
        return genericTypeName;
    }

    void setGenericTypeName(String genericTypeName) {
        this.genericTypeName = genericTypeName;
    }

    public NodeInfo getParentType() {
        return parentType;
    }

    void setParentType(NodeInfo parent) {
        this.parentType = parent;
    }

    public boolean isListItem() {
        return getParentType() != null && getTypeName().equals(getParentType().getItemTypeName());
    }

    public CodeGenInfo getChangeEventInfo() {
        return changeEventInfo;
    }

    private void setChangeEventInfo(CodeGenInfo changeEventInfo) {
        this.changeEventInfo = changeEventInfo;
    }

    public Set<String> getDistinctChildTypeNames() {
        return distinctChildTypeNames;
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

    void resolveBaseTypes() {
        if (getBaseType().getParentBaseTypeName() != null) {
            setParentTypeName(getParentType().getGenericTypeName());
        }

        if (isAbstractNode()) //only resolve for concrete nodes
            return;

        NodeInfo nodeInfo = this;
        do {
            getBaseTypes().add(nodeInfo);
            nodeInfo = nodeInfo.getBaseType();
        } while (nodeInfo != null);
    }

    void populateFrameworkTypes() {
        String baseTypeName = getBaseTypeName();
        NodeInfo frameworkNodeInfo = FRAMEWORK_NODE_MAP.get(baseTypeName);
        if (frameworkNodeInfo == null) {
            frameworkNodeInfo = new NodeInfo();
            frameworkNodeInfo.setTypeName(baseTypeName);
            frameworkNodeInfo.setGenericTypeName(baseTypeName + "<?>");
            frameworkNodeInfo.setParentBaseTypeName("ParentUiNode<?>");
            frameworkNodeInfo.setAbstractNode(true);
            NodeInfo leafUiNode = FRAMEWORK_NODE_MAP.get("LeafUiNode");
            frameworkNodeInfo.setBaseType(leafUiNode);
        }
        setBaseType(frameworkNodeInfo);
    }

    private void updateDomainInfo() {
        getDomainInfo().getAllNodes().add(this);
        if (!isAbstractNode()) {
            getDomainInfo().getConcreteNodes().add(this);
        }
        if (isUnloadable()) {
            getDomainInfo().getLoadEventNodes().add(this);
        }
        if (isListItem()) {
            getDomainInfo().getAddEventNodes().add(this);
        }
        if (getValueTypeName() != null) {
            ChangeEventInfo changeEventInfo = new ChangeEventInfo();
            changeEventInfo.setDomainInfo(getDomainInfo());
            changeEventInfo.setTypeName(getValueTypeName());
            setChangeEventInfo(changeEventInfo);
            getDomainInfo().getChangeEventNodes().add(this);
        }
    }

    public boolean getHasComponent() {
        return !isAbstractNode() || getChildren() != null && getChildren().size() > 0;
    }
}
