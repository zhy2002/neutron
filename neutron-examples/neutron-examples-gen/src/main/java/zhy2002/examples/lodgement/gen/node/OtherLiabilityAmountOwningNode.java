package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityAmountOwningNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherLiabilityAmountOwningNode extends BaseCurrencyNode<OtherLiabilityNode> {

    @Inject
    protected OtherLiabilityAmountOwningNode(@Owner OtherLiabilityNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherLiabilityAmountOwningNode.class;
    }

    protected final OtherLiabilityAmountOwningNodeComponent getComponent() {
        return component;
    }


    private OtherLiabilityAmountOwningNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityAmountOwningNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityAmountOwningNodeModule(new OtherLiabilityAmountOwningNodeModule(this)).build();
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
