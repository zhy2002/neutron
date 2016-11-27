package zhy2002.neutron;

import jsinterop.annotations.JsMethod;

import javax.validation.constraints.NotNull;

/**
 * A ParentUiNode whose children are put in a list.
 */
public abstract class ListUiNode<P extends ObjectUiNode<?>, T extends UiNode<? extends ListUiNode<P, T>>>
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

    public int getChildSequenceNumber() {
        return childSequenceNumber++;
    }

    public abstract Class<T> getItemClass();

    @JsMethod
    public T createItem() {
        return createItem(getItemClass());
    }

    public T createItem(Class<? extends T> itemClass) {
        T item = createItemInternal(itemClass);
        NodeAddEvent event = createNodeAddEvent(item);
        getContext().processEvent(event);
        return item;
    }

    protected abstract NodeAddEvent<T> createNodeAddEvent(T item);

//    {
//        NodeAddEvent<T> event = new NodeAddEvent<>(item, getContext().getCurrentActivation());
//        return event;
//    }

    public void addItemInternal(T item) {
        itemAddToParent(item);
        itemLoad(item);
    }

    public void removeItemInternal(T item) {
        itemUnload(item);
        itemRemoveFromParent(item);
    }

    protected abstract T createItemInternal(Class<? extends T> itemClass);

    protected void itemAddToParent(T item) {
        item.addToParent();
    }

    protected void itemRemoveFromParent(T item) {
        item.removeFromParent();
    }

    protected void itemLoad(T item) {
        item.load();
    }

    protected void itemUnload(T item) {
        item.unload();
    }

    @JsMethod
    @SuppressWarnings("unchecked")
    public T getItem(int index) {
        return (T) getChild(index);
    }

    @Override
    public boolean supportRemoveChild() {
        return true;
    }

    public void removeItem(T child) {
        if (child.getParent() != this)
            return;
        NodeRemoveEvent<T> event = createNodeRemoveEvent(child);
        getContext().processEvent(event);
    }

    protected abstract NodeRemoveEvent<T> createNodeRemoveEvent(T child);
}
