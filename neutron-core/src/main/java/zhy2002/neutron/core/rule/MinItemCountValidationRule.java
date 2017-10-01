package zhy2002.neutron.core.rule;

import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.ListUiNode;
import zhy2002.neutron.core.ValidationRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.AnyNodeAddEventBinding;
import zhy2002.neutron.core.event.AnyNodeRemoveEventBinding;
import zhy2002.neutron.core.event.IntegerStateChangeEventBinding;
import zhy2002.neutron.core.util.CollectionUtil;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Optional item count validation for ListUiNode.
 */
public class MinItemCountValidationRule extends ValidationRule<ListUiNode<?, ?>> {

    @Inject
    public MinItemCountValidationRule(@Owner ListUiNode<?, ?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new IntegerStateChangeEventBinding(
                        (e) -> validate(),
                        ListUiNode.MIN_ITEM_COUNT_PROPERTY.getStateKey()
                ),
                new AnyNodeAddEventBinding(
                        (e) -> e.getOrigin().getParent() == getOwner(),
                        (e) -> validate()
                ),
                new AnyNodeRemoveEventBinding(
                        (e) -> e.getOrigin().getParent() == getOwner(),
                        (e) -> validate()
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        //cannot use filter to check minItemCount because filters run at activation stage (the change event is not applied).
        if (getOwner().getMinItemCount() == null)
            return null;

        int minCount = getOwner().getMinItemCount();
        if (getOwner().getItemCount() < minCount)
            return "Must have at least " + minCount + " item(s).";

        return null;
    }
}
