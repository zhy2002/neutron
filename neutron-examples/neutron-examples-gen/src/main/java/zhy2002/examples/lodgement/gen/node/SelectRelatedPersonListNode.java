package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SelectRelatedPersonListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.event.*;


public abstract class SelectRelatedPersonListNode<P extends ObjectUiNode<?>> extends ListUiNode<P,SelectRelatedPersonNode> {

    protected SelectRelatedPersonListNode(P parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    protected abstract SelectRelatedPersonListNodeComponent getComponent();


    @Override
    public Class<SelectRelatedPersonNode> getItemClass() {
        return SelectRelatedPersonNode.class;
    }

    @Override
    public NodeAddEvent<SelectRelatedPersonNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        SelectRelatedPersonNode item = getComponent().createSelectRelatedPersonNode();
        setNameOfChildBeingCreated(null);
        return new SelectRelatedPersonNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<SelectRelatedPersonNode> createItemRemoveEvent(SelectRelatedPersonNode item) {
        return new SelectRelatedPersonNodeRemoveEvent(item);
    }

}
