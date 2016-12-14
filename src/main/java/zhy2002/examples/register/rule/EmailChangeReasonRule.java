package zhy2002.examples.register.rule;

import zhy2002.examples.register.EmailNode;
import zhy2002.neutron.*;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.util.EnhancedLinkedList;

/**
 * A rule that tracks why email is changed.
 */
public abstract class EmailChangeReasonRule extends UiNodeRule<StringStateChangeEvent, EmailNode> {

    protected EmailChangeReasonRule(EmailNode owner) {
        super(owner, PredefinedPhases.Validate);
    }

    @Override
    public void addToOwner() {
        super.addToOwner();

        ChangeTrackingModeEnum mode = getOwner().getChangeTrackingMode();
        getOwner().setChangeTrackingMode(ChangeTrackingModeEnum.None);
        getOwner().setTriggeredBy("user direct");
        getOwner().setChangeTrackingMode(mode);
    }

    @Override
    protected boolean doCanFire(StringStateChangeEvent event) {
        return super.doCanFire(event) && event.getStateKey().equals(PredefinedUiNodeStateKeys.VALUE);
    }

    @Override
    protected void doFire(StringStateChangeEvent typedEvent) {

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
