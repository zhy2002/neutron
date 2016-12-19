package zhy2002.neutron.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.util.CollectionUtil;
import zhy2002.neutron.util.ValueUtil;

import java.util.Collection;
import java.util.Collections;

public class StringValueRequiredValidationRule extends ValidationRule<StringUiNode<?>> {

    public StringValueRequiredValidationRule(StringUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new StringStateChangeEventBinding(e -> validate()),
                new BooleanStateChangeEventBinding(
                        null,
                        e->validate(),
                        Collections.singletonList(PredefinedEventSubjects.REQUIRED),
                        null
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        return "Value is required";
    }

    @Override
    protected boolean isActivated() {
        Boolean required = getOwner().getRequired();
        return Boolean.TRUE.equals(required) && ValueUtil.isEmpty(getOwner().getValue());
    }
}
