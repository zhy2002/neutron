package zhy2002.examples.register.rule;

import zhy2002.examples.register.EmailNode;
import zhy2002.neutron.*;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.rule.UiNodeRule;

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
    public Class<StringStateChangeEvent> getEventType() {
        return StringStateChangeEvent.class;
    }
}
