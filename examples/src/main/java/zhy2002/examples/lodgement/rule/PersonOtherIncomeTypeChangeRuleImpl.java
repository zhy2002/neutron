package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.rule.PersonOtherIncomeTypeChangeRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class PersonOtherIncomeTypeChangeRuleImpl extends PersonOtherIncomeTypeChangeRule {

    @Inject
    public PersonOtherIncomeTypeChangeRuleImpl(@Owner PersonOtherIncomeTypeNode owner) {
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

    private PersonOtherIncomeNode getPersonOtherIncomeNode() {
        return getOwner().getParent();
    }

    private void updateUi() {
        String value = getPersonOtherIncomeTypeNode().getValue();
        PersonOtherIncomeNode personOtherIncomeNode = getPersonOtherIncomeNode();
        if ("Other Income".equals(value)) {
            personOtherIncomeNode.getPersonOtherIncomeDescriptionNode().setRequired(true);
            personOtherIncomeNode.getPersonOtherIncomeDescriptionNode().setDisabled(false);
        } else {
            personOtherIncomeNode.getPersonOtherIncomeDescriptionNode().setDisabled(true);
            personOtherIncomeNode.getPersonOtherIncomeDescriptionNode().setRequired(false);
            personOtherIncomeNode.getPersonOtherIncomeDescriptionNode().resetValue();
        }

        if ("Add Back".equals(value)) {
            personOtherIncomeNode.getPersonOtherIncomePreviousYearNode().setDisabled(false);
            personOtherIncomeNode.getPersonAddBackTypeNode().setDisabled(false);
        } else {
            personOtherIncomeNode.getPersonOtherIncomePreviousYearNode().setDisabled(true);
            personOtherIncomeNode.getPersonOtherIncomePreviousYearNode().resetValue();
            personOtherIncomeNode.getPersonAddBackTypeNode().setDisabled(true);
            personOtherIncomeNode.getPersonAddBackTypeNode().resetValue();
        }
    }
}
