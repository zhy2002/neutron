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
    public MortgageInterestOnlyRemainingPeriodNode(@Owner ExistingMortgageNode parent) {
        super(parent);
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

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
