package zhy2002.neutron.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.event.IntegerStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;

/**
 * If the number of items is smaller than minItemCount then createProperty items.
 * This is an optional rule for ListUiNode. You need to include it explicitly.
 */
public class AutoCreateListItemRule extends UiNodeRule<ListUiNode<?, ?>> {

    @Inject
    protected AutoCreateListItemRule(@Owner ListUiNode<?, ?> owner) {
        super(owner);
    }

    private final UiNodeChangeListener listener = new UiNodeChangeListener() {
        @Override
        protected void onUiNodeChanged() {
            addItems(null);
        }
    };

    @Override
    protected void onLoad() {
        super.onLoad();

        getOwner().addChangeListener(listener);
    }

    @Override
    protected void onUnload() {
        getOwner().removeChangeListener(listener);

        super.onUnload();
    }

    @Override
    protected UiNode<?> findHost() {
        return getOwner().getContext().getRootNode();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new BooleanStateChangeEventBinding(
                        e -> Boolean.FALSE.equals(e.getNewValue()),
                        this::addItems,
                        RootUiNode.LOADING_PROPERTY.getStateKey()
                ),
                new IntegerStateChangeEventBinding(
                        e -> e.getOrigin() == getOwner(),
                        this::addItems,
                        ListUiNode.MIN_ITEM_COUNT_PROPERTY.getStateKey(),
                        null
                )
        );
    }

    private void addItems(UiNodeEvent event) {
        if (getOwner().getMinItemCount() == null)
            return;

        if (getOwner().getItemCount() < getOwner().getMinItemCount()) {
            getOwner().createItem();
        }
    }
}
