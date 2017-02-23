package zhy2002.neutron.model;

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
        return nameAllCaps;
    }

    public void setNameAllCaps(String nameAllCaps) {
        this.nameAllCaps = nameAllCaps;
    }
}
