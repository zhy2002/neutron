package zhy2002.neutron.core.node;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.core.*;
import zhy2002.neutron.core.config.MetadataRegistry;
import zhy2002.neutron.core.config.NeutronConstants;
import zhy2002.neutron.core.config.PropertyMetadata;
import zhy2002.neutron.core.data.NodeIdentity;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEvent;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Logger;

public abstract class ReferenceUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, String> {

    protected ReferenceUiNode(@NotNull P parent) {
        super(parent);
    }

    @JsMethod
    public UiNode<?> getReferencedNode() {
        return getContext().getNodeFinder().findNodeByPath(getValue());
    }

    @Override
    public Class<String> getValueClass() {
        return String.class;
    }

    @Override
    public void resetValue() {
        ListUiNode<?, ?> firstListAncestor = getFirstListAncestor();
        if (firstListAncestor != null && !firstListAncestor.getKeepItemsOnReset()) {
            super.resetValue();
        }
    }

    private ListUiNode<?, ?> getFirstListAncestor() {
        ParentUiNode<?> parent = this.getParent();
        while (parent != null) {
            if (parent instanceof ListUiNode) {
                return (ListUiNode<?, ?>) parent;
            }
            parent = parent.getParent();
        }
        return null;
    }

    @Override
    protected void clearNodeIdentity() {
        NodeIdentity nodeIdentity = getNodeIdentity();
        if (nodeIdentity != null) {
            setValue(nodeIdentity.getValue());
        }

        super.clearNodeIdentity();
    }

    @Override
    public PropertyMetadata<String> getValuePropertyMetadata() {
        return VALUE_PROPERTY;
    }

    //region node properties

    public static final PropertyMetadata<String> VALUE_PROPERTY = MetadataRegistry.createProperty(ReferenceUiNode.class, "value", String.class);
    public static final PropertyMetadata<Boolean> REMOVE_EMPTY_PROPERTY = MetadataRegistry.createProperty(ReferenceUiNode.class, "removeEmpty", Boolean.class, Boolean.FALSE, ChangeModeEnum.DIRECT);

    @JsMethod
    @Override
    public String getValue() {
        return getStateValue(VALUE_PROPERTY);
    }

    @JsMethod
    @Override
    public void setValue(String value) {
        setStateValue(VALUE_PROPERTY, value);
    }

    public final boolean isRemoveEmpty() {
        return getStateValue(REMOVE_EMPTY_PROPERTY);
    }

    public final void setRemoveEmpty(boolean value) {
        setStateValue(REMOVE_EMPTY_PROPERTY, value);
    }

    //endregion

    public static class NodeReferenceChangeRule extends UiNodeRule<ReferenceUiNode<?>> {

        private Logger logger = Logger.getLogger("NodeReferenceChangeRule");

        public NodeReferenceChangeRule(ReferenceUiNode<?> owner) {
            super(owner);
        }

        @Override
        protected Collection<EventBinding> createEventBindings() {
            return Arrays.asList(
                    new RefreshEventBinding(
                            this::loadReference,
                            NeutronConstants.NODE_LOADED_REFRESH_REASON
                    ),
                    new StringStateChangeEventBinding(
                            this::updateReference,
                            VALUE_PROPERTY.getStateKey()
                    )
            );
        }

        private void loadReference(RefreshUiNodeEvent event) {
            getContext().getNodeReferenceRegistry().update(getOwner(), null, getOwner().getValue());
            logger.fine("Loaded reference node: " + getOwner().getPath());

        }

        private void updateReference(StringStateChangeEvent event) {
            if (event.getNewValue() == null && getOwner().isRemoveEmpty()) {
                ParentUiNode<?> parentNode = getOwner().getParent();
                if (parentNode instanceof ListUiNode<?, ?>) {
                    ((ListUiNode<?, ?>) parentNode).removeByName(getOwner().getName());
                } else if (parentNode != null && parentNode.getParent() instanceof ListUiNode<?, ?>) {
                    ((ListUiNode<?, ?>) parentNode.getParent()).removeByName(parentNode.getName());
                }
            } else {
                getContext().getNodeReferenceRegistry().update(getOwner(), event.getOldValue(), event.getNewValue());
            }
        }
    }

}
