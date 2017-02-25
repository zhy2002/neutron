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

public class SavingsOwnershipListNode extends OwnershipListNode<SavingsAccountNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return SavingsOwnershipListNode.class;
    }

    private SavingsOwnershipListNodeComponent component;

    @Inject
    void createComponent(SavingsOwnershipListNodeComponent.Builder builder) {
        this.component = builder.setSavingsOwnershipListNodeModule(new SavingsOwnershipListNodeModule(this)).build();
    }

    @Override
    protected SavingsOwnershipListNodeRuleProvider getRuleProvider() {
        return component.getSavingsOwnershipListNodeRuleProvider();
    }

    public SavingsOwnershipListNode(SavingsAccountNode parent, String name) {
        super(parent, name);
    }

}
