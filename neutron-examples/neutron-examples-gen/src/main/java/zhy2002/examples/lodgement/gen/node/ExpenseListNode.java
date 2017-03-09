package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private ExpenseListNodeRuleProvider getRuleProvider() {
        return component.getExpenseListNodeRuleProvider();
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

    private RuleProvider<ExpenseListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
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
