package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class MortgageInterestOnlyRemainingPeriodNode extends StringUiNode<ExistingMortgageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MortgageInterestOnlyRemainingPeriodNode.class;
    }

    private MortgageInterestOnlyRemainingPeriodNodeComponent component;

    @Inject
    void createComponent(MortgageInterestOnlyRemainingPeriodNodeComponent.Builder builder) {
        this.component = builder.setMortgageInterestOnlyRemainingPeriodNodeModule(new MortgageInterestOnlyRemainingPeriodNodeModule(this)).build();
    }

    @Override
    protected MortgageInterestOnlyRemainingPeriodNodeRuleProvider getRuleProvider() {
        return component.getMortgageInterestOnlyRemainingPeriodNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public MortgageInterestOnlyRemainingPeriodNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
