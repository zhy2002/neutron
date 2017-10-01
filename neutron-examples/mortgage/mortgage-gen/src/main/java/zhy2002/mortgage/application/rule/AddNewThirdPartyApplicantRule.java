package zhy2002.mortgage.application.rule;


import zhy2002.mortgage.application.gen.event.PersonNodeAddEvent;
import zhy2002.mortgage.application.gen.node.ApplicationNode;
import zhy2002.mortgage.application.gen.node.SelectRelatedPersonListNode;
import zhy2002.mortgage.application.gen.node.SelectRelatedPersonNode;
import zhy2002.neutron.core.*;
import zhy2002.neutron.core.di.Owner;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class AddNewThirdPartyApplicantRule extends UiNodeRule<SelectRelatedPersonListNode<?>> {

    @Inject
    ApplicationNode applicationNode;

    @Inject
    public AddNewThirdPartyApplicantRule(@Owner SelectRelatedPersonListNode<?> owner) {
        super(owner);
    }

    protected SelectRelatedPersonListNode<?> getSelectRelatedPersonListNode() {
        return getOwner();
    }

    @Override
    protected UiNode<?> findHost() {
        return applicationNode.getAdditionalNode().getRelatedPartyListNode();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new NodeAddEventBinding<>(
                        this::importRelatedParty,
                        PersonNodeAddEvent.class
                )
        );
    }

    private void importRelatedParty(PersonNodeAddEvent addEvent) {
        SelectRelatedPersonNode itemNode = getOwner().createItem();

        class Config extends UiNodeConfig<SelectRelatedPersonNode> {

            private Config(SelectRelatedPersonNode owner) {
                super(owner);
            }

            @Override
            public void exitLoad() {
                itemNode.getRelatedPersonReferenceNode().setValue(addEvent.getOrigin().getPath());
            }
        }

        new Config(itemNode);
    }
}
