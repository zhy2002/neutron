package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityClearingFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherLiabilityClearingFlagNode extends BooleanUiNode<OtherLiabilityNode> {

    @Inject
    protected OtherLiabilityClearingFlagNode(@Owner OtherLiabilityNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherLiabilityClearingFlagNode.class;
    }

    protected final OtherLiabilityClearingFlagNodeComponent getComponent() {
        return component;
    }


    private OtherLiabilityClearingFlagNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityClearingFlagNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityClearingFlagNodeModule(new OtherLiabilityClearingFlagNodeModule(this)).build();
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
