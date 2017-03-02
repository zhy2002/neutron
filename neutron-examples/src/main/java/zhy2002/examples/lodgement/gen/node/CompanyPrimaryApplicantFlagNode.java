package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyPrimaryApplicantFlagNode extends BooleanUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyPrimaryApplicantFlagNode.class;
    }

    private CompanyPrimaryApplicantFlagNodeComponent component;

    @Inject
    void createComponent(CompanyPrimaryApplicantFlagNodeComponent.Builder builder) {
        this.component = builder.setCompanyPrimaryApplicantFlagNodeModule(new CompanyPrimaryApplicantFlagNodeModule(this)).build();
    }

    @Override
    protected CompanyPrimaryApplicantFlagNodeRuleProvider getRuleProvider() {
        return component.getCompanyPrimaryApplicantFlagNodeRuleProvider();
    }

    public CompanyPrimaryApplicantFlagNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}
