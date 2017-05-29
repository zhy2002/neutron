package zhy2002.examples.lodgement.rule;


import zhy2002.examples.lodgement.data.ApplicationNodeConstants;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.rule.ChangeFocusErrorRule;
import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class ChangeFocusErrorRuleImpl extends ChangeFocusErrorRule {

    @Inject
    public ChangeFocusErrorRuleImpl(@Owner ErrorListNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new StringStateChangeEventBinding(
                        this::updateFocusError,
                        ApplicationNodeConstants.FOCUS
                )
        );
    }

    private void updateFocusError(StringStateChangeEvent event) {

        String errorNodeName = event.getNewValue();
        ErrorNode errorNode = getOwner().getItemByName(errorNodeName);
        if (errorNode == null || errorNode.getSource() == null)
            return;

        UiNode<?> node = errorNode.getSource();
        while (node.getParent() != null) {
            ParentUiNode<?> parent = node.getParent();
            if (parent instanceof ListUiNode) {
                ListUiNode<?, ?> listUiNode = (ListUiNode<?, ?>) parent;
                int selectedIndex = listUiNode.getSelectedIndex();
                if (selectedIndex != node.getIndex()) {
                    listUiNode.setSelectedIndex(node.getIndex());
                }

            } else if (parent instanceof ObjectUiNode) {
                ObjectUiNode<?> objectUiNode = (ObjectUiNode<?>) parent;
                String selectedName = objectUiNode.getSelectedName();
                if (!node.getName().equals(selectedName)) {
                    objectUiNode.setSelectedName(node.getName());
                }
            }

            if (parent instanceof ApplicationNode) {
                if (event.getOrigin() != node && (node instanceof PersonListNode || node instanceof CompanyListNode || node instanceof RealEstateListNode)) {
                    ((ApplicationNode) parent).setContentLevel(2);
                } else {
                    ((ApplicationNode) parent).setContentLevel(1);
                }
            }

            node = parent;
        } //todo allow code gen nodes to implement interface

    }
}
