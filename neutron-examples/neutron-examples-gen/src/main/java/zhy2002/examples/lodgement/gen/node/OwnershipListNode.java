package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class OwnershipListNode<P extends ObjectUiNode<?>> extends ListUiNode<P,OwnershipNode> {

    private OwnershipListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(OwnershipListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }


    public OwnershipListNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<OwnershipNode> getItemClass() {
        return OwnershipNode.class;
    }

    public NodeAddEvent<OwnershipNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<OwnershipNode> createItemRemoveEvent(OwnershipNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

    @JsMethod
    public BigDecimal getTotalOwnership() {
        return getStateValue(ApplicationNodeConstants.TOTAL_OWNERSHIP);
    }

    @JsMethod
    public void setTotalOwnership(BigDecimal value) {
        setStateValue(ApplicationNodeConstants.TOTAL_OWNERSHIP, BigDecimal.class, value);
    }

}
