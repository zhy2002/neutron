package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.node.BooleanUiNode;
import zhy2002.neutron.util.CollectionUtil;
import zhy2002.neutron.util.NeutronEventSubjects;

import java.util.Collection;
import java.util.Collections;

public class BooleanFixedValueValidationRule extends ValidationRule<BooleanUiNode<?>> {

    public BooleanFixedValueValidationRule(BooleanUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new BooleanStateChangeEventBinding(e -> validate()),
                new BooleanStateChangeEventBinding(e -> validate(), Collections.singleton(NeutronEventSubjects.FIXED_VALUE))
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
