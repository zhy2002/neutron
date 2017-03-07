package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.event.PersonNodeAddEvent;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.node.SelectRelatedPersonListNode;
import zhy2002.examples.lodgement.gen.node.SelectRelatedPersonNode;
import zhy2002.examples.lodgement.gen.rule.AddNewPersonRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeAddEventBinding;
import zhy2002.neutron.NopUiNodeStatusListener;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class AddNewPersonRuleImpl extends AddNewPersonRule {

    @Inject
    ApplicationNode applicationNode;

    @Inject
    public AddNewPersonRuleImpl(@Owner SelectRelatedPersonListNode<?> owner) {
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
        SelectRelatedPersonNode itemNode = getOwner().createItem();

        itemNode.setStatusListener(new NopUiNodeStatusListener() {
            @Override
            public void postLoad() {
                itemNode.getRelatedPersonReferenceNode().setValue(addEvent.getOrigin().getPath());
            }
        });
    }
}
