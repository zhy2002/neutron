package zhy2002.neutron.data;


import zhy2002.neutron.CodeGenUtil;

import java.util.ArrayList;
import java.util.List;

public class NodeInfo extends CodeGenInfo {

    private String baseTypeName;
    private String itemTypeName;
    private String valueTypeName;
    private String parentBaseTypeName;
    private boolean canLoad;
    private boolean isAbstract;
    private boolean generateEvent;
    private boolean localRequired;
    private List<PropertyInfo> properties;
    private List<RuleInfo> rules;
    private List<InitInfo> init;
    private List<ChildInfo> children;
    private List<NodeInfo> childTypes;
    private List<NodeInfo> moduleChildTypes = new ArrayList<>();
    private List<ValueWrapperInfo> valueWrappers;

    //additional
    private NodeInfo parent;
    private DomainInfo domainInfo;
    private CodeGenInfo changeEventInfo;
    private String parentTypeName;
    private ModuleInfo moduleInfo;

    public String getBaseTypeName() {
        return baseTypeName;
    }

    public void setBaseTypeName(String baseTypeName) {
        this.baseTypeName = baseTypeName;
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

    public List<InitInfo> getInit() {
        return init;
    }

    public void setInit(List<InitInfo> init) {
        this.init = init;
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

    public List<ValueWrapperInfo> getValueWrappers() {
        return valueWrappers;
    }

    public void setValueWrappers(List<ValueWrapperInfo> valueWrappers) {
        this.valueWrappers = valueWrappers;
    }

    public boolean isCanLoad() {
        return canLoad;
    }

    public void setCanLoad(boolean canLoad) {
        this.canLoad = canLoad;
    }

    public boolean isIsAbstract() {
        return isAbstract;
    }

    public void setIsAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }

    public boolean isGenerateEvent() {
        return generateEvent;
    }

    public void setGenerateEvent(boolean generateEvent) {
        this.generateEvent = generateEvent;
    }

    public String getParentBaseTypeName() {
        return parentBaseTypeName;
    }

    public void setParentBaseTypeName(String parentBaseTypeName) {
        this.parentBaseTypeName = parentBaseTypeName;
    }

    public boolean isLocalRequired() {
        return localRequired;
    }

    public void setLocalRequired(boolean localRequired) {
        this.localRequired = localRequired;
    }

    public NodeInfo getParent() {
        return parent;
    }

    public void setParent(NodeInfo parent) {
        this.parent = parent;
    }

    public DomainInfo getDomainInfo() {
        return domainInfo;
    }

    public void setDomainInfo(DomainInfo domainInfo) {
        this.domainInfo = domainInfo;
    }

    public boolean hasFactory() {
        return getParent() != null && !isIsAbstract();
    }

    public boolean isListItem() {
        return getParent() != null && getTypeName().equals(getParent().getItemTypeName());
    }

    public boolean hasChangeEvent() {
        return getValueTypeName() != null && isGenerateEvent();
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

    public void initialize() {
        initializeSelf();
        initializeProperties();
        initializeChildTypes();
        initializeChildren();
        initializeValueWrappers();
        initializeInit();
        initializeRules();
        initializeDomainInfo();
    }

    private void initializeDomainInfo() {
        getDomainInfo().getNodes().add(this);
        if (hasFactory()) {
            getDomainInfo().getRegistryInfo().getChildNodes().add(this);
        }
        if (isCanLoad()) {
            getDomainInfo().getRegistryInfo().getLoadEventNodes().add(this);
        }
        if (isListItem()) {
            getDomainInfo().getRegistryInfo().getAddEventNodes().add(this);
        }
        if (hasChangeEvent()) {
            this.changeEventInfo = new EventInfo();
            changeEventInfo.setDomainInfo(getDomainInfo());
            changeEventInfo.setTypeName(getValueTypeName());
            getDomainInfo().getRegistryInfo().getChangeEventNodes().add(this);
        }
        if (definesModule()) {
            this.moduleInfo = new ModuleInfo();
            moduleInfo.setParent(this);
            moduleInfo.setDomainInfo(getDomainInfo());
            if (getItemTypeName() != null) {
                moduleInfo.setTypeName(getTypeName() + "Item");
                ChildInfo childInfo = new ChildInfo();
                childInfo.setTypeName(getItemTypeName());
                moduleInfo.getExports().add(childInfo);
            } else {
                moduleInfo.setTypeName(getTypeName() + "Child");
                moduleInfo.getExports().addAll(getChildren());
            }
        }
    }

    private void initializeChildTypes() {
        if (getChildTypes() != null) {
            for (NodeInfo nodeInfo : getChildTypes()) {
                nodeInfo.setParent(this);
                nodeInfo.setDomainInfo(getDomainInfo());
                if (!definesChildType(nodeInfo.getBaseTypeName())) {
                    String typeName = getTypeName();
                    if (isIsAbstract() && getParentBaseTypeName() != null) {
                        typeName += "<?>";
                    }
                    nodeInfo.setParentTypeName(typeName);
                }
                nodeInfo.initialize();
                if (nodeInfo.getModuleInfo() != null) {
                    getModuleChildTypes().add(nodeInfo);
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
            if (isIsAbstract() && getBaseTypeName() != null) {
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

    public boolean definesModule() {
        return getChildren() != null || getItemTypeName() != null;
    }

    public CodeGenInfo getModuleInfo() {
        return moduleInfo;
    }

    public List<NodeInfo> getModuleChildTypes() {
        return moduleChildTypes;
    }
}
