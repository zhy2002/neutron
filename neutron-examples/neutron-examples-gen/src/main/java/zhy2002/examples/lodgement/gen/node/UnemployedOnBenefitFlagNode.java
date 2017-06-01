package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.UnemployedOnBenefitFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class UnemployedOnBenefitFlagNode extends YesNoOptionNode<UnemployedNode> {

    @Inject
    public UnemployedOnBenefitFlagNode(@Owner UnemployedNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return UnemployedOnBenefitFlagNode.class;
    }

    protected final UnemployedOnBenefitFlagNodeComponent getComponent() {
        return component;
    }


    private UnemployedOnBenefitFlagNodeComponent component;

    @Inject
    void createComponent(UnemployedOnBenefitFlagNodeComponent.Builder builder) {
        this.component = builder.setUnemployedOnBenefitFlagNodeModule(new UnemployedOnBenefitFlagNodeModule(this)).build();
    }

    private RuleProvider<UnemployedOnBenefitFlagNode> getRuleProvider() {
        return component.getUnemployedOnBenefitFlagNodeRuleProvider();
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

    private RuleProvider<UnemployedOnBenefitFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
