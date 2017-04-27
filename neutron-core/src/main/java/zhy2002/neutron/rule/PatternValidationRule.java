package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.node.StringUiNode;
import zhy2002.neutron.util.CollectionUtil;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Built in string pattern validation.
 */
public class PatternValidationRule extends ValidationRule<StringUiNode<?>> {

    @Inject
    public PatternValidationRule(@Owner StringUiNode<?> owner) {
        super(owner);
    }

    private String getPattern() {
        return getOwner().getPattern();
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
