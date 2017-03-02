package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class OtherLiabilityLimitAmountNode extends BaseCurrencyNode<OtherLiabilityNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityLimitAmountNode.class;
    }

    private OtherLiabilityLimitAmountNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityLimitAmountNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityLimitAmountNodeModule(new OtherLiabilityLimitAmountNodeModule(this)).build();
    }

    @Override
    protected OtherLiabilityLimitAmountNodeRuleProvider getRuleProvider() {
        return component.getOtherLiabilityLimitAmountNodeRuleProvider();
    }

    public OtherLiabilityLimitAmountNode(@NotNull OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}
