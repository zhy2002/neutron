package zhy2002.mortgage.application.shared;

import zhy2002.mortgage.application.gen.node.BaseResponsibleLendNode;
import zhy2002.mortgage.application.gen.node.ResponsibleSignificantChangeFlagNode;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class ResponsibleSignificantChangeRule extends UiNodeRule<ResponsibleSignificantChangeFlagNode> {

    @Inject
    public ResponsibleSignificantChangeRule(@Owner ResponsibleSignificantChangeFlagNode owner) {
        super(owner);
    }

    protected ResponsibleSignificantChangeFlagNode getResponsibleSignificantChangeFlagNode() {
        return getOwner();
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

    private BaseResponsibleLendNode<?> getPersonResponsibleLendNode() {
        return getOwner().getParent();
    }

    private void updateUi() {
        BaseResponsibleLendNode<?> responsibleLendNode = getPersonResponsibleLendNode();
        if ("Yes".equals(getResponsibleSignificantChangeFlagNode().getValue())) {
            responsibleLendNode.getResponsibleTypeOfChangeNode().setDisabled(false);
            responsibleLendNode.getResponsibleMitigationMethodNode().setDisabled(false);
        } else {
            responsibleLendNode.getResponsibleTypeOfChangeNode().setDisabled(true);
            responsibleLendNode.getResponsibleTypeOfChangeNode().resetValue();
            responsibleLendNode.getResponsibleMitigationMethodNode().setDisabled(true);
            responsibleLendNode.getResponsibleMitigationMethodNode().resetValue();
        }
    }
}
