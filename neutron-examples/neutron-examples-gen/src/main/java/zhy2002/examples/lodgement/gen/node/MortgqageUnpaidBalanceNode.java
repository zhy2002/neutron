package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MortgqageUnpaidBalanceNode extends BaseCurrencyNode<ExistingMortgageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MortgqageUnpaidBalanceNode.class;
    }

    private MortgqageUnpaidBalanceNodeComponent component;

    @Inject
    void createComponent(MortgqageUnpaidBalanceNodeComponent.Builder builder) {
        this.component = builder.setMortgqageUnpaidBalanceNodeModule(new MortgqageUnpaidBalanceNodeModule(this)).build();
    }

    private MortgqageUnpaidBalanceNodeRuleProvider getRuleProvider() {
        return component.getMortgqageUnpaidBalanceNodeRuleProvider();
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

    private RuleProvider<MortgqageUnpaidBalanceNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public MortgqageUnpaidBalanceNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
