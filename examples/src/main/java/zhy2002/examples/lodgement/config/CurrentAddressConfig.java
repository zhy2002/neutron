package zhy2002.examples.lodgement.config;

import zhy2002.examples.lodgement.gen.node.ContactAddressNode;
import zhy2002.neutron.UiNodeConfig;

public class CurrentAddressConfig extends UiNodeConfig<ContactAddressNode> {

    public CurrentAddressConfig(ContactAddressNode owner) {
        super(owner);
    }

    @Override
    public void postAddToParent() {
        getOwner().setRequired(Boolean.TRUE);
    }
}
