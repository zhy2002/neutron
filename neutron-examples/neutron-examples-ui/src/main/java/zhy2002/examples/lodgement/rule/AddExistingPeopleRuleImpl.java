package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.rule.AddExistingPeopleRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.RefreshUiNodeEvent;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;


public class AddExistingPeopleRuleImpl extends AddExistingPeopleRule {

    @Inject
    ApplicationNode applicationNode;

    @Inject
    public AddExistingPeopleRuleImpl(@Owner SelectRelatedPersonListNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new RefreshEventBinding(
                        this::importPeople,
                        Collections.singletonList(NeutronEventSubjects.NODE_LOADED_REFRESH_REASON)
                )
        );
    }

    private void importPeople(RefreshUiNodeEvent event) { //todo extract common
        PersonListNode personListNode = applicationNode.getPersonListNode();
        for (int i = 0; i < personListNode.getItemCount(); i++) {
            PersonNode personNode = personListNode.getItem(i);
            NodeAddEvent<SelectRelatedPersonNode> addEvent = getOwner().createItemAddEvent();
            SelectRelatedPersonNode itemNode = addEvent.getOrigin();
            addEvent.apply(); //bypass node load rules
            itemNode.getRelatedPersonReferenceNode().setValue(personNode.getPath());
        }
        RelatedPartyListNode relatedPartyListNode = applicationNode.getAdditionalNode().getRelatedPartyListNode();
        for (int i = 0; i < relatedPartyListNode.getItemCount(); i++) {
            NodeAddEvent<SelectRelatedPersonNode> addEvent = getOwner().createItemAddEvent();
            SelectRelatedPersonNode itemNode = addEvent.getOrigin();
            addEvent.apply();
            RelatedPartyNode relatedPartyNode = relatedPartyListNode.getItem(i);
            itemNode.getRelatedPersonReferenceNode().setValue(relatedPartyNode.getPath());
        }

    }
}
