package zhy2002.neutron.model;


import javax.validation.constraints.NotNull;

public class ChildInfo {

    private String name;
    @NotNull
    private String typeName;

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
}
