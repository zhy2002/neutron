package zhy2002.neutron.node;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.util.NeutronConstants;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Collection;

public abstract class ReferenceUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, String> {

    protected ReferenceUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
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
        ParentUiNode<?> parent = this.getParent();
        while (parent != null) {
            if (parent instanceof ListUiNode) {
                if (((ListUiNode) parent).getKeepItemsOnReset()) {
                    return;
                }
            }
            parent = parent.getParent();
        }

        super.resetValue();
    }

    @Override
    protected PropertyMetadata<String> getValuePropertyMetadata() {
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

    static class NodeReferenceChangeRule extends UiNodeRule<ReferenceUiNode<?>> {

        @Inject
        NodeReferenceRegistry nodeReferenceRegistry;

        @Inject
        protected NodeReferenceChangeRule(@Owner ReferenceUiNode<?> owner) {
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
                            this::updateReference
                    )
            );
        }

        private void loadReference(RefreshUiNodeEvent event) {
            nodeReferenceRegistry.update(getOwner(), null, getOwner().getValue());
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
                nodeReferenceRegistry.update(getOwner(), event.getOldValue(), event.getNewValue());
            }
        }
    }

}
