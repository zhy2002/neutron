package zhy2002.examples.register.rule;

import zhy2002.examples.register.OwnInvestmentPropertyNode;
import zhy2002.examples.register.PropertyDetailsNode;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.UiNodeRule;

import java.util.Arrays;
import java.util.Collection;

public class LoadInvestmentPropertyRule extends UiNodeRule<OwnInvestmentPropertyNode> {

    public LoadInvestmentPropertyRule(OwnInvestmentPropertyNode owner) {
        super(owner);
    }

    private OwnInvestmentPropertyNode getOwnInvestmentPropertyNode() {
        return getOwner();
    }

    private PropertyDetailsNode getInvestmentPropertyDetailsNode() {
        return getOwner().getParent().getInvestmentPropertyNode();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new BooleanStateChangeEventBinding(e -> loadPropertyDetails()),
                new RefreshEventBinding(e -> loadPropertyDetails())
        );
    }

    private void loadPropertyDetails() {
        PropertyDetailsNode propertyDetailsNode = getInvestmentPropertyDetailsNode();
        if (Boolean.TRUE.equals(getOwnInvestmentPropertyNode().getValue())) {
            getContext().loadNode(PropertyDetailsNode.class, propertyDetailsNode);
        } else {
            getContext().unLoadNode(PropertyDetailsNode.class, propertyDetailsNode);
        }
    }
}
