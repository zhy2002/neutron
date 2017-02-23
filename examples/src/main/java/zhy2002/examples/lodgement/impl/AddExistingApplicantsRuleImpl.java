package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.AddExistingApplicantsRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.RefreshUiNodeEvent;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

/**
 * When an ownership list is created reference all applicant nodes.
 */
public class AddExistingApplicantsRuleImpl extends AddExistingApplicantsRule {

    ApplicationNode applicationNode;

    @Inject
    public AddExistingApplicantsRuleImpl(@Owner OwnershipListNode<?> owner) {
        super(owner);

        applicationNode = (ApplicationNode) owner.getContext().getRootNode();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new RefreshEventBinding(
                        this::importApplicants,
                        Collections.singletonList(NeutronEventSubjects.NODE_LOADED_REFRESH_REASON)
                )
        );
    }

    private void importApplicants(RefreshUiNodeEvent event) {
        PersonListNode personListNode = applicationNode.getPersonListNode();
        for (int i = 0; i < personListNode.getItemCount(); i++) {
            PersonNode personNode = personListNode.getItem(i);
            NodeAddEvent<OwnershipNode> addEvent = getOwnershipListNode().createItemAddEvent();
            OwnershipNode ownershipNode = addEvent.getOrigin();
            addEvent.apply(); //bypass node load rules
            ownershipNode.getApplicantReferenceNode().setValue(personNode.getPath());
        }
        CompanyListNode companyListNode = applicationNode.getCompanyListNode();
        for (int i = 0; i < companyListNode.getItemCount(); i++) {
            CompanyNode companyNode = companyListNode.getItem(i);
            NodeAddEvent<OwnershipNode> addEvent = getOwnershipListNode().createItemAddEvent();
            OwnershipNode ownershipNode = addEvent.getOrigin();
            addEvent.apply();
            ownershipNode.getApplicantReferenceNode().setValue(companyNode.getPath());
        }

    }
}
