package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class MortgageTermRemainingPeriodNode extends StringUiNode<ExistingMortgageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MortgageTermRemainingPeriodNode.class;
    }

    private MortgageTermRemainingPeriodNodeComponent component;

    @Inject
    void createComponent(MortgageTermRemainingPeriodNodeComponent.Builder builder) {
        this.component = builder.setMortgageTermRemainingPeriodNodeModule(new MortgageTermRemainingPeriodNodeModule(this)).build();
    }

    @Override
    protected MortgageTermRemainingPeriodNodeRuleProvider getRuleProvider() {
        return component.getMortgageTermRemainingPeriodNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public MortgageTermRemainingPeriodNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
