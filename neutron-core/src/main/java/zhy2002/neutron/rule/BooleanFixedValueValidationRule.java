package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.node.BooleanUiNode;
import zhy2002.neutron.util.CollectionUtil;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import java.util.Collection;

public class BooleanFixedValueValidationRule extends ValidationRule<BooleanUiNode<?>> {

    @Inject
    public BooleanFixedValueValidationRule(@Owner BooleanUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new BooleanStateChangeEventBinding(e -> validate()),
                new BooleanStateChangeEventBinding(
                        e -> validate(),
                        NeutronEventSubjects.FIXED_VALUE
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        Boolean fixedValue = getOwner().getFixedValue();
        Boolean value = getOwner().getValue();
        if (fixedValue == null || value == null)
            return null;

        if (fixedValue.equals(value))
            return null;

        return "Value must be " + !value;
    }
}
