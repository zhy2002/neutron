package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.data.NodeIdentity;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.GenericStateChangeEventBinding;
import zhy2002.neutron.exception.NotImplementedException;
import zhy2002.neutron.util.NeutronConstants;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Collections;
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

    protected abstract PropertyMetadata<T> getValuePropertyMetadata();

    @Override
    protected final void addContent() {

        tryAvoidNull();

        super.addContent();
    }

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
        return getValue() != null && !getValue().equals(getEmptyValue());
    }

    @JsMethod
    public boolean isValueUpdated() {
        return !Objects.equals(getValue(), getPreStateValue());
    }

    protected final T getPreStateValue() {
        return getPreStateValue(getValuePropertyMetadata());
    }

    final void tryAvoidNull() {
        if (getValue() == null) {
            T empty = getEmptyValue();
            if (empty != null) {
                setValue(empty);
            }
        }
    }

    /**
     * The value of type T that has the same meaning as null.
     *
     * @return an instance of T used in place of null.
     */
    @JsMethod
    public T getEmptyValue() {
        return null;
    }

    @Override
    public final boolean hasError() {
        return getValidationErrorList().size() > 0;
    }

    @Override
    protected void setStateValueDirectly(String key, Object value) {
        super.setStateValueDirectly(key, value);

        if (NeutronConstants.VALUE.equals(key) && getNodeStatus() == NodeStatusEnum.Loaded) {
            setHasValue(hasValue());
        }
    }

    @Override
    public void resetValue() {
        T initialValue = getPreStateValue(getValuePropertyMetadata());
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
        return getStateValueDirectly(NeutronConstants.ORIGINAL_VALUE);
    }

    private void setOriginalValue(T value) {
        setStateValueDirectly(NeutronConstants.ORIGINAL_VALUE, value);
    }

    private void makeDirty() {
        setOriginalValue(getValue());
        setSelfDirty(Boolean.TRUE);
    }

    private void clearDirty() {
        clearStateValueDirectly(NeutronConstants.ORIGINAL_VALUE);
        setSelfDirty(Boolean.FALSE);
    }

    @Override
    public boolean isDirty() {
        return getSelfDirty();
    }

    @Override
    final void resetDirty() {
        setSelfDirty(null);
    }

    //region node properties

    @NotNull
    private Boolean getSelfDirty() {
        return getStateValue(SELF_DIRTY_PROPERTY);
    }

    private void setSelfDirty(Boolean value) {
        setStateValue(SELF_DIRTY_PROPERTY, value);
    }

    //endregion

    /**
     * When the value of this leaf node is set, check if the node becomes dirty or not dirty.
     */
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

            return Collections.singleton(
                    new GenericStateChangeEventBinding<>(
                            e -> getContext().isDirtyCheckEnabled(),
                            this::updateSelfDirty,
                            stateChangeEvent.getClass(),
                            PredefinedPhases.Pre //need to do this in pre phase to capture original value
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
