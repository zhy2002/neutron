package zhy2002.examples.lodgement.config;

import zhy2002.examples.lodgement.gen.ContactMonthYearNode;
import zhy2002.neutron.UiNodeConfig;


public class MovedToCurrentAddressConfig extends UiNodeConfig<ContactMonthYearNode> {

    @Override
    public String getName() {
        return "movedToCurrentAddressNode";
    }

    @Override
    public void onAddedToParent(ContactMonthYearNode node) {
        super.onAddedToParent(node);

        node.setRequired(true);
    }
}
