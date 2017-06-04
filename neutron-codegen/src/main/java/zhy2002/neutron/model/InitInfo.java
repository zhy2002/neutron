package zhy2002.neutron.model;

import zhy2002.neutron.service.CodeGenUtil;

import javax.validation.constraints.NotNull;

public class InitInfo {

    @NotNull
    private String propertyName;
    private String mode;
    private String value;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    ////////////////////////////////////////////////////////

    private String nameAllCaps;

    public String getNameAllCaps() {
        if (nameAllCaps == null) {
            nameAllCaps = CodeGenUtil.allCaps(getPropertyName());
        }
        return nameAllCaps;
    }

    void initialize(CodeGenInfo owner) {
        if (getMode() == null && getValue() == null) {
            owner.raiseError("Must set at least one of mode or value for property init:" + getPropertyName());
        }
    }
}
