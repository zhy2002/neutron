package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PrimaryApplicantFlagNode extends BooleanUiNode<PersonGeneralNode> {

    private PrimaryApplicantFlagNodeComponent component;

    @Inject
    public PrimaryApplicantFlagNode(@Owner PersonGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PrimaryApplicantFlagNode.class;
    }

    @Inject
    void createComponent(PrimaryApplicantFlagNodeComponent.Builder builder) {
        this.component = builder.setPrimaryApplicantFlagNodeModule(new PrimaryApplicantFlagNodeModule(this)).build();
    }

    private RuleProvider<PrimaryApplicantFlagNode> getRuleProvider() {
        return component.getPrimaryApplicantFlagNodeRuleProvider();
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

    private RuleProvider<PrimaryApplicantFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
