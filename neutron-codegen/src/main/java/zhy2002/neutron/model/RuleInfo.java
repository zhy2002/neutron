package zhy2002.neutron.model;

public class RuleInfo extends CodeGenInfo {

    private String baseTypeName;
    private boolean existing;

    public String getBaseTypeName() {
        return baseTypeName;
    }

    public void setBaseTypeName(String baseTypeName) {
        this.baseTypeName = baseTypeName;
    }

    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
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
