package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OwnershipListNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.event.*;


public abstract class OwnershipListNode<P extends ObjectUiNode<?>> extends ListUiNode<P,OwnershipNode> {

    public OwnershipListNode(P parent) {
        super(parent);
    }

    protected abstract OwnershipListNodeComponent getComponent();


    @Override
    public Class<OwnershipNode> getItemClass() {
        return OwnershipNode.class;
    }

    @Override
    public NodeAddEvent<OwnershipNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        OwnershipNode item = getComponent().createOwnershipNode();
        setNameOfChildBeingCreated(null);
        return new OwnershipNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<OwnershipNode> createItemRemoveEvent(OwnershipNode item) {
        return new OwnershipNodeRemoveEvent(item);
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
