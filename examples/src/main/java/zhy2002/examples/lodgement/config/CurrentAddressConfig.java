package zhy2002.examples.lodgement.config;

import zhy2002.examples.lodgement.gen.ContactAddressNode;
import zhy2002.neutron.UiNodeConfig;

public class CurrentAddressConfig extends UiNodeConfig<ContactAddressNode> {

    @Override
    public String getName() {
        return "currentAddressNode";
    }

    @Override
    public void onAddedToParent(ContactAddressNode node) {
        super.onAddedToParent(node);

        node.setRequired(Boolean.TRUE);
    }
}
