package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.event.TelephoneStateChangeEvent;
import zhy2002.examples.lodgement.gen.node.ContactTelephoneNode;
import zhy2002.examples.lodgement.gen.node.PersonContactNode;
import zhy2002.examples.lodgement.gen.node.PersonHomePhoneNode;
import zhy2002.examples.lodgement.gen.node.TelephoneNode;
import zhy2002.examples.lodgement.gen.rule.HomeOrWorkPhoneRequiredRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.GenericStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class HomeOrWorkPhoneRequiredRuleImpl extends HomeOrWorkPhoneRequiredRule {

    @Inject
    public HomeOrWorkPhoneRequiredRuleImpl(@Owner PersonContactNode owner) {
        super(owner);
    }

    private PersonHomePhoneNode getHomePhoneNode() {
        return getPersonContactNode().getPersonHomePhoneNode();
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

        TelephoneNode<?> homePhoneNode = getHomePhoneNode();
        TelephoneNode<?> workPhoneNode = getWorkPhoneNode();

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
