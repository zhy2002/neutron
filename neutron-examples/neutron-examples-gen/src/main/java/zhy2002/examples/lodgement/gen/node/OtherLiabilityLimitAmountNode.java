package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private OtherLiabilityLimitAmountNodeRuleProvider getRuleProvider() {
        return component.getOtherLiabilityLimitAmountNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public OtherLiabilityLimitAmountNode(@NotNull OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}
