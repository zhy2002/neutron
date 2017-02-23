package zhy2002.neutron.data;

public class BaseTypeInfo {

    private String refName;
    private String typeName;

    public BaseTypeInfo(String refName, String typeName) {
        this.refName = refName;
        this.typeName = typeName;
    }

    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
