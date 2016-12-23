package zhy2002.examples.register.config;

import zhy2002.examples.register.gen.PropertyDetailsNode;
import zhy2002.neutron.UiNodeConfig;

public class PropertyDetailsInvestmentPropertyNodeConfig implements UiNodeConfig<PropertyDetailsNode> {

    @Override
    public String getName() {
        return "investmentPropertyNode";
    }

    @Override
    public void onAddedToParent(PropertyDetailsNode node) {
        node.setLoadWithParent(false);
    }

    @Override
    public void onLoaded(PropertyDetailsNode node) {

    }
}
