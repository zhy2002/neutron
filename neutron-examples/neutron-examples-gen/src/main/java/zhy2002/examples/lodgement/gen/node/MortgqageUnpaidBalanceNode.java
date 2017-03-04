package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected MortgqageUnpaidBalanceNodeRuleProvider getRuleProvider() {
        return component.getMortgqageUnpaidBalanceNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public MortgqageUnpaidBalanceNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
