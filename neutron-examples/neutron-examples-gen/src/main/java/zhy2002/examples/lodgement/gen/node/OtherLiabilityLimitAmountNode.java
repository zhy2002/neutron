package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OtherLiabilityLimitAmountNode extends BaseCurrencyNode<OtherLiabilityNode> {

    private OtherLiabilityLimitAmountNodeComponent component;

    @Inject
    public OtherLiabilityLimitAmountNode(@Owner OtherLiabilityNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherLiabilityLimitAmountNode.class;
    }

    @Inject
    void createComponent(OtherLiabilityLimitAmountNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityLimitAmountNodeModule(new OtherLiabilityLimitAmountNodeModule(this)).build();
    }

    private RuleProvider<OtherLiabilityLimitAmountNode> getRuleProvider() {
        return component.getOtherLiabilityLimitAmountNodeRuleProvider();
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

    private RuleProvider<OtherLiabilityLimitAmountNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
