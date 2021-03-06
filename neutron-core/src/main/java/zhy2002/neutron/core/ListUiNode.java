package zhy2002.neutron.core;

import com.google.common.base.Joiner;
import jsinterop.annotations.JsMethod;
import zhy2002.neutron.core.config.MetadataRegistry;
import zhy2002.neutron.core.config.PropertyMetadata;
import zhy2002.neutron.core.data.NodeIdentity;
import zhy2002.neutron.core.data.NodeIdentityMap;
import zhy2002.neutron.core.event.AnyNodeAddEventBinding;
import zhy2002.neutron.core.event.AnyNodeRemoveEventBinding;

import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * Represents a list of UiNode.
 *
 * @param <P> concrete class of parent.
 * @param <N> concrete class of item.
 */
public abstract class ListUiNode<P extends ObjectUiNode<?>, N extends UiNode<? extends ListUiNode<?, N>>>
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
    protected ListUiNode(@NotNull P parent) {
        super(parent);
    }

    /**
     * This is required due to Java generics limitation.
     *
     * @return the class object of item type.
     */
    public abstract Class<N> getItemClass();

    @Override
    protected void addContent() {
        createItems();

        super.addContent();
    }

    private void createItems() {
        List<NodeIdentity> nodeIdentities = getItemNodeIdentities();
        nodeIdentities.sort(Comparator.comparingInt(identity -> Integer.parseInt(identity.getName())));
        for (NodeIdentity identity : nodeIdentities) {
            getContext().setNodeIdentity(identity);
            getContext().addPendingChangeEvent(createItemAddEvent(identity.getName()));
        }
        getContext().setNodeIdentity(null);
    }

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
    }

    @Override
    protected final void removeChild(UiNode<?> child) {
        super.removeChild(child);

        for (int i = 0; i < getItemCount(); i++) {
            getItem(i).setIndex(i);
        }

        int selectedIndex = getSelectedIndex();
        if (selectedIndex >= getItemCount()) {
            setSelectedIndex(Math.max(0, getItemCount() - 1));
        }
    }

    @Override
    public final boolean hasValue() {
        return getItemCount() > 0; //list node cannot have initial items
    }

    @Override
    public final void resetValue() {
        if (getKeepItemsOnReset()) {
            Arrays.stream(getChildren()).forEach(UiNode::resetValue);
        } else {
            List<N> items = new ArrayList<>();
            for (int i = 0; i < getItemCount(); i++) {
                N item = getItem(i);
                items.add(item);
            }
            items.forEach(this::removeItem);
        }
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
        NodeAddEvent<N> event = createItemAddEvent(name);
        if (isInDirectChangeMode()) {
            event.apply();
        } else {
            getContext().processEvent(event);
        }

        return event.getOrigin();
    }

    protected void ensureSequenceNumber(String name) {
        int index = Integer.parseInt(name);
        if (childSequenceNumber <= index) {
            childSequenceNumber = index + 1;
        }
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
        if (isInDirectChangeMode()) {
            event.apply();
        } else {
            getContext().processEvent(event);
        }

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

    @JsMethod
    public String getChildNames() {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < getItemCount(); i++) {
            UiNode<?> node = getItem(i);
            names.add(node.getName());
        }
        return joiner.join(names);
    }

    private List<NodeIdentity> getItemNodeIdentities() {
        List<NodeIdentity> itemNodeIdentities = new ArrayList<>();
        NodeIdentity nodeIdentity = getNodeIdentity();
        if (nodeIdentity != null) {
            NodeIdentityMap nodeIdentityMap = nodeIdentity.getNodeIdentityMap();
            assert nodeIdentityMap != null;
            NodeIdentity item;
            while (true) {
                item = nodeIdentityMap.next();
                if (item == null)
                    break;
                else
                    itemNodeIdentities.add(item);
            }
        }
        return itemNodeIdentities;


    }

    //region node properties

    public static final PropertyMetadata<Integer> SELECTED_INDEX_PROPERTY = MetadataRegistry.createProperty(ListUiNode.class, "selectedIndex", Integer.class, 0);
    public static final PropertyMetadata<Integer> MIN_ITEM_COUNT_PROPERTY = MetadataRegistry.createProperty(ListUiNode.class, "minItemCount", Integer.class);
    public static final PropertyMetadata<Integer> MAX_ITEM_COUNT_PROPERTY = MetadataRegistry.createProperty(ListUiNode.class, "maxItemCount", Integer.class);
    public static final PropertyMetadata<String> ORIGINAL_CHILD_NAMES_PROPERTY = MetadataRegistry.createProperty(ListUiNode.class, "originalChildNames", String.class, "", ChangeModeEnum.DIRECT);
    public static final PropertyMetadata<Boolean> KEEP_ITEMS_ON_RESET_PROPERTY = MetadataRegistry.createProperty(ListUiNode.class, "keepItemsOnReset", Boolean.class, Boolean.FALSE, ChangeModeEnum.DIRECT);

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

    public Boolean getKeepItemsOnReset() {
        return getStateValue(KEEP_ITEMS_ON_RESET_PROPERTY);
    }

    public void setKeepItemsOnReset(Boolean value) {
        setStateValue(KEEP_ITEMS_ON_RESET_PROPERTY, value);
    }

    //endregion

    /**
     * When the child name list changes mark this list node as self dirty.
     */
    static class MaintainSelfDirtyRule extends UiNodeRule<ListUiNode<?, ?>> {

        MaintainSelfDirtyRule(ListUiNode<?, ?> owner) {
            super(owner);
        }

        @Override
        protected Collection<EventBinding> createEventBindings() {
            return Arrays.asList(
                    new AnyNodeAddEventBinding(
                            this::originatesFromChildrenAndCheckDirty,
                            e -> getOwner().markSelfDirty(),
                            PredefinedPhases.Pre
                    ),
                    new AnyNodeRemoveEventBinding(
                            this::originatesFromChildrenAndCheckDirty,
                            e -> getOwner().markSelfDirty(),
                            PredefinedPhases.Pre
                    ),
                    new AnyNodeRemoveEventBinding(
                            this::originatesFromChildrenAndCheckDirty,
                            this::tryClearSelfDirty,
                            PredefinedPhases.Post
                    )
            );
        }

        private boolean originatesFromChildrenAndCheckDirty(UiNodeEvent event) {
            return getOwner().isDirtyCheckEnabled() && event.getOrigin().getParent() == getOwner();
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
