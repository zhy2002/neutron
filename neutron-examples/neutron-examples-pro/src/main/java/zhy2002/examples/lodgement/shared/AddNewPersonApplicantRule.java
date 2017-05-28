package zhy2002.examples.lodgement.shared;

import zhy2002.examples.lodgement.gen.event.PersonNodeAddEvent;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.node.OwnershipListNode;
import zhy2002.examples.lodgement.gen.node.OwnershipNode;
import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

/**
 * Add a ownership node when a new person applicant is added.
 */
public class AddNewPersonApplicantRule extends UiNodeRule<OwnershipListNode<?>> {

    private ApplicationNode applicationNode;

    @Inject
    public AddNewPersonApplicantRule(@Owner OwnershipListNode<?> owner) {
        super(owner);
        applicationNode = (ApplicationNode) owner.getContext().getRootNode();
    }

    protected OwnershipListNode<?> getOwnershipListNode() {
        return getOwner();
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
                        PersonNodeAddEvent.class
                )
        );
    }

    private void importApplicant(PersonNodeAddEvent addEvent) {
        OwnershipNode ownershipNode = getOwnershipListNode().createItem();

        class Config extends UiNodeConfig<OwnershipNode> {

            private Config(OwnershipNode owner) {
                super(owner);
            }

            @Override
            public void exitLoad() {
                ownershipNode.getApplicantReferenceNode().setValue(addEvent.getOrigin().getPath());
            }
        }

        new Config(ownershipNode);
    }
}


