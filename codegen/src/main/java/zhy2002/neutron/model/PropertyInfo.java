package zhy2002.neutron.model;

public class PropertyInfo {
    private String name;
    private String typeName;
    private String externalTypeName;
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

    public String getExternalTypeName() {
        return externalTypeName;
    }

    public void setExternalTypeName(String externalTypeName) {
        this.externalTypeName = externalTypeName;
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
