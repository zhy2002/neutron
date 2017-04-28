package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.rule.AddExistingHoldersRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.RefreshUiNodeEvent;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.util.NeutronConstants;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

/**
 * When an ownership list is created reference all applicant nodes.
 */
public class AddExistingHoldersRuleImpl extends AddExistingHoldersRule {

    ApplicationNode applicationNode;

    @Inject
    public AddExistingHoldersRuleImpl(@Owner SelectAccountHolderListNode<?> owner) {
        super(owner);

        applicationNode = (ApplicationNode) owner.getContext().getRootNode();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new RefreshEventBinding(
                        this::importApplicants,
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                )
        );
    }

    private void importApplicants(RefreshUiNodeEvent event) {
        PersonListNode personListNode = applicationNode.getPersonListNode();
        for (int i = 0; i < personListNode.getItemCount(); i++) {
            PersonNode personNode = personListNode.getItem(i);
            NodeAddEvent<SelectAccountHolderNode> addEvent = getSelectAccountHolderListNode().createItemAddEvent();
            SelectAccountHolderNode ownershipNode = addEvent.getOrigin();
            addEvent.apply(); //bypass node load rules
            ownershipNode.getAccountHolderReferenceNode().setValue(personNode.getPath());
        }
        CompanyListNode companyListNode = applicationNode.getCompanyListNode();
        for (int i = 0; i < companyListNode.getItemCount(); i++) {
            CompanyNode companyNode = companyListNode.getItem(i);
            NodeAddEvent<SelectAccountHolderNode> addEvent = getSelectAccountHolderListNode().createItemAddEvent();
            SelectAccountHolderNode ownershipNode = addEvent.getOrigin();
            addEvent.apply();
            ownershipNode.getAccountHolderReferenceNode().setValue(companyNode.getPath());
        }

    }
}
