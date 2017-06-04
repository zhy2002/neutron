package zhy2002.neutron.model;


public class ProfileChildInfo extends ChildInfo {

    private ProfileNodeInfo parentProfileNodeInfo;
    private ChildInfo nodeChildInfo;

    public ProfileNodeInfo getParentProfileNodeInfo() {
        return parentProfileNodeInfo;
    }

    void setParentProfileNodeInfo(ProfileNodeInfo parentProfileNodeInfo) {
        this.parentProfileNodeInfo = parentProfileNodeInfo;
    }

    public ProfileInfo getProfileInfo() {
        return parentProfileNodeInfo.getProfileInfo();
    }

    public ChildInfo getNodeChildInfo() {
        return nodeChildInfo;
    }

    @Override
    public void initialize() {
        super.initialize();

        setParentType(parentProfileNodeInfo.getNodeInfo());
        nodeChildInfo = parentProfileNodeInfo.getNodeInfo().getChild(getName());
        if (nodeChildInfo == null) {
            raiseError("Child name not declared in domain: " + getName());
        }
    }

}
