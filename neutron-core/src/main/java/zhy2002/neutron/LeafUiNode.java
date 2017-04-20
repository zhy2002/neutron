package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.GenericStateChangeEventBinding;
import zhy2002.neutron.util.NeutronEventSubjects;
import zhy2002.neutron.util.PredefinedPhases;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/**
 * A UiNode which cannot have children.
 */
public abstract class LeafUiNode<P extends ParentUiNode<?>, T> extends UiNode<P> {

    protected LeafUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    public abstract T getValue();

    public abstract void setValue(T value);

    public abstract Class<T> getValueClass();

    @Override
    protected final void unloadContent() {
        super.unloadContent();

        decreaseAncestorDirtyDescendantCount();
    }

    private void decreaseAncestorDirtyDescendantCount() {
        if (getParent() != null && getParent().getNodeStatus() == NodeStatusEnum.Loaded) {
            if (getSelfDirty()) {
                ParentUiNode<?> parent = getParent();
                do {
                    parent.setDirtyDescendantCount(parent.getDirtyDescendantCount() - 1);
                    parent = parent.getParent();
                } while (parent != null);
            }
        }
    }

    @Override
    public boolean hasValue() {
        return getValue() != null;
    }

    @Override
    public final boolean hasError() {
        return getValidationErrorList().size() > 0;
    }

    @Override
    protected void setStateValueDirectly(String key, Object value) {
        super.setStateValueDirectly(key, value);

        if (NeutronEventSubjects.VALUE.equals(key)) {
            setHasValue(hasValue());
        }
    }

    public final void resetValue() {
        T initialValue = getPreStateValue(NeutronEventSubjects.VALUE);
        setValue(initialValue);
    }

    @JsMethod
    public T getCopyOfValue() {
        throw new NotImplementedException();
    }

    /**
     * @return the value of this leaf node before it becomes dirty.
     * returns null when the node is not dirty.
     */
    final T getOriginalValue() {
        return getStateValueDirectly(NeutronEventSubjects.ORIGINAL_VALUE);
    }

    private void setOriginalValue(T value) {
        setStateValueDirectly(NeutronEventSubjects.ORIGINAL_VALUE, value);
    }

    private void makeDirty() {
        setOriginalValue(getValue());
        setSelfDirty(Boolean.TRUE);
    }

    private void clearDirty() {
        clearStateValueDirectly(NeutronEventSubjects.ORIGINAL_VALUE);
        setSelfDirty(Boolean.FALSE);
    }

    @Override
    public boolean isDirty() {
        return getSelfDirty();
    }

    @Override
    protected void resetDirty() {
        setSelfDirty(null);
    }

    //region node properties

    public static final PropertyMetadata<Boolean> SELF_DIRTY_PROPERTY = MetadataRegistry.createProperty(LeafUiNode.class, "selfDirty", Boolean.class, Boolean.FALSE);

    @NotNull
    private Boolean getSelfDirty() {
        return getStateValue(SELF_DIRTY_PROPERTY);
    }

    private void setSelfDirty(Boolean value) {
        setStateValue(SELF_DIRTY_PROPERTY, value);
    }

    //endregion

    public static class MaintainSelfDirtyRule extends UiNodeRule<LeafUiNode<?, ?>> {

        private final StateChangeEvent<?> stateChangeEvent;

        @Inject
        protected MaintainSelfDirtyRule(@Owner LeafUiNode<?, ?> owner) {
            super(owner);

            //this object is only used to obtain a reference to Class<StateChangeEvent<?>>
            stateChangeEvent = getContext().createStateChangeEvent(getOwner(), "", getOwner().getValueClass(), null, null);
        }

        @Override
        protected Collection<EventBinding> createEventBindings() {

            return Arrays.asList(
                    new GenericStateChangeEventBinding<>(
                            e -> getContext().isDirtyCheckEnabled(),
                            this::updateSelfDirty,
                            stateChangeEvent.getClass(),
                            PredefinedPhases.Pre
                    )
            );
        }

        private void updateSelfDirty(StateChangeEvent<?> event) {
            if (getOwner().getSelfDirty()) { //check if should change to none-dirty
                if (Objects.equals(event.getNewValue(), getOwner().getOriginalValue())) {
                    getOwner().clearDirty();
                }
            } else { //check if should change to dirty
                if (!Objects.equals(event.getOldValue(), event.getNewValue())) {
                    getOwner().makeDirty();
                }
            }
        }
    }

}
