package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.FirstNameNode;
import zhy2002.examples.lodgement.gen.LastNameNode;
import zhy2002.examples.lodgement.gen.PersonNode;
import zhy2002.examples.lodgement.gen.rule.UpdatePersonNodeLabelRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.event.IntegerStateChangeEventBinding;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.util.NeutronEventSubjects;
import zhy2002.neutron.util.ValueUtil;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class UpdatePersonNodeLabelRuleImpl extends UpdatePersonNodeLabelRule {

    public UpdatePersonNodeLabelRuleImpl(PersonNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new StringStateChangeEventBinding(
                        this::filter,
                        this::updateLabel
                ),
                new IntegerStateChangeEventBinding(
                        this::updateLabel,
                        Collections.singletonList(NeutronEventSubjects.INDEX)
                ),
                new RefreshEventBinding(
                        this::updateLabel,
                        Collections.singletonList(NeutronEventSubjects.NODE_LOADED_REFRESH_REASON)
                )
        );
    }

    private FirstNameNode getFirstNameNode() {
        return getPersonNode().getPersonGeneralNode().getFirstNameNode();
    }

    private LastNameNode getLastNameNode() {
        return getPersonNode().getPersonGeneralNode().getLastNameNode();
    }

    private boolean filter(UiNodeEvent event) {
        FirstNameNode firstNameNode = getFirstNameNode();
        LastNameNode lastNameNode = getLastNameNode();
        return event.getOrigin() == firstNameNode || event.getOrigin() == lastNameNode;
    }

    private void updateLabel(UiNodeEvent event) {
        String firstName = getFirstNameNode().getValue();
        String lastName = getLastNameNode().getValue();

        if (!ValueUtil.isEmpty(firstName) || !ValueUtil.isEmpty(lastName)) {
            getPersonNode().setNodeLabel(firstName + " " + lastName);
        } else {
            getPersonNode().setNodeLabel("[Person " + (getPersonNode().getIndex() + 1) + "]");
        }
    }
}
