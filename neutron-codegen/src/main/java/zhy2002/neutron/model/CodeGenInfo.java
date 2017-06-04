package zhy2002.neutron.model;

import javax.validation.constraints.NotNull;

/**
 * The minimum required information to be passed to
 * a ftl template.
 */
public abstract class CodeGenInfo {

    @NotNull
    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public final void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    ////////////////////////////////////////////////////////

    private DomainInfo domainInfo;

    public DomainInfo getDomainInfo() {
        return domainInfo;
    }

    void setDomainInfo(DomainInfo domainInfo) {
        this.domainInfo = domainInfo;
    }

    public String getTargetPackage() {
        return getDomainInfo().getTargetPackage();
    }

    public String getContextName() {
        return getDomainInfo().getContextName();
    }

    public void initialize() {
        if (domainInfo == null) {
            raiseError("domainInfo is not set");
        }
    }

    void raiseError(String message) {
        throw new RuntimeException(String.format(
                "Error in %s with type name %s: %s",
                this.getClass().getSimpleName(),
                getTypeName(),
                message
        ));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CodeGenInfo that = (CodeGenInfo) o;

        return typeName.equals(that.typeName);
    }

    @Override
    public int hashCode() {
        return typeName.hashCode();
    }
}
