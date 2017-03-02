package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
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

    public SavingsOwnershipListNode(@NotNull SavingsAccountNode parent, String name) {
        super(parent, name);
    }

}
