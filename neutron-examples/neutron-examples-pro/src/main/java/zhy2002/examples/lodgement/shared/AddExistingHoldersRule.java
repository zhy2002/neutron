package zhy2002.examples.lodgement.shared;

import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.node.SelectAccountHolderListNode;
import zhy2002.examples.lodgement.gen.node.SelectAccountHolderNode;
import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.util.NeutronConstants;

import javax.inject.Inject;
import java.util.*;

/**
 * When an ownership list is created reference all applicant nodes.
 */
public class AddExistingHoldersRule extends UiNodeRule<SelectAccountHolderListNode<?>> {

    ApplicationNode applicationNode;

    @Inject
    public AddExistingHoldersRule(@Owner SelectAccountHolderListNode<?> owner) {
        super(owner);

        applicationNode = (ApplicationNode) owner.getContext().getRootNode();
    }

    protected SelectAccountHolderListNode<?> getSelectAccountHolderListNode() {
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
            referencedPaths.add(getOwner().getItem(i).getAccountHolderReferenceNode().getValue());
        }

        for (UiNode<?> sourceNode : sourceNodes) {
            if (referencedPaths.contains(sourceNode.getPath()))
                continue;

            NodeAddEvent<SelectAccountHolderNode> addEvent = getOwner().createItemAddEvent();
            addEvent.apply(); //bypass node load rules
            SelectAccountHolderNode itemNode = addEvent.getOrigin();
            itemNode.getAccountHolderReferenceNode().setValue(sourceNode.getPath());
        }
    }
}
