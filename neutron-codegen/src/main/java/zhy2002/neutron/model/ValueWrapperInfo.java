package zhy2002.neutron.model;

import javax.validation.constraints.NotNull;

public class ValueWrapperInfo {

    @NotNull
    private String name;
    @NotNull
    private String typeName;
    private String wrap;
    private boolean jsIgnore;

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

    public String getWrap() {
        return wrap;
    }

    public void setWrap(String wrap) {
        this.wrap = wrap;
    }

    public boolean isJsIgnore() {
        return jsIgnore;
    }

    public void setJsIgnore(boolean jsIgnore) {
        this.jsIgnore = jsIgnore;
    }
}
