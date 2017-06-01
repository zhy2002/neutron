package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AverageFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AverageFlagNode extends BooleanUiNode<OwnershipNode> {

    @Inject
    public AverageFlagNode(@Owner OwnershipNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AverageFlagNode.class;
    }

    protected final AverageFlagNodeComponent getComponent() {
        return component;
    }


    private AverageFlagNodeComponent component;

    @Inject
    void createComponent(AverageFlagNodeComponent.Builder builder) {
        this.component = builder.setAverageFlagNodeModule(new AverageFlagNodeModule(this)).build();
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
