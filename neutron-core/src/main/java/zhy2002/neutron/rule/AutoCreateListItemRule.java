package zhy2002.neutron.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.IntegerStateChangeEventBinding;
import zhy2002.neutron.util.NeutronConstants;

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

    private final UiNodeChangeListener listener = () -> addItems(null);

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
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new RefreshEventBinding(
                        this::addItems,
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                ),
                new IntegerStateChangeEventBinding(
                        this::addItems,
                        ListUiNode.MIN_ITEM_COUNT_PROPERTY.getStateKey()
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
