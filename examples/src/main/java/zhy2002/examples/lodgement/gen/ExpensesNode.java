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

public class ExpensesNode extends ListUiNode<FinancialPositionNode,ExpensesNode,ExpenseNode>
{
    private ExpensesNodeItemFactory itemFactory;

    @Inject
    void receiveProviders(ExpensesNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<ExpensesNode> config = classRegistry.getUiNodeConfig(ExpensesNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public ExpensesNode(FinancialPositionNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<ExpenseNode> getItemClass() {
        return ExpenseNode.class;
    }

    @Override
    protected <M extends ExpenseNode> ExpenseNode createItemNode(Class<M> itemClass, String name) {
        return itemFactory.createExpenseNode(name);
    }



}
