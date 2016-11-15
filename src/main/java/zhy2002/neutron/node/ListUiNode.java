package zhy2002.neutron.node;

import zhy2002.examples.register.ErrorNode;

import javax.validation.constraints.NotNull;

/**
 * A ParentUiNode whose children are put in a list.
 */
public abstract class ListUiNode<P extends ObjectUiNode<?>, T extends UiNode<? extends ListUiNode<P, T>>> extends ParentUiNode<P> {

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

    public T addItem() {
        return addItem(getItemClass());
    }

    public T addItem(Class<? extends T> itemClass) {
        T item = createItem(itemClass);
        itemAddToParent(item);
        itemLoad(item);
        return item;
    }

    protected abstract T createItem(Class<? extends T> itemClass);

    protected void itemAddToParent(T item) {
        item.addToParent();
    }

    protected void itemLoad(T item) {
        item.load();
    }

    @SuppressWarnings("unchecked")
    public T getItem(int index) {
        return (T) getChild(index);
    }


    public void removeItem(UiNode<?> child) {
        super.removeChild(child);
    }
}
