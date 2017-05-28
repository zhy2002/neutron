package zhy2002.examples.lodgement.shared;

import zhy2002.examples.lodgement.gen.event.TelephoneStateChangeEvent;
import zhy2002.examples.lodgement.gen.node.PersonContactNode;
import zhy2002.examples.lodgement.gen.node.PersonTelephoneNode;
import zhy2002.examples.lodgement.gen.node.TelephoneNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.GenericStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class HomeOrWorkPhoneRequiredRule extends UiNodeRule<PersonContactNode> {

    @Inject
    public HomeOrWorkPhoneRequiredRule(@Owner PersonContactNode owner) {
        super(owner);
    }

    protected PersonContactNode getPersonContactNode() {
        return getOwner();
    }

    private PersonTelephoneNode getHomePhoneNode() {
        return getPersonContactNode().getHomePhoneNode();
    }

    private PersonTelephoneNode getWorkPhoneNode() {
        return getPersonContactNode().getWorkPhoneNode();
    }

    @Override
    protected void onLoad() {
        super.onLoad();

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
        TelephoneNode<?> homePhoneNode = getHomePhoneNode();
        TelephoneNode<?> workPhoneNode = getWorkPhoneNode();

        if (homePhoneNode.isValueUpdated()) {
            workPhoneNode.setRequired(false);
        } else if (workPhoneNode.isValueUpdated()) {
            homePhoneNode.setRequired(false);
        } else {
            homePhoneNode.setRequired(true);
            workPhoneNode.setRequired(true);
        }
    }
}
