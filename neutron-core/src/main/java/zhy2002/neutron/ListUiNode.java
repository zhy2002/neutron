package zhy2002.neutron;

import com.google.common.base.Joiner;
import jsinterop.annotations.JsMethod;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.util.NeutronEventSubjects;
import zhy2002.neutron.util.PredefinedPhases;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * Represents a list of UiNode.
 *
 * @param <P> concrete class of parent.
 * @param <N> concrete class of item.
 */
public abstract class ListUiNode<P extends ObjectUiNode<?>, N extends UiNode<?>>
        extends ParentUiNode<P> {

    private static final Joiner joiner = Joiner.on(",");

    /**
     * Used to name items.
     */
    private int childSequenceNumber = 0;

    /**
     * A the type constraint indicates, a ListUiNode's parent
     * must be an ObjectUiNode.
     *
     * @param parent the parent ObjectUiNode.
     */
    protected ListUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    /**
     * This is required due to Java generics limitation.
     *
     * @return the class object of item type.
     */
    public abstract Class<N> getItemClass();

    @JsMethod
    @SuppressWarnings("unchecked")
    public N getItem(int index) {
        return (N) getChild(index);
    }

    @JsMethod
    @SuppressWarnings("unchecked")
    public N getItemByName(String name) {
        return (N) getChild(name);
    }

    /**
     * @return the number of items in this list.
     */
    @JsMethod
    public int getItemCount() {
        return super.getChildCount();
    }

    /**
     * Create an instance of item node.
     *
     * @return the node newly created.
     */
    @JsMethod
    public N createItem() {
        return createItemWithName(String.valueOf(getChildSequenceNumber()));
    }

    /**
     * For loading existing items from data store.
     *
     * @param name the name of the item node.
     * @return the recreated item node.
     */
    @JsMethod
    public N createItemWithName(String name) {
        NodeAddEvent<N> event = createItemAddEvent(name);
        if (shouldChangeDirectly()) {
            event.apply();
        } else {
            getContext().processEvent(event);
        }
        int index = Integer.parseInt(name);
        if (childSequenceNumber <= index) {
            childSequenceNumber = index + 1;
        }
        return event.getOrigin();
    }

    @JsMethod
    public N removeByIndex(int index) {
        N item = getItem(index);
        removeItem(item);
        return item;
    }

    @SuppressWarnings("unchecked")
    public N removeByName(String name) {
        UiNode<?> child = getChild(name);
        if (child == null)
            return null;

        N typed = (N) child;
        removeItem(typed);
        return typed;
    }

    @JsMethod
    public void removeItem(N item) {
        if (item.getParent() != this)
            return;
        NodeRemoveEvent<N> event = createItemRemoveEvent(item);
        getContext().processEvent(event);
    }

    public abstract NodeAddEvent<N> createItemAddEvent(String name);

    public final NodeAddEvent<N> createItemAddEvent() {
        return createItemAddEvent(String.valueOf(getChildSequenceNumber()));
    }

    public abstract NodeRemoveEvent<N> createItemRemoveEvent(N item);

    protected final int getChildSequenceNumber() {
        return childSequenceNumber++;
    }

    @Override
    protected void addChild(UiNode<?> child) {
        super.addChild(child);
        child.setIndex(getItemCount() - 1);
        setHasValue(hasValue());
    }

    @Override
    protected void removeChild(UiNode<?> child) {
        super.removeChild(child);
        int index = child.getIndex();
        child.setIndex(null);
        for (int i = index; i < getItemCount(); i++) {
            getItem(i).setIndex(i);
        }

        setHasValue(hasValue());

        Integer selectedIndex = getSelectedIndex();
        if (selectedIndex != null && selectedIndex >= getItemCount()) {
            setSelectedIndex(Math.max(0, getItemCount() - 1));
        }
    }

    @Override
    public boolean hasValue() {
        return getItemCount() > 0;
    }

    private void markDirty() {
        String childNames = getChildNames();
        setStateValueDirectly(NeutronEventSubjects.ORIGINAL_CHILD_NAMES, childNames);
        setSelfDirty(Boolean.TRUE);
    }

    private void tryClearDirty() {
        String childNames = getChildNames();
        String originalChildNames = getStateValueDirectly(NeutronEventSubjects.ORIGINAL_CHILD_NAMES);
        if (Objects.equals(childNames, originalChildNames)) {
            clearStateValueDirectly(NeutronEventSubjects.ORIGINAL_CHILD_NAMES);
            setSelfDirty(Boolean.FALSE);
        }
    }

    @Override
    public boolean isDirty() {
        return getSelfDirty() || super.isDirty();
    }

    @Override
    protected void resetDirty() {
        super.resetDirty();

        setSelfDirty(null);
    }

    private String getChildNames() {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < getItemCount(); i++) {
            UiNode<?> node = getItem(i);
            names.add(node.getName());
        }
        return joiner.join(names);
    }

    public static class MaintainSelfDirtyRule extends UiNodeRule<ListUiNode<?, ?>> {

        @Inject
        protected MaintainSelfDirtyRule(@Owner ListUiNode<?, ?> owner) {
            super(owner);
        }

        @Override
        protected Collection<EventBinding> createEventBindings() {
            return Arrays.asList(
                    new GenericNodeAddEventBinding(
                            this::filter,
                            this::setSelfDirty,
                            getOwner().getName(),
                            PredefinedPhases.Pre
                    ),
                    new GenericNodeRemoveEventBinding(
                            this::filter,
                            this::setSelfDirty,
                            getOwner().getName(),
                            PredefinedPhases.Pre
                    ),
                    new GenericNodeAddEventBinding(
                            this::filter,
                            this::clearSelfDirty,
                            getOwner().getName(),
                            PredefinedPhases.Post
                    ),
                    new GenericNodeRemoveEventBinding(
                            this::filter,
                            this::clearSelfDirty,
                            getOwner().getName(),
                            PredefinedPhases.Post
                    )
            );
        }

        private boolean filter(UiNodeEvent event) {
            return getContext().isDirtyCheckEnabled() && event.getOrigin().getParent() == getOwner();
        }

        private void setSelfDirty(ChangeUiNodeEvent event) {
            if (!Boolean.TRUE.equals(getOwner().getSelfDirty())) {
                getOwner().markDirty();
            }
        }

        private void clearSelfDirty(ChangeUiNodeEvent event) {
            if (Boolean.TRUE.equals(getOwner().getSelfDirty())) {
                getOwner().tryClearDirty();

            }
        }
    }

    //region node properties

    public static final PropertyMetadata<Boolean> SELF_DIRTY_PROPERTY = MetadataRegistry.createProperty(ListUiNode.class, "selfDirty", Boolean.class, Boolean.FALSE);
    public static final PropertyMetadata<Integer> SELECTED_INDEX_PROPERTY = MetadataRegistry.createProperty(ListUiNode.class, "selectedIndex", Integer.class, 0);
    public static final PropertyMetadata<Integer> MIN_ITEM_COUNT_PROPERTY = MetadataRegistry.createProperty(ListUiNode.class, "minItemCount", Integer.class);
    public static final PropertyMetadata<Integer> MAX_ITEM_COUNT_PROPERTY = MetadataRegistry.createProperty(ListUiNode.class, "maxItemCount", Integer.class);

    private Boolean getSelfDirty() {
        return getStateValue(SELF_DIRTY_PROPERTY);
    }

    private void setSelfDirty(Boolean value) {
        setStateValue(SELF_DIRTY_PROPERTY, value);
    }

    @JsMethod
    public int getSelectedIndex() {
        return getStateValue(SELECTED_INDEX_PROPERTY);
    }

    @JsMethod
    public void setSelectedIndex(int value) {
        setStateValue(SELECTED_INDEX_PROPERTY, value);
    }

    public Integer getMinItemCount() {
        return getStateValue(MIN_ITEM_COUNT_PROPERTY);
    }

    public void setMinItemCount(Integer count) {
        setStateValue(MIN_ITEM_COUNT_PROPERTY, count);
    }

    public Integer getMaxItemCount() {
        return getStateValue(MAX_ITEM_COUNT_PROPERTY);
    }

    public void setMaxItemCount(Integer count) {
        setStateValue(MAX_ITEM_COUNT_PROPERTY, count);
    }

    //endregion
}
