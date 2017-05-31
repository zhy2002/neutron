package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class BeingPurchasedFlagNode extends BooleanUiNode<UsageNode> {
    private BeingPurchasedFlagNodeComponent component;

    public BeingPurchasedFlagNode(@NotNull UsageNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return BeingPurchasedFlagNode.class;
    }

    @Inject
    void createComponent(BeingPurchasedFlagNodeComponent.Builder builder) {
        this.component = builder.setBeingPurchasedFlagNodeModule(new BeingPurchasedFlagNodeModule(this)).build();
    }

    private RuleProvider<BeingPurchasedFlagNode> getRuleProvider() {
        return component.getBeingPurchasedFlagNodeRuleProvider();
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

    private RuleProvider<BeingPurchasedFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
