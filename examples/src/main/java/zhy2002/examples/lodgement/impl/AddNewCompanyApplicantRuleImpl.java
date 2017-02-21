package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.ApplicationNode;
import zhy2002.examples.lodgement.gen.OwnershipListNode;
import zhy2002.examples.lodgement.gen.event.CompanyNodeAddEvent;
import zhy2002.examples.lodgement.gen.rule.AddNewCompanyApplicantRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeAddEventBinding;
import zhy2002.neutron.UiNode;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;


public class AddNewCompanyApplicantRuleImpl extends AddNewCompanyApplicantRule {

    private ApplicationNode applicationNode;

    public AddNewCompanyApplicantRuleImpl(OwnershipListNode<?> owner) {
        super(owner);

        applicationNode = (ApplicationNode)owner.getContext().getRootNode();
    }

    @Override
    protected UiNode<?> findHost() {
        return applicationNode.getCompanyListNode();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new NodeAddEventBinding<>(
                        this::importApplicant,
                        CompanyNodeAddEvent.class,
                        applicationNode.getCompanyListNode().getName()
                )
        );
    }

    private void importApplicant(CompanyNodeAddEvent addEvent) {
        getOwnershipListNode().createItem().getApplicantReferenceNode().setValue(addEvent.getOrigin().getPath());
    }
}
