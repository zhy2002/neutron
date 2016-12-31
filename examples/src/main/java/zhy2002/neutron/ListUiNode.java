package zhy2002.neutron;

import jsinterop.annotations.JsMethod;

import javax.validation.constraints.NotNull;

/**
 * A ParentUiNode whose children are put in a list.
 */
public abstract class ListUiNode<
        P extends ObjectUiNode<?>,
        S extends ListUiNode<P, S, N>,
        N extends UiNode<S>>
        extends ParentUiNode<P> {

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

    /**
     * @return the number of items in this list.
     */
    @JsMethod
    public int getItemCount() {
        return super.getChildCount();
    }

    /**
     * Create an item of base item type N.
     *
     * @return the node add event so that caller can pass arguments to the new node.
     */
    @JsMethod
    public N createItem() {
        return createItem(getItemClass());
    }

    protected <M extends N> N createItem(Class<M> itemClass) {
        NodeAddEvent<N> event = createItemAddEvent(itemClass);
        if (shouldChangeWithoutEvent()) {
            event.apply();
        } else {
            getContext().processEvent(event);
        }
        return event.getOrigin();
    }

    /**
     * Call this if you want to manually process the event.
     *
     * @return the event, not yet processed.
     */
    public NodeAddEvent<N> createItemAddEvent() {
        return createItemAddEvent(getItemClass());
    }

    /**
     * Create an item of subtype of N.
     * This method is not made public because it is only intended to be called
     * by a wrapper method in subclass.
     *
     * @param itemClass a the class object of a subtype of N.
     * @return the node add event. If this event is processed the item will be added.
     */
    @SuppressWarnings("unchecked")
    protected <M extends N> NodeAddEvent<N> createItemAddEvent(Class<M> itemClass) {
        UiNodeContext<?> context = getContext();
        M item = context.createChildNode(itemClass, (S) this, String.valueOf(getChildSequenceNumber()));
        return context.createNodeAddEvent(getItemClass(), item);
    }

    @JsMethod
    public N removeByIndex(int index) {
        N item = getItem(index);
        removeItem(item);
        return item;
    }

    @JsMethod
    public void removeItem(N item) {
        if (item.getParent() != this)
            return;
        NodeRemoveEvent<N> event = getContext().createNodeRemoveEvent(getItemClass(), item);
        getContext().processEvent(event);
    }

    @SuppressWarnings("unchecked")
    public N removeByName(String name) {
        UiNode<?> child = getChild(name);
        if(child == null)
            return null;

        N typed = (N)child;
        removeItem(typed);
        return typed;
    }

    private int getChildSequenceNumber() {
        return childSequenceNumber++;
    }

    @Override
    protected void initializeChildren() {
    }

    @Override
    protected void uninitializeChildren() {
    }
}
