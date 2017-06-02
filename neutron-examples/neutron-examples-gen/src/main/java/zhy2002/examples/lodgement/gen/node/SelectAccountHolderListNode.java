package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SelectAccountHolderListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.event.*;


public abstract class SelectAccountHolderListNode<P extends ObjectUiNode<?>> extends ListUiNode<P,SelectAccountHolderNode> {

    protected SelectAccountHolderListNode(P parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    protected abstract SelectAccountHolderListNodeComponent getComponent();


    @Override
    public Class<SelectAccountHolderNode> getItemClass() {
        return SelectAccountHolderNode.class;
    }

    @Override
    public NodeAddEvent<SelectAccountHolderNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        SelectAccountHolderNode item = getComponent().createSelectAccountHolderNode();
        setNameOfChildBeingCreated(null);
        return new SelectAccountHolderNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<SelectAccountHolderNode> createItemRemoveEvent(SelectAccountHolderNode item) {
        return new SelectAccountHolderNodeRemoveEvent(item);
    }

}
