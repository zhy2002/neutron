package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class MortgageBreakFeeNode extends BaseCurrencyNode<ExistingMortgageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MortgageBreakFeeNode.class;
    }

    private MortgageBreakFeeNodeComponent component;

    @Inject
    void createComponent(MortgageBreakFeeNodeComponent.Builder builder) {
        this.component = builder.setMortgageBreakFeeNodeModule(new MortgageBreakFeeNodeModule(this)).build();
    }

    @Override
    protected MortgageBreakFeeNodeRuleProvider getRuleProvider() {
        return component.getMortgageBreakFeeNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public MortgageBreakFeeNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
