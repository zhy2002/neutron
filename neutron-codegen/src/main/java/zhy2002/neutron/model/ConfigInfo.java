package zhy2002.neutron.model;


import javax.validation.constraints.NotNull;

public class ConfigInfo {

    @NotNull
    private String property;
    @NotNull
    private String value;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
