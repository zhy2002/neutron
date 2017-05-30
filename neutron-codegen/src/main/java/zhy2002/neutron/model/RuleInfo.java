package zhy2002.neutron.model;

import javax.validation.Valid;
import java.util.List;

public class RuleInfo extends CodeGenInfo {

    private String baseTypeName;
    private boolean existing = true;
    @Valid
    private List<InitInfo> init;

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

    public List<InitInfo> getInit() {
        return init;
    }

    public void setInit(List<InitInfo> init) {
        this.init = init;
    }

    ////////////////////////////////////////////////////////

    private NodeInfo ownerType;
    private ProfileInfo profileInfo;

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

    public ProfileInfo getProfileInfo() {
        return profileInfo;
    }

    public void setProfileInfo(ProfileInfo profileInfo) {
        this.profileInfo = profileInfo;
    }
}
