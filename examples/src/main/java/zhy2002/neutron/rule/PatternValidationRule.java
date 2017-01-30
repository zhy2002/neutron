package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.node.StringUiNode;
import zhy2002.neutron.util.CollectionUtil;
import zhy2002.neutron.util.NeutronEventSubjects;
import zhy2002.neutron.util.ValueUtil;

import java.util.Collection;

public class PatternValidationRule extends ValidationRule<StringUiNode<?>> {

    public PatternValidationRule(StringUiNode<?> owner) {
        super(owner);
    }

    private String getPattern() {
        return getOwner().getStateValue(NeutronEventSubjects.PATTERN);
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
    protected String getErrorMessage() {
        if (isActivated())
            return getOwner().getPatternMessage();
        return null;
    }

    private boolean isActivated() {
        String pattern = getPattern();
        if (pattern == null)
            return false;
        String value = getValue();
        if (ValueUtil.isEmpty(value))
            return false;
        return !value.matches(pattern);
    }


}
