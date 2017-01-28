package zhy2002.examples.lodgement.impl;


import zhy2002.examples.lodgement.gen.ContactTelephoneNode;
import zhy2002.examples.lodgement.gen.PersonContactNode;
import zhy2002.examples.lodgement.gen.event.TelephoneStateChangeEvent;
import zhy2002.examples.lodgement.gen.rule.HomeOrWorkPhoneRequiredRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.event.GenericStateChangeEventBinding;

import java.util.Collection;
import java.util.Collections;

public class HomeOrWorkPhoneRequiredRuleImpl extends HomeOrWorkPhoneRequiredRule {

    public HomeOrWorkPhoneRequiredRuleImpl(PersonContactNode owner) {
        super(owner);
    }

    private ContactTelephoneNode getHomePhoneNode() {
        return getPersonContactNode().getHomePhoneNode();
    }

    private ContactTelephoneNode getWorkPhoneNode() {
        return getPersonContactNode().getWorkPhoneNode();
    }

    @Override
    public void addToOwner() {
        super.addToOwner();

        updateRequiredPhone(null);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new GenericStateChangeEventBinding<>(
                        this::updateRequiredPhone,
                        TelephoneStateChangeEvent.class
                )
        );
    }

    //todo write test for this

    private void updateRequiredPhone(TelephoneStateChangeEvent event) {
        System.out.println("Updating telephone required property..");

        ContactTelephoneNode homePhoneNode = getHomePhoneNode();
        ContactTelephoneNode workPhoneNode = getWorkPhoneNode();

        if (homePhoneNode.hasValue()) {
            workPhoneNode.setRequired(false);
        } else if (workPhoneNode.hasValue()) {
            homePhoneNode.setRequired(false);
        } else {
            homePhoneNode.setRequired(true);
            workPhoneNode.setRequired(true);
        }
    }
}
