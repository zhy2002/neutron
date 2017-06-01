package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MortgageTermRemainingPeriodNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MortgageTermRemainingPeriodNode extends MonthYearNode<ExistingMortgageNode> {

    @Inject
    public MortgageTermRemainingPeriodNode(@Owner ExistingMortgageNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MortgageTermRemainingPeriodNode.class;
    }

    protected final MortgageTermRemainingPeriodNodeComponent getComponent() {
        return component;
    }


    private MortgageTermRemainingPeriodNodeComponent component;

    @Inject
    void createComponent(MortgageTermRemainingPeriodNodeComponent.Builder builder) {
        this.component = builder.setMortgageTermRemainingPeriodNodeModule(new MortgageTermRemainingPeriodNodeModule(this)).build();
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
