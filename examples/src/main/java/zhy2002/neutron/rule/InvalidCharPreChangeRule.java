package zhy2002.neutron.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.node.StringUiNode;
import zhy2002.neutron.util.PredefinedPhases;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

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
