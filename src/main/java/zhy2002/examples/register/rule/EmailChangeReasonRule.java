package zhy2002.examples.register.rule;

import zhy2002.examples.register.EmailNode;
import zhy2002.neutron.*;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.rule.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

/**
 * A rule that tracks why email is changed.
 */
public class EmailChangeReasonRule extends UiNodeRule<StringStateChangeEvent, EmailNode> {

    public EmailChangeReasonRule(EmailNode owner) {
        super(owner, PredefinedPhases.Validate);
    }

    @Override
    public void addToOwner() {
        super.addToOwner();

        getOwner().setChangeTrackMode(ChangeTrackModeEnum.None);
        getOwner().setTriggeredBy("user direct");
        getOwner().setChangeTrackMode(ChangeTrackModeEnum.Reference);
    }

    @Override
    protected void execute(StringStateChangeEvent typedEvent) {

        String triggeredBy = "user direct";
        UiNodeRuleActivation activation = typedEvent.getActivation();
        if (activation != null) {
            triggeredBy = activation.getRule().getClass().getSimpleName();
        }
        getOwner().setTriggeredBy(triggeredBy);

    }

    @Override
    public EnhancedLinkedList<Class<? extends StringStateChangeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(StringStateChangeEvent.class);
    }
}
