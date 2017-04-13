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

    @JsMethod
    public T getValue() {
        return getStateValue(NeutronEventSubjects.VALUE);
    }

    protected final void setValue(Class<T> valueClass, T value) {
        setStateValue(NeutronEventSubjects.VALUE, valueClass, value);
    }

    public abstract void setValue(T value);

    @Override
    public boolean hasValue() {
        return getValue() != null;
    }

    public void resetValue() {
        T initialValue = getPreStateValue(NeutronEventSubjects.VALUE);
        setValue(initialValue);
    }

    @Override
    protected void setStateValueDirectly(String key, Object value) {
        super.setStateValueDirectly(key, value);
        if (NeutronEventSubjects.VALUE.equals(key)) {
            setHasValue(hasValue());
        }
    }

    @JsMethod
    public T getCopyOfValue() {
        throw new NotImplementedException();
    }

    private void setOriginalValue(T value) {
        setStateValueDirectly(NeutronEventSubjects.ORIGINAL_VALUE, value);
    }

    public T getOriginalValue() {
        return getStateValueDirectly(NeutronEventSubjects.ORIGINAL_VALUE);
    }

    private void makeDirty() {
        setOriginalValue(getValue());
        setSelfDirty(Boolean.TRUE);
    }

    private void clearDirty() {
        clearStateValueDirectly(NeutronEventSubjects.ORIGINAL_VALUE);
        setSelfDirty(Boolean.FALSE);
    }

    public abstract Class<T> getValueClass();


    @Override
    public boolean isDirty() {
        return getSelfDirty();
    }

    @Override
    protected void resetDirty() {
        setSelfDirty(null);
    }

    public static class MaintainSelfDirtyRule extends UiNodeRule<LeafUiNode<?, ?>> {

        @Inject
        protected MaintainSelfDirtyRule(@Owner LeafUiNode<?, ?> owner) {
            super(owner);
        }

        @Override
        protected Collection<EventBinding> createEventBindings() {
            StateChangeEvent<?> stateChangeEvent = getContext().createStateChangeEvent(getOwner(), "", getOwner().getValueClass(), null, null);

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
            if (Boolean.TRUE.equals(getOwner().getSelfDirty())) { //check if should change to none-dirty
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

    //region node properties

    public static final PropertyMetadata<Boolean> SELF_DIRTY_PROPERTY = MetadataRegistry.createProperty(LeafUiNode.class, "selfDirty", Boolean.class, Boolean.FALSE);

    private Boolean getSelfDirty() {
        return getStateValue(SELF_DIRTY_PROPERTY);
    }

    private void setSelfDirty(Boolean value) {
        setStateValue(SELF_DIRTY_PROPERTY, value);
    }

    //endregion
}
