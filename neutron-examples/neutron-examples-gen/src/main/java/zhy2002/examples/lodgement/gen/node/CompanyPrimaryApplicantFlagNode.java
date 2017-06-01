package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyPrimaryApplicantFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyPrimaryApplicantFlagNode extends BooleanUiNode<CompanyGeneralNode> {

    @Inject
    public CompanyPrimaryApplicantFlagNode(@Owner CompanyGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyPrimaryApplicantFlagNode.class;
    }

    protected final CompanyPrimaryApplicantFlagNodeComponent getComponent() {
        return component;
    }


    private CompanyPrimaryApplicantFlagNodeComponent component;

    @Inject
    void createComponent(CompanyPrimaryApplicantFlagNodeComponent.Builder builder) {
        this.component = builder.setCompanyPrimaryApplicantFlagNodeModule(new CompanyPrimaryApplicantFlagNodeModule(this)).build();
    }

    private RuleProvider<CompanyPrimaryApplicantFlagNode> getRuleProvider() {
        return component.getCompanyPrimaryApplicantFlagNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<CompanyPrimaryApplicantFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
