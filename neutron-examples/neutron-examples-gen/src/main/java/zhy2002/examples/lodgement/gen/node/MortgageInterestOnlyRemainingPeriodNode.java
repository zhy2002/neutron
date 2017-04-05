package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private RuleProvider<MortgageInterestOnlyRemainingPeriodNode> getRuleProvider() {
        return component.getMortgageInterestOnlyRemainingPeriodNodeRuleProvider();
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

    private RuleProvider<MortgageInterestOnlyRemainingPeriodNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public MortgageInterestOnlyRemainingPeriodNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
