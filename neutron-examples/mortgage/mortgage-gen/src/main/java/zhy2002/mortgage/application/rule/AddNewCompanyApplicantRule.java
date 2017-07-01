package zhy2002.mortgage.application.rule;

import zhy2002.mortgage.application.gen.event.CompanyNodeAddEvent;
import zhy2002.mortgage.application.gen.node.ApplicationNode;
import zhy2002.mortgage.application.gen.node.OwnershipListNode;
import zhy2002.mortgage.application.gen.node.OwnershipNode;
import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;


public class AddNewCompanyApplicantRule extends UiNodeRule<OwnershipListNode<?>> {

    @Inject
    ApplicationNode applicationNode;

    @Inject
    public AddNewCompanyApplicantRule(@Owner OwnershipListNode<?> owner) {
        super(owner);
    }

    protected OwnershipListNode<?> getOwnershipListNode() {
        return getOwner();
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
                        CompanyNodeAddEvent.class
                )
        );
    }

    private void importApplicant(CompanyNodeAddEvent addEvent) {
        final OwnershipNode ownershipNode = getOwnershipListNode().createItem();

        class Config extends UiNodeConfig<OwnershipNode> {
            private Config(OwnershipNode owner) {
                super(owner);
            }

            @Override
            public void exitLoad() {
                super.exitLoad();
                getOwner().getApplicantReferenceNode().setValue(addEvent.getOrigin().getPath());
            }
        }

        new Config(ownershipNode);
    }
}


