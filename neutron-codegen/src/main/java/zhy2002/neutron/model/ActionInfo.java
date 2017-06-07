package zhy2002.neutron.model;

import javax.validation.constraints.NotNull;

public class ActionInfo {

    @NotNull
    private String typeName;
    @NotNull
    private String parameterTypeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getParameterTypeName() {
        return parameterTypeName;
    }

    public void setParameterTypeName(String parameterTypeName) {
        this.parameterTypeName = parameterTypeName;
    }
}
