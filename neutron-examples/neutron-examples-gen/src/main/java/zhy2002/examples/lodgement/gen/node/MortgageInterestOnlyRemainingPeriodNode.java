package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MortgageInterestOnlyRemainingPeriodNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class MortgageInterestOnlyRemainingPeriodNode extends MonthYearNode<ExistingMortgageNode> {

    @Inject
    public MortgageInterestOnlyRemainingPeriodNode(@Owner ExistingMortgageNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MortgageInterestOnlyRemainingPeriodNode.class;
    }

    protected final MortgageInterestOnlyRemainingPeriodNodeComponent getComponent() {
        return component;
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

}
