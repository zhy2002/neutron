package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private OtherLiabilityAmountOwningNodeRuleProvider getRuleProvider() {
        return component.getOtherLiabilityAmountOwningNodeRuleProvider();
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

    private RuleProvider<OtherLiabilityAmountOwningNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public OtherLiabilityAmountOwningNode(@NotNull OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}
