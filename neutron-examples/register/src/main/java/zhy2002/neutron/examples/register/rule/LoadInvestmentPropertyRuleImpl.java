package zhy2002.neutron.examples.register.rule;

import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.RefreshEventBinding;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.examples.register.gen.node.OwnInvestmentPropertyNode;
import zhy2002.neutron.examples.register.gen.node.PropertyDetailsNode;
import zhy2002.neutron.examples.register.gen.rule.LoadInvestmentPropertyRule;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;

public class LoadInvestmentPropertyRuleImpl extends LoadInvestmentPropertyRule {

    @Inject
    public LoadInvestmentPropertyRuleImpl(@Owner OwnInvestmentPropertyNode owner) {
        super(owner);
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
            propertyDetailsNode.load();
        } else {
            propertyDetailsNode.unLoad();
        }
    }
}
