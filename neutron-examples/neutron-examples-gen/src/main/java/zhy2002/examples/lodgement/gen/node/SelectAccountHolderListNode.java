package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class SelectAccountHolderListNode<P extends ObjectUiNode<?>> extends ListUiNode<P,SelectAccountHolderNode> {

    private SelectAccountHolderListNodeItemFactory itemFactory;

    public SelectAccountHolderListNode(P parent, String name) {
        super(parent, name);
    }

    @Inject
    void receiveNodeProvider(SelectAccountHolderListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public Class<SelectAccountHolderNode> getItemClass() {
        return SelectAccountHolderNode.class;
    }

    @Override
    public NodeAddEvent<SelectAccountHolderNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<SelectAccountHolderNode> createItemRemoveEvent(SelectAccountHolderNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
