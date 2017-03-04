package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected BeingPurchasedFlagNodeRuleProvider getRuleProvider() {
        return component.getBeingPurchasedFlagNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public BeingPurchasedFlagNode(@NotNull UsageNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setValue(null);
    }

}
