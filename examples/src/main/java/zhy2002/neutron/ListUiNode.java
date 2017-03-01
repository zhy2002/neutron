package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.validation.constraints.NotNull;

/**
 * Represents a list of UiNode.
 *
 * @param <P> concrete class of parent.
 * @param <N> concrete class of item.
 */
public abstract class ListUiNode<P extends ObjectUiNode<?>, N extends UiNode<?>>
        extends ParentUiNode<P> {

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
        NodeAddEvent<N> event = createItemAddEvent();
        if (shouldChangeWithoutEvent()) {
            event.apply();
        } else {
            getContext().processEvent(event);
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

    public abstract NodeAddEvent<N> createItemAddEvent();

    public abstract NodeRemoveEvent<N> createItemRemoveEvent(N item);

    protected final int getChildSequenceNumber() {
        return childSequenceNumber++;
    }

    @JsMethod
    public int getSelectedIndex() {
        return getStateValue(NeutronEventSubjects.SELECTED_INDEX, 0);
    }

    @JsMethod
    public void setSelectedIndex(int value) {
        setStateValue(NeutronEventSubjects.SELECTED_INDEX, Integer.class, value);
    }

    @Override
    protected void initializeChildren() {
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

        Integer selectedIndex = getStateValue(NeutronEventSubjects.SELECTED_INDEX);
        if (selectedIndex != null && selectedIndex >= getItemCount()) {
            setSelectedIndex(Math.max(0, getItemCount() - 1));
        }
    }

    @Override
    public boolean hasValue() {
        return getItemCount() > 0;
    }

    @Override
    protected abstract ListUiNodeRuleProvider<?> getRuleProvider();
}
