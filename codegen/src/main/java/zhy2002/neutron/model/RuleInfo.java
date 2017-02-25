package zhy2002.neutron.model;

public class RuleInfo extends CodeGenInfo {

    private String baseTypeName;

    public String getBaseTypeName() {
        return baseTypeName;
    }

    public void setBaseTypeName(String baseTypeName) {
        this.baseTypeName = baseTypeName;
    }

    ////////////////////////////////////////////////////////

    private NodeInfo ownerType;

    @Override
    void initialize() {
        if (getBaseTypeName() == null) {
            setBaseTypeName("UiNodeRule");
        }
    }

    public NodeInfo getOwnerType() {
        return ownerType;
    }

    void setOwnerType(NodeInfo ownerType) {
        this.ownerType = ownerType;
    }
}
