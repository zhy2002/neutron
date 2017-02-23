package zhy2002.examples.lodgement.impl;


import zhy2002.examples.lodgement.data.ApplicationNodeConstants;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.ChangeFocusErrorRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.ParentUiNode;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.util.NeutronEventSubjects;

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
                        Collections.singletonList(ApplicationNodeConstants.FOCUS)
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
            ParentUiNode<?> parent = node.getParent(); //todo make code gen metadata available at runtime
            Integer selectedIndex = parent.getStateValue(NeutronEventSubjects.SELECTED_INDEX);
            if (selectedIndex != null && !selectedIndex.equals(node.getIndex())) {
                parent.setStateValue(NeutronEventSubjects.SELECTED_INDEX, Integer.class, node.getIndex());
            } else {
                String selectedName = parent.getStateValue(NeutronEventSubjects.SELECTED_NAME);
                if (selectedName != null && !selectedName.equals(node.getName())) {
                    parent.setStateValue(NeutronEventSubjects.SELECTED_NAME, String.class, node.getName());
                }
            }

            if(parent instanceof ApplicationNode) {
                if(node instanceof PersonListNode || node instanceof CompanyListNode || node instanceof RealEstateListNode) {
                    ((ApplicationNode) parent).setContentLevel(2);
                } else {
                    ((ApplicationNode) parent).setContentLevel(1);
                }
            }

            node = parent;
        } //todo allow code gen nodes to implement interface

    }
}
