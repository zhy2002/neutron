package zhy2002.neutron.model;

import javax.validation.constraints.NotNull;

public class ActionInfo {

    @NotNull
    private String name;
    @NotNull
    private String parameterTypeName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParameterTypeName() {
        return parameterTypeName;
    }

    public void setParameterTypeName(String parameterTypeName) {
        this.parameterTypeName = parameterTypeName;
    }
}
