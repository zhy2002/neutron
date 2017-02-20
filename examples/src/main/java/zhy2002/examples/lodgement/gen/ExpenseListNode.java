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

public class ExpenseListNode extends ListUiNode<FinancialPositionNode,ExpenseNode>
{
    private ExpenseListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(ExpenseListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ExpenseListNode.class;
    }

    public ExpenseListNode(FinancialPositionNode parent, String name) {
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
