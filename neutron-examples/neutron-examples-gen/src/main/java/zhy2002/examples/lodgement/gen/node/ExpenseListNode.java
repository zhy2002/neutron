package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ExpenseListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class ExpenseListNode extends ListUiNode<FinancialPositionNode,ExpenseNode> {

    @Inject
    protected ExpenseListNode(@Owner FinancialPositionNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ExpenseListNode.class;
    }

    protected final ExpenseListNodeComponent getComponent() {
        return component;
    }


    private ExpenseListNodeComponent component;

    @Inject
    void createComponent(ExpenseListNodeComponent.Builder builder) {
        this.component = builder.setExpenseListNodeModule(new ExpenseListNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    @Override
    public Class<ExpenseNode> getItemClass() {
        return ExpenseNode.class;
    }

    @Override
    public NodeAddEvent<ExpenseNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        ExpenseNode item = getComponent().createExpenseNode();
        setNameOfChildBeingCreated(null);
        return new ExpenseNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<ExpenseNode> createItemRemoveEvent(ExpenseNode item) {
        return new ExpenseNodeRemoveEvent(item);
    }

}
