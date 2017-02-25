package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
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

    public PrimarySecurityFlagNode(UsageNode parent, String name) {
        super(parent, name);
    }

}
