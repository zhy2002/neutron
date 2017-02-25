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

public class UsedAsSecurityFlagNode extends BooleanUiNode<UsageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return UsedAsSecurityFlagNode.class;
    }

    private UsedAsSecurityFlagNodeComponent component;

    @Inject
    void createComponent(UsedAsSecurityFlagNodeComponent.Builder builder) {
        this.component = builder.setUsedAsSecurityFlagNodeModule(new UsedAsSecurityFlagNodeModule(this)).build();
    }

    @Override
    protected UsedAsSecurityFlagNodeRuleProvider getRuleProvider() {
        return component.getUsedAsSecurityFlagNodeRuleProvider();
    }

    public UsedAsSecurityFlagNode(UsageNode parent, String name) {
        super(parent, name);
    }

}
