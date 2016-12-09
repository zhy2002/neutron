package zhy2002.examples.register.rule;

import zhy2002.examples.register.OwnInvestmentPropertyNode;
import zhy2002.examples.register.PropertyDetailsNode;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.event.BooleanStateChangeEvent;
import zhy2002.neutron.util.EnhancedLinkedList;

public class LoadInvestmentPropertyRule extends UiNodeRule<BooleanStateChangeEvent, OwnInvestmentPropertyNode> {

    public LoadInvestmentPropertyRule(OwnInvestmentPropertyNode owner) {
        super(owner, PredefinedPhases.Post);
    }

    private OwnInvestmentPropertyNode getOwnInvestmentPropertyNode() {
        return getOwner();
    }

    private PropertyDetailsNode getInvestmentPropertyDetailsNode() {
        return getOwner().getParent().getInvestmentPropertyNode();
    }

    @Override
    public EnhancedLinkedList<Class<? extends BooleanStateChangeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(BooleanStateChangeEvent.class);
    }

    @Override
    protected void doFire(BooleanStateChangeEvent typedEvent) {
        PropertyDetailsNode propertyDetailsNode = getInvestmentPropertyDetailsNode();
        if (Boolean.TRUE.equals(getOwnInvestmentPropertyNode().getValue())) {
            getContext().loadNode(PropertyDetailsNode.class, propertyDetailsNode);
        } else {
            getContext().unLoadNode(PropertyDetailsNode.class, propertyDetailsNode);
        }
    }
}
