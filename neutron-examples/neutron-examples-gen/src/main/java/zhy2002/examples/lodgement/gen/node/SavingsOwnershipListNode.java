package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SavingsOwnershipListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SavingsOwnershipListNode extends OwnershipListNode<SavingsAccountNode> {

    @Inject
    public SavingsOwnershipListNode(@Owner SavingsAccountNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SavingsOwnershipListNode.class;
    }

    protected final SavingsOwnershipListNodeComponent getComponent() {
        return component;
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

}
