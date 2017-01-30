package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.node.BigDecimalUiNode;
import zhy2002.neutron.util.CollectionUtil;
import zhy2002.neutron.util.NeutronEventSubjects;

import java.util.Collection;
import java.util.Collections;

/**
 * Validate that the text in a BigDecimalUiNode is a valid number.
 */
public class NumberFormatValidationRule extends ValidationRule<BigDecimalUiNode<?>> {

    public NumberFormatValidationRule(BigDecimalUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new BooleanStateChangeEventBinding(
                        e -> validate(),
                        Collections.singletonList(NeutronEventSubjects.VALUE_VALID)
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        return "Not a valid number";
    }

    @Override
    protected boolean isActivated() {
        return !getOwner().isValueValid();
    }
}
