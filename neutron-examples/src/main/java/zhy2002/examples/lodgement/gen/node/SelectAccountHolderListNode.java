package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class SelectAccountHolderListNode<P extends ObjectUiNode<?>> extends ListUiNode<P,SelectAccountHolderNode> {

    private SelectAccountHolderListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(SelectAccountHolderListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    protected abstract SelectAccountHolderListNodeRuleProvider<?> getRuleProvider();

    public SelectAccountHolderListNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<SelectAccountHolderNode> getItemClass() {
        return SelectAccountHolderNode.class;
    }

    public NodeAddEvent<SelectAccountHolderNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<SelectAccountHolderNode> createItemRemoveEvent(SelectAccountHolderNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
