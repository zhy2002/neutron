package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MortgageBreakFeeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MortgageBreakFeeNode extends BaseCurrencyNode<ExistingMortgageNode> {

    @Inject
    protected MortgageBreakFeeNode(@Owner ExistingMortgageNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MortgageBreakFeeNode.class;
    }

    protected final MortgageBreakFeeNodeComponent getComponent() {
        return component;
    }


    private MortgageBreakFeeNodeComponent component;

    @Inject
    void createComponent(MortgageBreakFeeNodeComponent.Builder builder) {
        this.component = builder.setMortgageBreakFeeNodeModule(new MortgageBreakFeeNodeModule(this)).build();
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
