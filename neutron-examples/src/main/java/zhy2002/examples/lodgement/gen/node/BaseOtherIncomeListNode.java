package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class BaseOtherIncomeListNode<P extends ObjectUiNode<?>> extends ListUiNode<P,OtherIncomeNode> {

    private BaseOtherIncomeListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(BaseOtherIncomeListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    protected abstract BaseOtherIncomeListNodeRuleProvider<?> getRuleProvider();

    public BaseOtherIncomeListNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<OtherIncomeNode> getItemClass() {
        return OtherIncomeNode.class;
    }

    public NodeAddEvent<OtherIncomeNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<OtherIncomeNode> createItemRemoveEvent(OtherIncomeNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setNodeLabel("Other Incomes");
    }

}
