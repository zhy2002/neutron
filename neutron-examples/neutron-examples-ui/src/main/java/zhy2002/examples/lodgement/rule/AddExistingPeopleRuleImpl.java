package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.node.SelectRelatedPersonListNode;
import zhy2002.examples.lodgement.gen.node.SelectRelatedPersonNode;
import zhy2002.examples.lodgement.gen.rule.AddExistingPeopleRule;
import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.util.NeutronConstants;

import javax.inject.Inject;
import java.util.*;


public class AddExistingPeopleRuleImpl extends AddExistingPeopleRule {

    @Inject
    ApplicationNode applicationNode;

    @Inject
    public AddExistingPeopleRuleImpl(@Owner SelectRelatedPersonListNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new RefreshEventBinding(
                        e -> getContext().isLoaded(),
                        this::importPeople,
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                )
        );
    }

    private void importPeople(RefreshUiNodeEvent event) {
        List<UiNode<?>> sourceNodes = new ArrayList<>();
        sourceNodes.addAll(Arrays.asList(applicationNode.getPersonListNode().getChildren()));
        sourceNodes.addAll(Arrays.asList(applicationNode.getAdditionalNode().getRelatedPartyListNode().getChildren()));

        Set<String> referencedPaths = new HashSet<>();
        for (int i = 0; i < getOwner().getItemCount(); i++) {
            referencedPaths.add(getOwner().getItem(i).getRelatedPersonReferenceNode().getValue());
        }

        for (UiNode<?> sourceNode : sourceNodes) {
            if (referencedPaths.contains(sourceNode.getPath()))
                continue;

            NodeAddEvent<SelectRelatedPersonNode> addEvent = getOwner().createItemAddEvent();
            addEvent.apply(); //bypass node load rules
            SelectRelatedPersonNode itemNode = addEvent.getOrigin();
            itemNode.getRelatedPersonReferenceNode().setValue(sourceNode.getPath());
        }
    }
}
