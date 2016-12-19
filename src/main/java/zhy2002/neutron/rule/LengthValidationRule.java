package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.PredefinedEventSubjects;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.node.StringUiNode;
import zhy2002.neutron.util.CollectionUtil;
import zhy2002.neutron.util.ValueUtil;

import java.util.Arrays;
import java.util.Collection;

public class LengthValidationRule extends ValidationRule<StringUiNode<?>> {

    public static final String ERROR_MESSAGE = "Length is invalid.";

    public LengthValidationRule(StringUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected String getErrorMessage() {
        return getOwner().getStateValue(PredefinedEventSubjects.LENGTH_MESSAGE, ERROR_MESSAGE);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new StringStateChangeEventBinding(
                        null,
                        e -> validate(),
                        Arrays.asList(PredefinedEventSubjects.VALUE, PredefinedEventSubjects.MIN_LENGTH, PredefinedEventSubjects.MAX_LENGTH),
                        null
                )
        );
    }

    @Override
    protected boolean isActivated() {
        String value = getOwner().getValue();
        if (ValueUtil.isEmpty(value))
            return false;

        Integer minLength = getOwner().getMinLength();
        if (minLength != null && value.length() < minLength)
            return true;

        Integer maxLength = getOwner().getMaxLength();
        if (maxLength != null && value.length() > maxLength)
            return true;

        return false;
    }
}
