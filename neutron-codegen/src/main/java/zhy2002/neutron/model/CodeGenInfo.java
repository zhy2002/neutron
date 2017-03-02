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

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    ////////////////////////////////////////////////////////

    private DomainInfo domainInfo;

    /**
     * Validate the model and get it into a usable state.
     */
    abstract void initialize();

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
}
