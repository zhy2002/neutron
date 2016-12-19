package zhy2002.examples.register.rule;

import zhy2002.examples.register.EmailNode;
import zhy2002.examples.register.ReceiveOffersNode;
import zhy2002.neutron.BooleanStateChangeEventBinding;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.UiNodeRule;

import java.util.Arrays;
import java.util.Collection;

/**
 * Mark email node as required if receives offer.
 */
public class EmailIsRequiredWhenReceiveOffersRule extends UiNodeRule<ReceiveOffersNode> {

    public EmailIsRequiredWhenReceiveOffersRule(ReceiveOffersNode owner) {
        super(owner);
    }

    private ReceiveOffersNode getReceiveOffersNode() {
        return getOwner();
    }

    private EmailNode getEmailNode() {
        return getOwner().getParent().getEmailNode();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new BooleanStateChangeEventBinding(
                        e -> updateEmailRequired()
                ),
                new RefreshEventBinding(
                        e -> updateEmailRequired()
                )
        );
    }

    private void updateEmailRequired() {
        Boolean value = getReceiveOffersNode().getValue();
        if (value != null && value) {
            getEmailNode().setRequired(true);
        } else {
            getEmailNode().setRequired(false);
        }
    }
}
