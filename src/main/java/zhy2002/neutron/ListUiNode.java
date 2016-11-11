package zhy2002.neutron;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * A ParentUiNode whose children are put in a list.
 */
public abstract class ListUiNode<P extends ObjectUiNode<?>, T extends UiNode<? extends ListUiNode<P, T>>> extends ParentUiNode<P> {

    private int childSequenceNumber = 0;
    private final List<T> children = new ArrayList<>();

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
        return childSequenceNumber;
    }

    public void addChild(T child) {
        children.add(child);
        childSequenceNumber++;
    }

    public int getChildCount() {
        return children.size();
    }

    public void remove(Predicate<T> predicate) {
        Iterator<T> iterator = children.iterator();
        while (iterator.hasNext()) {
            T child = iterator.next();
            if (predicate.test(child))
                iterator.remove();
        }
    }
}
