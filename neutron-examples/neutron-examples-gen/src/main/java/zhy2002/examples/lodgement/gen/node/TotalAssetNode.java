package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TotalAssetNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TotalAssetNode extends BaseCurrencyNode<FinancialPositionNode> {

    @Inject
    public TotalAssetNode(@Owner FinancialPositionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TotalAssetNode.class;
    }

    protected final TotalAssetNodeComponent getComponent() {
        return component;
    }


    private TotalAssetNodeComponent component;

    @Inject
    void createComponent(TotalAssetNodeComponent.Builder builder) {
        this.component = builder.setTotalAssetNodeModule(new TotalAssetNodeModule(this)).build();
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
