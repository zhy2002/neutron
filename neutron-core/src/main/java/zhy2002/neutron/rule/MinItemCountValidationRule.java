package zhy2002.neutron.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.IntegerStateChangeEventBinding;
import zhy2002.neutron.util.CollectionUtil;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import java.util.Collection;


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
                        NeutronEventSubjects.MIN_ITEM_COUNT
                ),
                new GenericNodeAddEventBinding(
                        (e) -> e.getOrigin().getParent() == getOwner(),
                        (e) -> validate()
                ),
                new GenericNodeRemoveEventBinding(
                        (e) -> e.getOrigin().getParent() == getOwner(),
                        (e) -> validate()
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        if (getOwner().getMinItemCount() == null)
            return null;

        int minCount = getOwner().getMinItemCount();
        if (getOwner().getItemCount() < minCount)
            return "Must have at least " + minCount + " item(s).";

        return null;
    }
}
