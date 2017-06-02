package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.FeeAmountNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class FeeAmountNode extends BaseCurrencyNode<ProductFeeNode> {

    @Inject
    protected FeeAmountNode(@Owner ProductFeeNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return FeeAmountNode.class;
    }

    protected final FeeAmountNodeComponent getComponent() {
        return component;
    }


    private FeeAmountNodeComponent component;

    @Inject
    void createComponent(FeeAmountNodeComponent.Builder builder) {
        this.component = builder.setFeeAmountNodeModule(new FeeAmountNodeModule(this)).build();
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
