package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TotalLiabilityNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TotalLiabilityNode extends BaseCurrencyNode<FinancialPositionNode> {

    @Inject
    public TotalLiabilityNode(@Owner FinancialPositionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TotalLiabilityNode.class;
    }

    protected final TotalLiabilityNodeComponent getComponent() {
        return component;
    }


    private TotalLiabilityNodeComponent component;

    @Inject
    void createComponent(TotalLiabilityNodeComponent.Builder builder) {
        this.component = builder.setTotalLiabilityNodeModule(new TotalLiabilityNodeModule(this)).build();
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
