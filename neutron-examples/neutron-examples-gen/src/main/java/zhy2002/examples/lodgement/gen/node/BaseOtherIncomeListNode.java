package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class BaseOtherIncomeListNode<P extends ObjectUiNode<?>> extends ListUiNode<P,OtherIncomeNode> {

    public BaseOtherIncomeListNode(P parent, String name) {
        super(parent, name);
    }

    private BaseOtherIncomeListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(BaseOtherIncomeListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public Class<OtherIncomeNode> getItemClass() {
        return OtherIncomeNode.class;
    }

    @Override
    public NodeAddEvent<OtherIncomeNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<OtherIncomeNode> createItemRemoveEvent(OtherIncomeNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
