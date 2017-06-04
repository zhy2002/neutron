package zhy2002.neutron.model;

import zhy2002.neutron.service.CodeGenUtil;

import javax.validation.constraints.NotNull;

public class PropertyInfo implements Initializable {
    @NotNull
    private String name;
    @NotNull
    private String typeName;
    private String trackingMode;
    private String defaultValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDefault() {
        return defaultValue;
    }

    public void setDefault(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getTrackingMode() {
        return trackingMode;
    }

    public void setTrackingMode(String trackingMode) {
        this.trackingMode = trackingMode;
    }

    ////////////////////////////////////////////////////////

    private String nameAllCaps;
    private String stateTypeName;

    public String getNameAllCaps() {
        return nameAllCaps;
    }

    public String getStateTypeName() {
        return stateTypeName;
    }

    @Override
    public void initialize() {
        nameAllCaps = CodeGenUtil.allCaps(getName());
        stateTypeName = CodeGenUtil.primitiveToWrapperClassName(getTypeName());
    }
}
