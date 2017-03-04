package zhy2002.examples.lodgement.config;

import zhy2002.examples.lodgement.gen.node.PersonAddressNode;
import zhy2002.neutron.UiNodeConfig;

public class CurrentAddressConfig extends UiNodeConfig<PersonAddressNode> {

    public CurrentAddressConfig(PersonAddressNode owner) {
        super(owner);
    }

    @Override
    public void postAddToParent() {
        getOwner().setRequired(Boolean.TRUE);
    }
}
