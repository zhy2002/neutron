package zhy2002.neutron.data;

public abstract class CodeGenInfo {

    private String typeName;
    private DomainInfo domainInfo;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public DomainInfo getDomainInfo() {
        return domainInfo;
    }

    public void setDomainInfo(DomainInfo domainInfo) {
        this.domainInfo = domainInfo;
    }

    public String getTargetPackage() {
        return getDomainInfo().getTargetPackage();
    }

    public String getContextName() {
        return getDomainInfo().getContextName();
    }
}
