package zhy2002.mortgage.application.rule;

import zhy2002.mortgage.application.gen.event.PersonNodeAddEvent;
import zhy2002.mortgage.application.gen.node.ApplicationNode;
import zhy2002.mortgage.application.gen.node.SelectAccountHolderListNode;
import zhy2002.mortgage.application.gen.node.SelectAccountHolderNode;
import zhy2002.neutron.core.*;
import zhy2002.neutron.core.di.Owner;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class AddNewPersonHolderRule extends UiNodeRule<SelectAccountHolderListNode<?>> {

    @Inject
    ApplicationNode applicationNode;

    @Inject
    public AddNewPersonHolderRule(@Owner SelectAccountHolderListNode<?> owner) {
        super(owner);
    }

    protected SelectAccountHolderListNode<?> getSelectAccountHolderListNode() {
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
                        this::importPerson,
                        PersonNodeAddEvent.class
                )
        );
    }

    private void importPerson(PersonNodeAddEvent addEvent) {
        SelectAccountHolderNode itemNode = getOwner().createItem();

        class Config extends UiNodeConfig<SelectAccountHolderNode> {

            private Config(SelectAccountHolderNode owner) {
                super(owner);
            }

            @Override
            public void exitLoad() {
                itemNode.getAccountHolderReferenceNode().setValue(addEvent.getOrigin().getPath());
            }
        }

        new Config(itemNode);
    }
}
