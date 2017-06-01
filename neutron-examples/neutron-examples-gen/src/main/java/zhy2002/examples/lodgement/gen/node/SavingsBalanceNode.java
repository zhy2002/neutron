package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SavingsBalanceNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SavingsBalanceNode extends BaseCurrencyNode<SavingsAccountNode> {

    @Inject
    public SavingsBalanceNode(@Owner SavingsAccountNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SavingsBalanceNode.class;
    }

    protected final SavingsBalanceNodeComponent getComponent() {
        return component;
    }


    private SavingsBalanceNodeComponent component;

    @Inject
    void createComponent(SavingsBalanceNodeComponent.Builder builder) {
        this.component = builder.setSavingsBalanceNodeModule(new SavingsBalanceNodeModule(this)).build();
    }

    private RuleProvider<SavingsBalanceNode> getRuleProvider() {
        return component.getSavingsBalanceNodeRuleProvider();
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

    private RuleProvider<SavingsBalanceNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
