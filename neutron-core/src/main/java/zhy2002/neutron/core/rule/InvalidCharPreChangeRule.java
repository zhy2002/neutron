package zhy2002.neutron.core.rule;

import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.exception.UiNodeEventException;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEvent;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;
import zhy2002.neutron.core.node.StringUiNode;
import zhy2002.neutron.core.PredefinedPhases;
import zhy2002.neutron.core.util.ValueUtil;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

/**
 * Optional pre rule for StringUiNode to revert whole cycle
 * when invalid chars are entered.
 */
public class InvalidCharPreChangeRule extends UiNodeRule<StringUiNode<?>> {

    @Inject
    public InvalidCharPreChangeRule(@Owner StringUiNode<?> owner) {
        super(owner);
    }

    private String getErrorMessage() {
        return getOwner().getInvalidCharsMessage();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new StringStateChangeEventBinding(
                        this::checkInvalidChars,
                        PredefinedPhases.Pre
                )
        );
    }

    private void checkInvalidChars(StringStateChangeEvent event) {
        String invalidChars = getOwner().getInvalidChars();
        String value = event.getNewValue();
        if (invalidChars == null || ValueUtil.isEmpty(value))
            return;

        for (int i = 0; i < invalidChars.length(); i++) {
            char ch = invalidChars.charAt(i);
            if (value.indexOf(ch) >= 0)
                throw new UiNodeEventException(getErrorMessage());
        }
    }
}
