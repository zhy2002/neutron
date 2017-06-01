package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MortgageMonthlyRepaymentNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MortgageMonthlyRepaymentNode extends BaseCurrencyNode<ExistingMortgageNode> {

    @Inject
    public MortgageMonthlyRepaymentNode(@Owner ExistingMortgageNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MortgageMonthlyRepaymentNode.class;
    }

    protected final MortgageMonthlyRepaymentNodeComponent getComponent() {
        return component;
    }


    private MortgageMonthlyRepaymentNodeComponent component;

    @Inject
    void createComponent(MortgageMonthlyRepaymentNodeComponent.Builder builder) {
        this.component = builder.setMortgageMonthlyRepaymentNodeModule(new MortgageMonthlyRepaymentNodeModule(this)).build();
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
