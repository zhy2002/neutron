package zhy2002.neutron.model;

import zhy2002.neutron.service.CodeGenUtil;

import javax.validation.constraints.NotNull;

public class ActionInfo {

    @NotNull
    private String name;
    @NotNull
    private String parameterTypeName;
    private String nameAllCaps;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAllCaps() {
        if (nameAllCaps == null) {
            nameAllCaps = CodeGenUtil.allCaps(getName());
        }
        return nameAllCaps;
    }

    public String getParameterTypeName() {
        return parameterTypeName;
    }

    public void setParameterTypeName(String parameterTypeName) {
        this.parameterTypeName = parameterTypeName;
    }
}
