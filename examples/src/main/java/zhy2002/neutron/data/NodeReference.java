package zhy2002.neutron.data;


public class NodeReference {

    private final String concreteClassName;
    private final String name;

    public NodeReference(String concreteClassName, String name) {
        this.concreteClassName = concreteClassName;
        this.name = name;
    }

    public String getConcreteClassName() {
        return concreteClassName;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NodeReference that = (NodeReference) o;

        if (!concreteClassName.equals(that.concreteClassName)) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = concreteClassName.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
}
