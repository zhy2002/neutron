package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.PredefinedEventSubjects;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.node.StringUiNode;
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
                        e -> validate(),
                        Collections.singletonList(PredefinedEventSubjects.REQUIRED)
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
