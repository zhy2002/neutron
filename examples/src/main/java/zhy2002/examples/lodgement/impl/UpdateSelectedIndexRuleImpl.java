package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.PersonListNode;
import zhy2002.examples.lodgement.gen.event.PersonNodeRemoveEvent;
import zhy2002.examples.lodgement.gen.rule.UpdateSelectedIndexRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeRemoveEventBinding;

import java.util.Collection;
import java.util.Collections;


public class UpdateSelectedIndexRuleImpl extends UpdateSelectedIndexRule {

    public UpdateSelectedIndexRuleImpl(PersonListNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new NodeRemoveEventBinding<>(
                        this::updateSelectedIndex,
                        PersonNodeRemoveEvent.class,
                        "personListNode"
                )
        );
    }

    private void updateSelectedIndex(PersonNodeRemoveEvent event) {
        PersonListNode personListNode = getPersonListNode();
        if (personListNode.getSelectedIndex() >= personListNode.getItemCount()) {
            personListNode.setSelectedIndex(Math.max(0, personListNode.getItemCount() - 1));
        }
    }
}
