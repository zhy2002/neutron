package zhy2002.examples.register;

import zhy2002.neutron.UiNodeConfig;

public class PropertyDetailsInvestmentPropertyNodeConfig extends UiNodeConfig<PropertyDetailsNode> {
    @Override
    public String getName() {
        return "investmentPropertyNode";
    }

    @Override
    public void initialize(PropertyDetailsNode node) {
        node.setLoadWithParent(false);
    }
}
