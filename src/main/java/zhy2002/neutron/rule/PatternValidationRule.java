package zhy2002.neutron.rule;

import zhy2002.neutron.PredefinedUiNodeStateKeys;
import zhy2002.neutron.StringUiNode;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.util.EnhancedLinkedList;
import zhy2002.neutron.util.ValueUtil;

import java.util.List;

public class PatternValidationRule extends ValidationRule<StringStateChangeEvent, StringUiNode<?>> {

    public PatternValidationRule(StringUiNode<?> owner) {
        super(owner);
    }

    private String getPattern() {
        return getOwner().getStateValue(PredefinedUiNodeStateKeys.PATTERN);
    }

    private String getPatternMessage() {
        return getOwner().getStateValue(PredefinedUiNodeStateKeys.PATTERN_MESSAGE, "Pattern is invalid.");
    }

    private String getValue() {
        return getOwner().getValue();
    }

    @Override
    public EnhancedLinkedList<Class<? extends StringStateChangeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(StringStateChangeEvent.class);
    }

    @Override
    protected boolean doCanFire(StringStateChangeEvent event) {
        return event.getStateKey().equals(PredefinedUiNodeStateKeys.PATTERN) || event.getStateKey().equals(PredefinedUiNodeStateKeys.VALUE);
    }

    @Override
    protected boolean isActivated(StringStateChangeEvent event) {
        String pattern = getPattern();
        if (pattern == null)
            return false;
        String value = getValue();
        if (ValueUtil.isEmpty(value))
            return false;
        return !value.matches(pattern);
    }

    @Override
    protected void activate(StringStateChangeEvent event) {
        ValidationErrorList errors = getOwner().getValidationErrors();
        if (errors == null) {
            errors = new ValidationErrorList();
        }
        boolean found = false;

        for (ValidationError error : errors) {
            if (error.getRule() == this && error.getOrigin() == getOwner()) {
                found = true;
                break;
            }
        }

        if (!found) {
            errors = new ValidationErrorList(errors);
            errors.add(new ValidationError(getOwner(), getPatternMessage(), this));
            getOwner().setValidationErrors(errors);
        }
    }

    @Override
    protected void deactivate(StringStateChangeEvent event) {
        List<ValidationError> errors = getOwner().getValidationErrors();
        if (errors == null)
            return;
        boolean removeError = false;
        ValidationErrorList newErrors = new ValidationErrorList();
        for (ValidationError error : errors) {
            if (error.getOrigin() == getOwner() && error.getRule() == this) {
                removeError = true;
            } else {
                newErrors.add(error);
            }
        }
        if (removeError) {
            getOwner().setValidationErrors(newErrors);
        }
    }
}
