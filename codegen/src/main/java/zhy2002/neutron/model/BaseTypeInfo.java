package zhy2002.neutron.model;

/**
 * Not mapped from Yaml.
 * This data structure is populated to represent
 * a concrete node type and all its an ancestor node types.
 */
public class BaseTypeInfo {

    /**
     * typeName with wildcard to use in variable declaration.
     */
    private String refName;
    private String typeName;

    BaseTypeInfo(String refName, String typeName) {
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
