package zhy2002.examples.register.rule;

import zhy2002.examples.register.EmailNode;
import zhy2002.neutron.*;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEventBinding;

import java.util.Collection;
import java.util.Collections;

/**
 * A rule that tracks why email is changed.
 */
public class EmailChangeReasonRule extends UiNodeRule<EmailNode> {

    public EmailChangeReasonRule(EmailNode owner) {
        super(owner);
    }

    @Override
    public void addToOwner() {
        super.addToOwner();

        getOwner().setTriggeredBy("user direct");
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new StringStateChangeEventBinding(
                        this::setEmailChangeReason
                )
        );
    }

    private void setEmailChangeReason(StringStateChangeEvent typedEvent) {

        String triggeredBy = "user direct";
        BindingActivation activation = typedEvent.getActivation();
        if (activation != null && activation.getRule() != null) {
            triggeredBy = activation.getRule().getClass().getSimpleName();
        }
        getOwner().setTriggeredBy(triggeredBy);
    }
}
