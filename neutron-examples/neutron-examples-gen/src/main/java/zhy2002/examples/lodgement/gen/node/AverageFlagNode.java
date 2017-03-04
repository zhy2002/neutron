package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class AverageFlagNode extends BooleanUiNode<OwnershipNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return AverageFlagNode.class;
    }

    private AverageFlagNodeComponent component;

    @Inject
    void createComponent(AverageFlagNodeComponent.Builder builder) {
        this.component = builder.setAverageFlagNodeModule(new AverageFlagNodeModule(this)).build();
    }

    @Override
    protected AverageFlagNodeRuleProvider getRuleProvider() {
        return component.getAverageFlagNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public AverageFlagNode(@NotNull OwnershipNode parent, String name) {
        super(parent, name);
    }

}
