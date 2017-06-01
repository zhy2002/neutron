package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityLimitAmountNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherLiabilityLimitAmountNode extends BaseCurrencyNode<OtherLiabilityNode> {

    @Inject
    public OtherLiabilityLimitAmountNode(@Owner OtherLiabilityNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherLiabilityLimitAmountNode.class;
    }

    protected final OtherLiabilityLimitAmountNodeComponent getComponent() {
        return component;
    }


    private OtherLiabilityLimitAmountNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityLimitAmountNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityLimitAmountNodeModule(new OtherLiabilityLimitAmountNodeModule(this)).build();
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
