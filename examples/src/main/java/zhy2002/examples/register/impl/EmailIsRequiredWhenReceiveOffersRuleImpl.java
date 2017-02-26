package zhy2002.examples.register.impl;

import zhy2002.examples.register.gen.node.*;
import zhy2002.examples.register.gen.rule.EmailIsRequiredWhenReceiveOffersRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;

/**
 * Mark email node as required if receives offer.
 */
public class EmailIsRequiredWhenReceiveOffersRuleImpl extends EmailIsRequiredWhenReceiveOffersRule {

    @Inject
    public EmailIsRequiredWhenReceiveOffersRuleImpl(@Owner ReceiveOffersNode owner) {
        super(owner);
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
