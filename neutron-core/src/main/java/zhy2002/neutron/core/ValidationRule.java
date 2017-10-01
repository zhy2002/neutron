package zhy2002.neutron.core;

import zhy2002.neutron.core.data.ValidationError;
import zhy2002.neutron.core.data.ValidationErrorList;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class ValidationRule<N extends UiNode<?>> extends UiNodeRule<N> {

    protected ValidationRule(N owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new RefreshEventBinding(
                        e -> true,
                        e -> validate()
                )
        );
    }

    protected void validate() {
        String errorMessage = getErrorMessage();

        if (errorMessage == null) {
            deactivate();
        } else {
            activate(errorMessage);
        }
    }

    protected abstract String getErrorMessage();

    private void activate(String errorMessage) {
        ValidationErrorList errors = getOwner().getValidationErrorList();
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
            errors.add(new ValidationError(getOwner(), errorMessage, this));
            getOwner().setValidationErrorList(errors);
        }
    }

    protected void deactivate() {
        List<ValidationError> errors = getOwner().getValidationErrorList();
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
            getOwner().setValidationErrorList(newErrors);
        }
    }
}
