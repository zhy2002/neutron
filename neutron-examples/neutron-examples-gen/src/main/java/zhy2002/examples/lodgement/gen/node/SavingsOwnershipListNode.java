package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

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

    private RuleProvider<SavingsOwnershipListNode> getRuleProvider() {
        return component.getSavingsOwnershipListNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<SavingsOwnershipListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public SavingsOwnershipListNode(@NotNull SavingsAccountNode parent, String name) {
        super(parent, name);
    }

}
