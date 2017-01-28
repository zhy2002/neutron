package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.EmploymentNode;
import zhy2002.examples.lodgement.gen.EmploymentTypeNode;
import zhy2002.examples.lodgement.gen.rule.EmploymentTypeChangedRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEventBinding;

import java.util.Collection;
import java.util.Collections;

public class EmploymentTypeChangedRuleImpl extends EmploymentTypeChangedRule {

    public EmploymentTypeChangedRuleImpl(EmploymentTypeNode owner) {
        super(owner);
    }

    private EmploymentNode<?> getEmploymentNode() {
        return getOwner().getParent();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new StringStateChangeEventBinding(
                        this::changeEmploymentType
                )
        );
    }

    //todo this is a temporary solution
    //replace with load default json or deferred init instead
    @Override
    public void addToOwner() {
        super.addToOwner();

        changeEmploymentType(getOwner().getValue());
    }

    private void changeEmploymentType(StringStateChangeEvent event) {
        String newType = event.getNewValue();
        changeEmploymentType(newType);
    }

    private void changeEmploymentType(String newType) {
        for (UiNode<?> node : getEmploymentNode().getChildren()) {
            if (node.getName().equals(newType)) {
                node.setDisabled(false);
                getEmploymentNode().setSelectedName(newType);
            } else {
                node.setDisabled(true);
            }
        }
    }
}