package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class OwnedOutrightFlagNode extends BooleanUiNode<UsageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OwnedOutrightFlagNode.class;
    }

    private OwnedOutrightFlagNodeComponent component;

    @Inject
    void createComponent(OwnedOutrightFlagNodeComponent.Builder builder) {
        this.component = builder.setOwnedOutrightFlagNodeModule(new OwnedOutrightFlagNodeModule(this)).build();
    }

    @Override
    protected OwnedOutrightFlagNodeRuleProvider getRuleProvider() {
        return component.getOwnedOutrightFlagNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public OwnedOutrightFlagNode(@NotNull UsageNode parent, String name) {
        super(parent, name);
    }

}
