package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.PersonResponsibleLendNode;
import zhy2002.examples.lodgement.gen.PersonSignificantChangeFlagNode;
import zhy2002.examples.lodgement.gen.rule.PersonSignificantChangeRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.event.StringStateChangeEventBinding;

import java.util.Collection;
import java.util.Collections;

public class PersonSignificantChangeRuleImpl extends PersonSignificantChangeRule {

    public PersonSignificantChangeRuleImpl(PersonSignificantChangeFlagNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new StringStateChangeEventBinding(
                        (e) -> updateUi()
                )
        );
    }

    @Override
    public void addToOwner() {
        super.addToOwner();

        updateUi();
    }

    private PersonResponsibleLendNode getPersonResponsibleLendNode() {
        return getOwner().getParent();
    }

    private void updateUi() {
        PersonResponsibleLendNode responsibleLendNode = getPersonResponsibleLendNode();
        if ("Yes".equals(getPersonSignificantChangeFlagNode().getValue())) {
            responsibleLendNode.getPersonTypeOfChangeNode().setDisabled(false);
            responsibleLendNode.getPersonMitigationMethodNode().setDisabled(false);
        } else {
            responsibleLendNode.getPersonTypeOfChangeNode().setDisabled(true);
            responsibleLendNode.getPersonTypeOfChangeNode().resetValue();
            responsibleLendNode.getPersonMitigationMethodNode().setDisabled(true);
            responsibleLendNode.getPersonMitigationMethodNode().resetValue();
        }
    }
}
