package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
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

    @Override
    public NodeAddEvent<OwnershipNode> createItemAddEvent(String name) {
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<OwnershipNode> createItemRemoveEvent(OwnershipNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

    public static final PropertyMetadata<BigDecimal> TOTAL_OWNERSHIP_PROPERTY = MetadataRegistry.createProperty(OwnershipListNode.class, "totalOwnership", BigDecimal.class);

    @JsMethod
    public BigDecimal getTotalOwnership() {
        return getStateValue(TOTAL_OWNERSHIP_PROPERTY);
    }

    @JsMethod
    public void setTotalOwnership(BigDecimal value) {
        setStateValue(TOTAL_OWNERSHIP_PROPERTY, value);
    }

}
