package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class OtherLiabilityAmountOwningNode extends BaseCurrencyNode<OtherLiabilityNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityAmountOwningNode.class;
    }

    private OtherLiabilityAmountOwningNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityAmountOwningNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityAmountOwningNodeModule(new OtherLiabilityAmountOwningNodeModule(this)).build();
    }

    @Override
    protected OtherLiabilityAmountOwningNodeRuleProvider getRuleProvider() {
        return component.getOtherLiabilityAmountOwningNodeRuleProvider();
    }

    public OtherLiabilityAmountOwningNode(@NotNull OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}
