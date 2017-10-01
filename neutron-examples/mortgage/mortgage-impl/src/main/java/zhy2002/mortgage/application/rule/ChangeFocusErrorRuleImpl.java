package zhy2002.mortgage.application.rule;


import zhy2002.mortgage.application.gen.node.*;
import zhy2002.mortgage.application.gen.rule.ChangeFocusErrorRule;
import zhy2002.mortgage.application.shared.NodeUtil;
import zhy2002.neutron.core.*;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEvent;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;

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
                        ErrorListNode.FOCUS_PROPERTY.getStateKey()
                )
        );
    }

    private void updateFocusError(StringStateChangeEvent event) {

        String errorNodeName = event.getNewValue();
        ErrorNode errorNode = getOwner().getItemByName(errorNodeName);
        if (errorNode == null || errorNode.getSource() == null)
            return;

        boolean isThirdParty = false;
        UiNode<?> node = errorNode.getSource();
        while (node.getParent() != null) {
            if (node instanceof RelatedPartyNode) {
                isThirdParty = true;
            }
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
                int level;
                if (event.getOrigin() != node && NodeUtil.hasTab(node)) {
                    level = 2;
                } else if (isThirdParty) {
                    level = 3;
                } else {
                    level = 1;
                }
                ((ApplicationNode) parent).setContentLevel(level);
            }

            node = parent;
        } //todo allow code gen nodes to implement interface

    }
}
