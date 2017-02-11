package zhy2002.examples.register.config;

import zhy2002.examples.register.gen.PropertyDetailsNode;
import zhy2002.neutron.UiNodeConfig;

public class PropertyDetailsInvestmentPropertyNodeConfig extends UiNodeConfig<PropertyDetailsNode> {

    public PropertyDetailsInvestmentPropertyNodeConfig(PropertyDetailsNode owner) {
        super(owner);
    }

    @Override
    public void postAddToParent() {
        getOwner().setLoadWithParent(false);
    }
}
