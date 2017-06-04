package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.BeingPurchasedFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class BeingPurchasedFlagNode extends BooleanUiNode<UsageNode> {

    @Inject
    protected BeingPurchasedFlagNode(@Owner UsageNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return BeingPurchasedFlagNode.class;
    }

    protected final BeingPurchasedFlagNodeComponent getComponent() {
        return component;
    }


    private BeingPurchasedFlagNodeComponent component;

    @Inject
    void createComponent(BeingPurchasedFlagNodeComponent.Builder builder) {
        this.component = builder.setBeingPurchasedFlagNodeModule(new BeingPurchasedFlagNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
