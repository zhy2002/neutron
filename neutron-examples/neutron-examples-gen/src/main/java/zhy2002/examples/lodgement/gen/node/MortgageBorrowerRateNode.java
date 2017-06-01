package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MortgageBorrowerRateNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class MortgageBorrowerRateNode extends BasePercentageNode<ExistingMortgageNode> {

    @Inject
    public MortgageBorrowerRateNode(@Owner ExistingMortgageNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MortgageBorrowerRateNode.class;
    }

    protected final MortgageBorrowerRateNodeComponent getComponent() {
        return component;
    }


    private MortgageBorrowerRateNodeComponent component;

    @Inject
    void createComponent(MortgageBorrowerRateNodeComponent.Builder builder) {
        this.component = builder.setMortgageBorrowerRateNodeModule(new MortgageBorrowerRateNodeModule(this)).build();
    }

    private RuleProvider<MortgageBorrowerRateNode> getRuleProvider() {
        return component.getMortgageBorrowerRateNodeRuleProvider();
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

    private RuleProvider<MortgageBorrowerRateNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
