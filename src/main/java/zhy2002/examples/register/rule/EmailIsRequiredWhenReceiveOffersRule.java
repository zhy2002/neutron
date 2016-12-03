package zhy2002.examples.register.rule;

import zhy2002.examples.register.EmailNode;
import zhy2002.examples.register.ReceiveOffersNode;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.event.BooleanStateChangeEvent;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

/**
 * Mark email node as required if receives offer.
 */
public class EmailIsRequiredWhenReceiveOffersRule extends UiNodeRule<BooleanStateChangeEvent, ReceiveOffersNode> {

    public EmailIsRequiredWhenReceiveOffersRule(ReceiveOffersNode owner) {
        super(owner, PredefinedPhases.Post);
    }

    private ReceiveOffersNode getReceiveOffersNode() {
        return getOwner();
    }

    private EmailNode getEmailNode() {
        return getOwner().getParent().getEmailNode();
    }

    @Override
    protected void doFire(BooleanStateChangeEvent typedEvent) {
        Boolean value = getReceiveOffersNode().getValue();
        if(value != null && value) {
            getEmailNode().setRequired(true);
        } else {
            getEmailNode().setRequired(false);
        }
    }

    @Override
    public EnhancedLinkedList<Class<? extends BooleanStateChangeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(BooleanStateChangeEvent.class);
    }
}
