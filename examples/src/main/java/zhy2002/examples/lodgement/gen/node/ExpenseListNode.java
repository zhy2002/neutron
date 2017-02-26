package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ExpenseListNode extends ListUiNode<FinancialPositionNode,ExpenseNode> {

    private ExpenseListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(ExpenseListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ExpenseListNode.class;
    }

    private ExpenseListNodeComponent component;

    @Inject
    void createComponent(ExpenseListNodeComponent.Builder builder) {
        this.component = builder.setExpenseListNodeModule(new ExpenseListNodeModule(this)).build();
    }

    @Override
    protected ExpenseListNodeRuleProvider getRuleProvider() {
        return component.getExpenseListNodeRuleProvider();
    }

    public ExpenseListNode(@NotNull FinancialPositionNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<ExpenseNode> getItemClass() {
        return ExpenseNode.class;
    }

    public NodeAddEvent<ExpenseNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<ExpenseNode> createItemRemoveEvent(ExpenseNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
