package zhy2002.neutron.model;

import zhy2002.neutron.core.util.ValueUtil;

import javax.validation.Valid;
import java.util.Collections;
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

    public NodeInfo getOwnerType() {
        return ownerType;
    }

    void setOwnerType(NodeInfo ownerType) {
        this.ownerType = ownerType;
    }

    public ProfileInfo getProfileInfo() {
        return profileInfo;
    }

    void setProfileInfo(ProfileInfo profileInfo) {
        this.profileInfo = profileInfo;
    }

    @Override
    public void initialize() {
        if (getBaseTypeName() == null) {
            setBaseTypeName("UiNodeRule");
        }

        if (ownerType == null) {
            raiseError("ownerType is not set");
        }

        ValueUtil.ifNull(getInit(), Collections.emptyList()).forEach(item -> item.initialize(this));

    }
}
