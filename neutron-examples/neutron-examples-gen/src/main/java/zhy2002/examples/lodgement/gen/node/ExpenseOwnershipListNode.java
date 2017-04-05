package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ExpenseOwnershipListNode extends OwnershipListNode<ExpenseNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ExpenseOwnershipListNode.class;
    }

    private ExpenseOwnershipListNodeComponent component;

    @Inject
    void createComponent(ExpenseOwnershipListNodeComponent.Builder builder) {
        this.component = builder.setExpenseOwnershipListNodeModule(new ExpenseOwnershipListNodeModule(this)).build();
    }

    private RuleProvider<ExpenseOwnershipListNode> getRuleProvider() {
        return component.getExpenseOwnershipListNodeRuleProvider();
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

    private RuleProvider<ExpenseOwnershipListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public ExpenseOwnershipListNode(@NotNull ExpenseNode parent, String name) {
        super(parent, name);
    }

}
