package zhy2002.neutron;

import com.google.common.base.Joiner;
import jsinterop.annotations.JsMethod;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.di.Owner;
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

    /**
     * Create an item with a specified name.
     *
     * @param name this is the string representation of the item's sequence number.
     * @return the new item.
     */
    public abstract NodeAddEvent<N> createItemAddEvent(String name);

    public abstract NodeRemoveEvent<N> createItemRemoveEvent(N item);

    @Override
    protected final void addChild(UiNode<?> child) {
        super.addChild(child);

        child.setIndex(getItemCount() - 1);
        setHasValue(true);
    }

    @Override
    protected final void removeChild(UiNode<?> child) {
        super.removeChild(child);

        int index = child.getIndex();
        child.setIndex(null);
        for (int i = index; i < getItemCount(); i++) {
            getItem(i).setIndex(i);
        }

        setHasValue(hasValue());

        int selectedIndex = getSelectedIndex();
        if (selectedIndex >= getItemCount()) {
            setSelectedIndex(Math.max(0, getItemCount() - 1));
        }
    }

    @Override
    public final boolean hasValue() {
        return getItemCount() > 0;
    }

    @JsMethod
    @SuppressWarnings("unchecked")
    public final N getItem(int index) {
        return (N) getChild(index);
    }

    @JsMethod
    @SuppressWarnings("unchecked")
    public final N getItemByName(String name) {
        return (N) getChild(name);
    }

    /**
     * @return the number of items in this list.
     */
    @JsMethod
    public final int getItemCount() {
        return getChildCount();
    }

    /**
     * Create an instance of item node.
     *
     * @return the node newly created.
     */
    @JsMethod
    public final N createItem() {
        return createItemWithName(String.valueOf(getChildSequenceNumber()));
    }

    /**
     * For loading existing items from data store.
     *
     * @param name must be the string representation of the
     *             sequence number of the item.
     * @return the recreated item node.
     */
    @JsMethod
    public final N createItemWithName(String name) {
        int index = Integer.parseInt(name);

        NodeAddEvent<N> event = createItemAddEvent(name);
        if (isInDirectChangeMode()) {
            event.apply();
        } else {
            getContext().processEvent(event);
        }

        if (childSequenceNumber <= index) {
            childSequenceNumber = index + 1;
        }
        return event.getOrigin();
    }

    @JsMethod
    public final N removeByIndex(int index) {
        N item = getItem(index);
        removeItem(item);
        return item;
    }

    @SuppressWarnings("unchecked")
    public final N removeByName(String name) {
        UiNode<?> child = getChild(name);
        if (child == null)
            return null;

        N typed = (N) child;
        removeItem(typed);
        return typed;
    }

    @JsMethod
    public final void removeItem(N item) {
        if (item.getParent() != this)
            return;

        NodeRemoveEvent<N> event = createItemRemoveEvent(item);
        getContext().processEvent(event);
    }

    public final NodeAddEvent<N> createItemAddEvent() {
        return createItemAddEvent(String.valueOf(getChildSequenceNumber()));
    }

    private int getChildSequenceNumber() {
        return childSequenceNumber++;
    }

    private void markSelfDirty() {
        if (!getSelfDirty()) {
            String childNames = getChildNames();
            setOriginalChildNames(childNames);
            setSelfDirty(Boolean.TRUE);
        }
    }

    private void clearSelfDirty() {
        if (getSelfDirty()) {
            setOriginalChildNames(null);
            setSelfDirty(null);
        }
    }

    @Override
    public boolean isDirty() {
        return getSelfDirty() || super.isDirty();
    }

    @Override
    final void resetDirty() {
        super.resetDirty();

        clearSelfDirty();
    }

    private String getChildNames() {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < getItemCount(); i++) {
            UiNode<?> node = getItem(i);
            names.add(node.getName());
        }
        return joiner.join(names);
    }

    //region node properties

    public static final PropertyMetadata<Integer> SELECTED_INDEX_PROPERTY = MetadataRegistry.createProperty(ListUiNode.class, "selectedIndex", Integer.class, 0);
    public static final PropertyMetadata<Integer> MIN_ITEM_COUNT_PROPERTY = MetadataRegistry.createProperty(ListUiNode.class, "minItemCount", Integer.class);
    public static final PropertyMetadata<Integer> MAX_ITEM_COUNT_PROPERTY = MetadataRegistry.createProperty(ListUiNode.class, "maxItemCount", Integer.class);
    public static final PropertyMetadata<String> ORIGINAL_CHILD_NAMES_PROPERTY = MetadataRegistry.createProperty(ListUiNode.class, "originalChildNames", String.class, "", ChangeModeEnum.DIRECT);

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

    private String getOriginalChildNames() {
        return getStateValue(ORIGINAL_CHILD_NAMES_PROPERTY);
    }

    private void setOriginalChildNames(String childNames) {
        setStateValue(ORIGINAL_CHILD_NAMES_PROPERTY, childNames);
    }

    //endregion

    static class MaintainSelfDirtyRule extends UiNodeRule<ListUiNode<?, ?>> {

        @Inject
        protected MaintainSelfDirtyRule(@Owner ListUiNode<?, ?> owner) {
            super(owner);
        }

        @Override
        protected Collection<EventBinding> createEventBindings() {
            return Arrays.asList(
                    new GenericNodeAddEventBinding(
                            this::originatesFromChildrenAndCheckDirty,
                            e -> getOwner().markSelfDirty(),
                            getOwner().getName(),
                            PredefinedPhases.Pre
                    ),
                    new GenericNodeRemoveEventBinding(
                            this::originatesFromChildrenAndCheckDirty,
                            e -> getOwner().markSelfDirty(),
                            getOwner().getName(),
                            PredefinedPhases.Pre
                    ),
                    new GenericNodeRemoveEventBinding(
                            this::originatesFromChildrenAndCheckDirty,
                            this::tryClearSelfDirty,
                            getOwner().getName(),
                            PredefinedPhases.Post
                    )
            );
        }

        private boolean originatesFromChildrenAndCheckDirty(UiNodeEvent event) {
            return getContext().isDirtyCheckEnabled() && event.getOrigin().getParent() == getOwner();
        }

        private void tryClearSelfDirty(ChangeUiNodeEvent event) {
            String childNames = getOwner().getChildNames();
            String originalChildNames = getOwner().getOriginalChildNames();

            if (Objects.equals(childNames, originalChildNames)) {
                getOwner().clearSelfDirty();
            }
        }

    }

}
