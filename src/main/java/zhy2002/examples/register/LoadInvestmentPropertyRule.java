package zhy2002.examples.register;

import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.event.BooleanStateChangeEvent;
import zhy2002.neutron.util.EnhancedLinkedList;

public class LoadInvestmentPropertyRule extends UiNodeRule<BooleanStateChangeEvent, OwnInvestmentPropertyNode> {

    protected LoadInvestmentPropertyRule(OwnInvestmentPropertyNode owner) {
        super(owner, PredefinedPhases.Post);
    }

    private OwnInvestmentPropertyNode getOwnInvestmentPropertyNode() {
        return getOwner();
    }

    private PropertyDetailsNode getInvestmentPropertyNode() {
        return getOwner().getParent().getInvestmentPropertyNode();
    }

    @Override
    public EnhancedLinkedList<Class<? extends BooleanStateChangeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(BooleanStateChangeEvent.class);
    }

    @Override
    protected void doFire(BooleanStateChangeEvent typedEvent) {
        if (Boolean.TRUE.equals(getOwnInvestmentPropertyNode().getValue())) {
            getInvestmentPropertyNode().load();
        } else {
            getInvestmentPropertyNode().unload();
        }
    }
}
