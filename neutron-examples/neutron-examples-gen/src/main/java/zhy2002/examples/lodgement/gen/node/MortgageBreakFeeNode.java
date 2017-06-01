package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MortgageBreakFeeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MortgageBreakFeeNode extends BaseCurrencyNode<ExistingMortgageNode> {

    @Inject
    public MortgageBreakFeeNode(@Owner ExistingMortgageNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MortgageBreakFeeNode.class;
    }

    protected final MortgageBreakFeeNodeComponent getComponent() {
        return component;
    }


    private MortgageBreakFeeNodeComponent component;

    @Inject
    void createComponent(MortgageBreakFeeNodeComponent.Builder builder) {
        this.component = builder.setMortgageBreakFeeNodeModule(new MortgageBreakFeeNodeModule(this)).build();
    }

    private RuleProvider<MortgageBreakFeeNode> getRuleProvider() {
        return component.getMortgageBreakFeeNodeRuleProvider();
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

    private RuleProvider<MortgageBreakFeeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
