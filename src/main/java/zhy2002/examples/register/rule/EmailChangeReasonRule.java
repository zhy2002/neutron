package zhy2002.examples.register.rule;

import zhy2002.examples.register.EmailNode;
import zhy2002.neutron.*;
import zhy2002.neutron.rule.UiNodeRule;

/**
 * A rule that tracks why email is changed.
 */
public class EmailChangeReasonRule extends UiNodeRule<StateChangeEvent<String>, EmailNode> {

    public EmailChangeReasonRule(EmailNode owner) {
        super(owner, DefaultPhases.Validate);
    }

    @Override
    public void addToOwner() {
        super.addToOwner();

        getOwner().setStateValue("TriggeredBy", "user direct");
    }

    @Override
    protected void execute(StateChangeEvent<String> typedEvent) {

        String triggeredBy = "user direct";
        UiNodeRuleActivation activation = typedEvent.getActivation();
        if (activation != null) {
            triggeredBy = activation.getRule().getClass().getSimpleName();
        }
        getOwner().setStateValue("TriggeredBy", triggeredBy);

    }

    @Override
    public UiNodeEventTypeEnum getEventType() {
        return UiNodeEventTypeEnum.StateChange;
    }
}
