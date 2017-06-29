package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.node.OwnershipListNode;
import zhy2002.examples.lodgement.gen.node.OwnershipNode;
import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.config.NeutronConstants;

import javax.inject.Inject;
import java.util.*;

/**
 * When an ownership list is created reference all applicant nodes.
 */
public class AddExistingApplicantsRule extends UiNodeRule<OwnershipListNode<?>> {

    ApplicationNode applicationNode;

    @Inject
    public AddExistingApplicantsRule(@Owner OwnershipListNode<?> owner) {
        super(owner);

        applicationNode = (ApplicationNode) owner.getContext().getRootNode();
    }

    protected OwnershipListNode<?> getOwnershipListNode() {
        return getOwner();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new RefreshEventBinding(
                        e -> getContext().isLoaded(),
                        this::importApplicants,
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                )
        );
    }

    private void importApplicants(RefreshUiNodeEvent event) {
        List<UiNode<?>> sourceNodes = new ArrayList<>();
        sourceNodes.addAll(Arrays.asList(applicationNode.getPersonListNode().getChildren()));
        sourceNodes.addAll(Arrays.asList(applicationNode.getCompanyListNode().getChildren()));

        Set<String> referencedPaths = new HashSet<>();
        for (int i = 0; i < getOwner().getItemCount(); i++) {
            referencedPaths.add(getOwner().getItem(i).getApplicantReferenceNode().getValue());
        }

        for (UiNode<?> sourceNode : sourceNodes) {
            if (referencedPaths.contains(sourceNode.getPath()))
                continue;

            NodeAddEvent<OwnershipNode> addEvent = getOwner().createItemAddEvent();
            addEvent.apply(); //bypass node load rules
            OwnershipNode itemNode = addEvent.getOrigin();
            itemNode.getApplicantReferenceNode().setValue(sourceNode.getPath());
        }
    }
}
