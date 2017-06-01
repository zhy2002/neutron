package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SelectAccountHolderListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.event.*;


public abstract class SelectAccountHolderListNode<P extends ObjectUiNode<?>> extends ListUiNode<P,SelectAccountHolderNode> {

    public SelectAccountHolderListNode(P parent, String name) {
        super(parent, name);
    }

    protected abstract SelectAccountHolderListNodeComponent getComponent();


    @Override
    public Class<SelectAccountHolderNode> getItemClass() {
        return SelectAccountHolderNode.class;
    }

    @Override
    public NodeAddEvent<SelectAccountHolderNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        getContext().setNameOfNodeBeingCreated(name);
        SelectAccountHolderNode item = getComponent().createSelectAccountHolderNode();
        getContext().setNameOfNodeBeingCreated(null);
        return new SelectAccountHolderNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<SelectAccountHolderNode> createItemRemoveEvent(SelectAccountHolderNode item) {
        return new SelectAccountHolderNodeRemoveEvent(item);
    }

}
