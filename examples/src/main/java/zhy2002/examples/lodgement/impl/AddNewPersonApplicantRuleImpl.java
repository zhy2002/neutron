package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.event.PersonNodeAddEvent;
import zhy2002.examples.lodgement.gen.rule.AddNewPersonApplicantRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeAddEventBinding;
import zhy2002.neutron.NopUiNodeStatusListener;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

/**
 * Add a ownership node when a new person applicant is added.
 */
public class AddNewPersonApplicantRuleImpl extends AddNewPersonApplicantRule {

    private ApplicationNode applicationNode;

    @Inject
    public AddNewPersonApplicantRuleImpl(@Owner OwnershipListNode<?> owner) {
        super(owner);
        applicationNode = (ApplicationNode) owner.getContext().getRootNode();
    }

    @Override
    protected UiNode<?> findHost() {
        return applicationNode.getPersonListNode();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new NodeAddEventBinding<>(
                        this::importApplicant,
                        PersonNodeAddEvent.class,
                        applicationNode.getPersonListNode().getName()
                )
        );
    }

    private void importApplicant(PersonNodeAddEvent addEvent) {
        OwnershipNode ownershipNode = getOwnershipListNode().createItem();

        ownershipNode.setStatusListener(new NopUiNodeStatusListener() {
            @Override
            public void postLoad() {
                ownershipNode.getApplicantReferenceNode().setValue(addEvent.getOrigin().getPath());
            }
        });
    }
}


