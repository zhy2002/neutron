package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.event.PersonNodeAddEvent;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.node.SelectAccountHolderListNode;
import zhy2002.examples.lodgement.gen.node.SelectAccountHolderNode;
import zhy2002.examples.lodgement.gen.rule.AddNewPersonHolderRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeAddEventBinding;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeConfig;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class AddNewPersonHolderRuleImpl extends AddNewPersonHolderRule {

    @Inject
    ApplicationNode applicationNode;

    @Inject
    public AddNewPersonHolderRuleImpl(@Owner SelectAccountHolderListNode<?> owner) {
        super(owner);
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
                        PersonNodeAddEvent.class,
                        applicationNode.getPersonListNode().getName()
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
