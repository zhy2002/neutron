package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.node.BaseResponsibleLendNode;
import zhy2002.examples.lodgement.gen.node.ResponsibleSignificantChangeFlagNode;
import zhy2002.examples.lodgement.gen.rule.ResponsibleSignificantChangeRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

public class ResponsibleSignificantChangeRuleImpl extends ResponsibleSignificantChangeRule {

    @Inject
    public ResponsibleSignificantChangeRuleImpl(@Owner ResponsibleSignificantChangeFlagNode owner) {
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
