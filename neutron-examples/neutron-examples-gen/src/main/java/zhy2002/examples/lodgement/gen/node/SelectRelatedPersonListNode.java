package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class SelectRelatedPersonListNode<P extends ObjectUiNode<?>> extends ListUiNode<P,SelectRelatedPersonNode> {

    private SelectRelatedPersonListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(SelectRelatedPersonListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }


    public SelectRelatedPersonListNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<SelectRelatedPersonNode> getItemClass() {
        return SelectRelatedPersonNode.class;
    }

    @Override
    public NodeAddEvent<SelectRelatedPersonNode> createItemAddEvent(String name) {
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<SelectRelatedPersonNode> createItemRemoveEvent(SelectRelatedPersonNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
