package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.BaseOtherIncomeListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.event.*;


public abstract class BaseOtherIncomeListNode<P extends ObjectUiNode<?>> extends ListUiNode<P,OtherIncomeNode> {

    public BaseOtherIncomeListNode(P parent, String name) {
        super(parent, name);
    }

    protected abstract BaseOtherIncomeListNodeComponent getComponent();


    @Override
    public Class<OtherIncomeNode> getItemClass() {
        return OtherIncomeNode.class;
    }

    @Override
    public NodeAddEvent<OtherIncomeNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        getContext().setNameOfNodeBeingCreated(name);
        OtherIncomeNode item = getComponent().createOtherIncomeNode();
        getContext().setNameOfNodeBeingCreated(null);
        return new OtherIncomeNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<OtherIncomeNode> createItemRemoveEvent(OtherIncomeNode item) {
        return new OtherIncomeNodeRemoveEvent(item);
    }

}
