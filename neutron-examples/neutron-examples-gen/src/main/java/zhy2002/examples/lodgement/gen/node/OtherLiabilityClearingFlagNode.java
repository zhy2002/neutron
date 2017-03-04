package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class OtherLiabilityClearingFlagNode extends BooleanUiNode<OtherLiabilityNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityClearingFlagNode.class;
    }

    private OtherLiabilityClearingFlagNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityClearingFlagNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityClearingFlagNodeModule(new OtherLiabilityClearingFlagNodeModule(this)).build();
    }

    @Override
    protected OtherLiabilityClearingFlagNodeRuleProvider getRuleProvider() {
        return component.getOtherLiabilityClearingFlagNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public OtherLiabilityClearingFlagNode(@NotNull OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}
