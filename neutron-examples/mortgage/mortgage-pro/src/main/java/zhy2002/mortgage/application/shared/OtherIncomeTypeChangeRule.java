package zhy2002.mortgage.application.shared;

import zhy2002.mortgage.application.gen.node.OtherIncomeNode;
import zhy2002.mortgage.application.gen.node.OtherIncomeTypeNode;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class OtherIncomeTypeChangeRule extends UiNodeRule<OtherIncomeTypeNode> {

    @Inject
    public OtherIncomeTypeChangeRule(@Owner OtherIncomeTypeNode owner) {
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
        String value = getOwner().getValue();
        OtherIncomeNode otherIncomeNode = getOtherIncomeNode();
        if ("Other Income".equals(value)) {
            otherIncomeNode.getOtherIncomeDescriptionNode().setRequired(true);
            otherIncomeNode.getOtherIncomeDescriptionNode().setDisabled(false);
        } else {
            otherIncomeNode.getOtherIncomeDescriptionNode().setDisabled(true);
            otherIncomeNode.getOtherIncomeDescriptionNode().setRequired(false);
            otherIncomeNode.getOtherIncomeDescriptionNode().resetValue();
        }

        if ("Add Back".equals(value)) {
            otherIncomeNode.getOtherIncomePreviousYearNode().setDisabled(false);
            otherIncomeNode.getOtherIncomeAddBackTypeNode().setDisabled(false);
        } else {
            otherIncomeNode.getOtherIncomePreviousYearNode().setDisabled(true);
            otherIncomeNode.getOtherIncomePreviousYearNode().resetValue();
            otherIncomeNode.getOtherIncomeAddBackTypeNode().setDisabled(true);
            otherIncomeNode.getOtherIncomeAddBackTypeNode().resetValue();
        }
    }
}
