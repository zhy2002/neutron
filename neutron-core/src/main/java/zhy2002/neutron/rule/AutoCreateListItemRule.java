package zhy2002.neutron.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.IntegerStateChangeEventBinding;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * If the number of items is smaller than minItemCount then create items.
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
                        Collections.singletonList(NeutronEventSubjects.NODE_LOADED_REFRESH_REASON)
                ),
                new IntegerStateChangeEventBinding(
                        this::addItems,
                        Collections.singletonList(NeutronEventSubjects.MIN_ITEM_COUNT)
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
