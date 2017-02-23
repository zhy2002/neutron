package zhy2002.neutron.model;


import zhy2002.neutron.CodeGenUtil;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Contains information needed to generate a node.
 * At most one of children, itemTypeName and valueTypeName can be set for a node.
 */
public class NodeInfo extends CodeGenInfo {

    //region mapped data

    @NotNull
    private String baseTypeName;
    private boolean abstractNode;
    /**
     * If this node is abstract and the parent type parameter is open,
     * this is set to the base type of the parent type (P extends ...).
     */
    private String parentBaseTypeName;
    private List<ChildInfo> children;
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
    private List<PropertyInfo> properties;
    private List<InitInfo> init;
    private List<ValueWrapperInfo> valueWrappers;
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
     * typeName with wildcard and no further restriction.
     */
    private String refName;
    private NodeInfo parent;
    private NodeInfo baseType;
    /**
     * parent.typeName plus wildcard for its type parameters if any.
     */
    private String parentTypeName;
    private List<BaseTypeInfo> baseTypes;
    private CodeGenInfo changeEventInfo;
    private List<String> distinctChildTypeNames = new ArrayList<>();

    @Override
    void initialize() {
        initializeSelf();
        initializeProperties();
        initializeChildTypes();
        initializeChildren();
        initializeValueWrappers();
        initializeInit();
        initializeRules();
        initializeDomainInfo();
    }

    public NodeInfo getParent() {
        return parent;
    }

    public void setParent(NodeInfo parent) {
        this.parent = parent;
    }

    public boolean isListItem() {
        return getParent() != null && getTypeName().equals(getParent().getItemTypeName());
    }

    public CodeGenInfo getChangeEventInfo() {
        return changeEventInfo;
    }

    public String getParentTypeName() {
        return parentTypeName;
    }

    public void setParentTypeName(String parentTypeName) {
        this.parentTypeName = parentTypeName;
    }

    public List<String> getDistinctChildTypeNames() {
        return distinctChildTypeNames;
    }

    public void initializeBaseTypes() {
        if (isAbstractNode())
            return;

        baseTypes = new ArrayList<>();
        NodeInfo nodeInfo = this;
        do {
            if (nodeInfo.isAbstractNode() && nodeInfo.getParentBaseTypeName() != null) {
                baseTypes.add(new BaseTypeInfo(nodeInfo.getTypeName() + "<?>", nodeInfo.getTypeName()));
            } else {
                baseTypes.add(new BaseTypeInfo(nodeInfo.getTypeName(), nodeInfo.getTypeName()));
            }

            if (nodeInfo.getBaseType() == null) {
                populateFrameworkTypes(baseTypes, nodeInfo.getBaseTypeName());
                break;
            } else {
                nodeInfo = nodeInfo.getBaseType();
            }
        } while (true);
    }

    private void populateFrameworkTypes(List<BaseTypeInfo> baseTypes, String baseTypeName) {
        //todo do this in a more reliable way
        if (baseTypeName.equals("ListUiNode")) {
            baseTypes.add(new BaseTypeInfo("ListUiNode<?,?>", "ListUiNode"));
        } else if (baseTypeName.equals("ObjectUiNode")) {
            baseTypes.add(new BaseTypeInfo("ObjectUiNode<?>", "ObjectUiNode"));
        } else if (baseTypeName.equals("LeafUiNode")) {
            baseTypes.add(new BaseTypeInfo("LeafUiNode<?,?>", "LeafUiNode"));
        } else if (baseTypeName.equals("StringUiNode")) {
            baseTypes.add(new BaseTypeInfo("StringUiNode<?>", "StringUiNode"));
            baseTypes.add(new BaseTypeInfo("LeafUiNode<?,?>", "LeafUiNode"));
        } else if (baseTypeName.equals("ValidationErrorUiNode")) {
            baseTypes.add(new BaseTypeInfo("ValidationErrorUiNode<?>", "ValidationErrorUiNode"));
            baseTypes.add(new BaseTypeInfo("LeafUiNode<?,?>", "LeafUiNode"));
        } else if (baseTypeName.equals("BooleanUiNode")) {
            baseTypes.add(new BaseTypeInfo("BooleanUiNode<?>", "BooleanUiNode"));
            baseTypes.add(new BaseTypeInfo("LeafUiNode<?,?>", "LeafUiNode"));
        } else if (baseTypeName.equals("BigDecimalUiNode")) {
            baseTypes.add(new BaseTypeInfo("BigDecimalUiNode<?>", "BigDecimalUiNode"));
            baseTypes.add(new BaseTypeInfo("LeafUiNode<?,?>", "LeafUiNode"));
        } else if (baseTypeName.equals("ReferenceUiNode")) {
            baseTypes.add(new BaseTypeInfo("ReferenceUiNode<?>", "ReferenceUiNode"));
            baseTypes.add(new BaseTypeInfo("LeafUiNode<?,?>", "LeafUiNode"));
        } else {
            throw new RuntimeException("Unknown baseType:" + baseTypeName);
        }

        baseTypes.add(new BaseTypeInfo("UiNode<?>", "UiNode"));
    }

    private void initializeDomainInfo() {
        getDomainInfo().getNodes().add(this);
        if (!isAbstractNode()) {
            getDomainInfo().getRegistryInfo().getConcreteNodes().add(this);
        }
        if (isUnloadable()) {
            getDomainInfo().getRegistryInfo().getLoadEventNodes().add(this);
        }
        if (isListItem()) {
            getDomainInfo().getRegistryInfo().getAddEventNodes().add(this);
        }
        if (getValueTypeName() != null) {
            this.changeEventInfo = new EventInfo();
            changeEventInfo.setDomainInfo(getDomainInfo());
            changeEventInfo.setTypeName(getValueTypeName());
            getDomainInfo().getRegistryInfo().getChangeEventNodes().add(this);
        }
    }

    private void initializeChildTypes() {
        Set<String> childTypeNames = new HashSet<>();
        if (getChildTypes() != null) {
            for (NodeInfo nodeInfo : getChildTypes()) {
                nodeInfo.setParent(this);
                nodeInfo.setDomainInfo(getDomainInfo());
                if (!definesChildType(nodeInfo.getBaseTypeName())) {
                    String typeName = getTypeName();
                    if (isAbstractNode() && getParentBaseTypeName() != null) {
                        typeName += "<?>";
                    }
                    nodeInfo.setParentTypeName(typeName);
                }
                nodeInfo.initialize();

                if (!childTypeNames.contains(nodeInfo.getTypeName())) {
                    childTypeNames.add(nodeInfo.getTypeName());
                    getDistinctChildTypeNames().add(nodeInfo.getTypeName());
                }
            }
        }
    }

    private void initializeRules() {
        if (getRules() == null)
            return;

        for (RuleInfo rule : getRules()) {
            if (rule.getBaseTypeName() == null) {
                rule.setBaseTypeName("UiNodeRule");
            }

            String typeName = getTypeName();
            if (isAbstractNode() && getBaseTypeName() != null) {
                typeName += "<?>";
            }
            rule.setParentTypeName(typeName);
            rule.setOwnerTypeName(getTypeName());
            rule.setDomainInfo(getDomainInfo());
        }
    }

    private void initializeInit() {
        if (getInit() != null) {
            for (InitInfo item : init) {
                if (item.getMode() != null) {
                    item.setNameAllCaps(CodeGenUtil.allCaps(item.getPropertyName()));
                }
            }
        }
    }

    private void initializeValueWrappers() {
        if (getValueWrappers() != null) {
            for (ValueWrapperInfo wrapper : getValueWrappers()) {
                if (wrapper.getWrap() == null) {
                    wrapper.setWrap(wrapper.getName());
                }
            }
        }
    }

    private void initializeProperties() {
        if (getProperties() != null) {
            for (PropertyInfo prop : getProperties()) {
                prop.setNameAllCaps(CodeGenUtil.allCaps(prop.getName()));
                if ("int".equals(prop.getExternalTypeName())) {
                    prop.setTypeName("Integer");
                }
                if (prop.getExternalTypeName() == null) {
                    prop.setExternalTypeName(prop.getTypeName());
                }
            }
        }
    }

    private void initializeChildren() {
        if (getChildren() != null) {
            for (ChildInfo child : getChildren()) {
                if (child.getName() == null) {
                    child.setName(CodeGenUtil.firstCharLower(child.getTypeName()));
                }
            }
        }
    }

    private void initializeSelf() {
        if (getBaseTypeName() == null) {
            if (getItemTypeName() != null) {
                setBaseTypeName("ListUiNode");
            } else if (getChildren() != null) {
                setBaseTypeName("ObjectUiNode");
            } else if (getValueTypeName() != null) {
                setBaseTypeName("LeafUiNode");
            }
        }
    }

    private boolean definesChildType(String baseTypeName) {
        if (getChildTypes() == null || getChildTypes().size() == 0)
            return false;

        for (NodeInfo childType : getChildTypes()) {
            if (baseTypeName.equals(childType.getTypeName()))
                return true;
        }

        return false;
    }

    public List<BaseTypeInfo> getBaseTypes() {
        return baseTypes;
    }

    public void setBaseType(NodeInfo baseType) {
        this.baseType = baseType;
    }

    public NodeInfo getBaseType() {
        return baseType;
    }
}
