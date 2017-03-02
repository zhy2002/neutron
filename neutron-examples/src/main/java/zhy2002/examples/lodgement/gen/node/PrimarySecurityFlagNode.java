package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PrimarySecurityFlagNode extends BooleanUiNode<UsageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PrimarySecurityFlagNode.class;
    }

    private PrimarySecurityFlagNodeComponent component;

    @Inject
    void createComponent(PrimarySecurityFlagNodeComponent.Builder builder) {
        this.component = builder.setPrimarySecurityFlagNodeModule(new PrimarySecurityFlagNodeModule(this)).build();
    }

    @Override
    protected PrimarySecurityFlagNodeRuleProvider getRuleProvider() {
        return component.getPrimarySecurityFlagNodeRuleProvider();
    }

    public PrimarySecurityFlagNode(@NotNull UsageNode parent, String name) {
        super(parent, name);
    }

}
