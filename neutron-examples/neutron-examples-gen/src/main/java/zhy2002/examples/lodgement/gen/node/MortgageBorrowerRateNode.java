package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class MortgageBorrowerRateNode extends BasePercentageNode<ExistingMortgageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MortgageBorrowerRateNode.class;
    }

    private MortgageBorrowerRateNodeComponent component;

    @Inject
    void createComponent(MortgageBorrowerRateNodeComponent.Builder builder) {
        this.component = builder.setMortgageBorrowerRateNodeModule(new MortgageBorrowerRateNodeModule(this)).build();
    }

    @Override
    protected MortgageBorrowerRateNodeRuleProvider getRuleProvider() {
        return component.getMortgageBorrowerRateNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public MortgageBorrowerRateNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
