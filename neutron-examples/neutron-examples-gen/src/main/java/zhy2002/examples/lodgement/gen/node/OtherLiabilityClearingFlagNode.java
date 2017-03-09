package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private OtherLiabilityClearingFlagNodeRuleProvider getRuleProvider() {
        return component.getOtherLiabilityClearingFlagNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<OtherLiabilityClearingFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public OtherLiabilityClearingFlagNode(@NotNull OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}
