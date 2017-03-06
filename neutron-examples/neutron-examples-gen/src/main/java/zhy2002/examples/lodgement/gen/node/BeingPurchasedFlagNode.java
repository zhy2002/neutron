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

    @Override
    public final Class<?> getConcreteClass() {
        return BeingPurchasedFlagNode.class;
    }

    private BeingPurchasedFlagNodeComponent component;

    @Inject
    void createComponent(BeingPurchasedFlagNodeComponent.Builder builder) {
        this.component = builder.setBeingPurchasedFlagNodeModule(new BeingPurchasedFlagNodeModule(this)).build();
    }

    private BeingPurchasedFlagNodeRuleProvider getRuleProvider() {
        return component.getBeingPurchasedFlagNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public BeingPurchasedFlagNode(@NotNull UsageNode parent, String name) {
        super(parent, name);
    }

}
