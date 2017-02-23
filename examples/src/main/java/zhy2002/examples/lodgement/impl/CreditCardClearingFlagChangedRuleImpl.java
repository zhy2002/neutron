package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.CreditCardBreakCostNode;
import zhy2002.examples.lodgement.gen.CreditCardClearingFlagNode;
import zhy2002.examples.lodgement.gen.rule.CreditCardClearingFlagChangedRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CreditCardClearingFlagChangedRuleImpl extends CreditCardClearingFlagChangedRule {

    @Inject
    public CreditCardClearingFlagChangedRuleImpl(@Owner CreditCardClearingFlagNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new BooleanStateChangeEventBinding(this::updateUi),
                new RefreshEventBinding(this::updateUi, Collections.singletonList(NeutronEventSubjects.NODE_LOADED_REFRESH_REASON))
        );
    }

    private CreditCardBreakCostNode getCreditCardBreakCostNode() {
        return getOwner().getParent().getCreditCardBreakCostNode();
    }

    private void updateUi(UiNodeEvent event) {
        CreditCardBreakCostNode creditCardBreakCostNode = getCreditCardBreakCostNode();
        if (Boolean.TRUE.equals(getCreditCardClearingFlagNode().getValue())) {
            creditCardBreakCostNode.setDisabled(false);
        } else {
            creditCardBreakCostNode.setText("");
            creditCardBreakCostNode.setDisabled(true);
        }
    }

}
