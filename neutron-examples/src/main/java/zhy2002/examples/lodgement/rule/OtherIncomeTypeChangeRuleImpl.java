package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.node.OtherIncomeNode;
import zhy2002.examples.lodgement.gen.node.OtherIncomeTypeNode;
import zhy2002.examples.lodgement.gen.rule.OtherIncomeTypeChangeRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class OtherIncomeTypeChangeRuleImpl extends OtherIncomeTypeChangeRule {

    @Inject
    public OtherIncomeTypeChangeRuleImpl(@Owner OtherIncomeTypeNode owner) {
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

    private OtherIncomeNode getOtherIncomeNode() {
        return getOwner().getParent();
    }

    private void updateUi() {
        String value = getOtherIncomeTypeNode().getValue();
        OtherIncomeNode personOtherIncomeNode = getOtherIncomeNode();
        if ("Other Income".equals(value)) {
            personOtherIncomeNode.getOtherIncomeDescriptionNode().setRequired(true);
            personOtherIncomeNode.getOtherIncomeDescriptionNode().setDisabled(false);
        } else {
            personOtherIncomeNode.getOtherIncomeDescriptionNode().setDisabled(true);
            personOtherIncomeNode.getOtherIncomeDescriptionNode().setRequired(false);
            personOtherIncomeNode.getOtherIncomeDescriptionNode().resetValue();
        }

        if ("Add Back".equals(value)) {
            personOtherIncomeNode.getOtherIncomePreviousYearNode().setDisabled(false);
            personOtherIncomeNode.getOtherIncomeAddBackTypeNode().setDisabled(false);
        } else {
            personOtherIncomeNode.getOtherIncomePreviousYearNode().setDisabled(true);
            personOtherIncomeNode.getOtherIncomePreviousYearNode().resetValue();
            personOtherIncomeNode.getOtherIncomeAddBackTypeNode().setDisabled(true);
            personOtherIncomeNode.getOtherIncomeAddBackTypeNode().resetValue();
        }
    }
}
