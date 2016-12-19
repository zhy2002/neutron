package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.PredefinedEventSubjects;
import zhy2002.neutron.StringStateChangeEventBinding;
import zhy2002.neutron.StringUiNode;
import zhy2002.neutron.util.CollectionUtil;
import zhy2002.neutron.util.ValueUtil;

import java.util.Collection;

public class PatternValidationRule extends ValidationRule<StringUiNode<?>> {

    public PatternValidationRule(StringUiNode<?> owner) {
        super(owner);
    }

    private String getPattern() {
        return getOwner().getStateValue(PredefinedEventSubjects.PATTERN);
    }

    @Override
    protected String getErrorMessage() {
        return getOwner().getStateValue(PredefinedEventSubjects.PATTERN_MESSAGE, "Pattern is invalid.");
    }

    private String getValue() {
        return getOwner().getValue();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new StringStateChangeEventBinding(
                        e -> validate()
                )
        );
    }

    @Override
    protected boolean isActivated() {
        String pattern = getPattern();
        if (pattern == null)
            return false;
        String value = getValue();
        if (ValueUtil.isEmpty(value))
            return false;
        return !value.matches(pattern);
    }


}
