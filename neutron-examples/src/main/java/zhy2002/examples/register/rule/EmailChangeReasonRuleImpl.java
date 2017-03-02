package zhy2002.examples.register.rule;

import zhy2002.examples.register.gen.node.*;
import zhy2002.examples.register.gen.rule.EmailChangeReasonRule;
import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

/**
 * A rule that tracks why email is changed.
 */
public class EmailChangeReasonRuleImpl extends EmailChangeReasonRule {

    @Inject
    public EmailChangeReasonRuleImpl(@Owner EmailNode owner) {
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
