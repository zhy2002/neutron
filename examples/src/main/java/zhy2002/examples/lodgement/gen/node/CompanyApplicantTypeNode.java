package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyApplicantTypeNode extends BaseApplicantTypeNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyApplicantTypeNode.class;
    }

    private CompanyApplicantTypeNodeComponent component;

    @Inject
    void createComponent(CompanyApplicantTypeNodeComponent.Builder builder) {
        this.component = builder.setCompanyApplicantTypeNodeModule(new CompanyApplicantTypeNodeModule(this)).build();
    }

    @Override
    protected CompanyApplicantTypeNodeRuleProvider getRuleProvider() {
        return component.getCompanyApplicantTypeNodeRuleProvider();
    }

    public CompanyApplicantTypeNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}
