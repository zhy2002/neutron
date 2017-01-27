package zhy2002.examples.lodgement.config;

import zhy2002.examples.lodgement.gen.CurrentEmploymentNode;
import zhy2002.examples.lodgement.gen.EmploymentEndedNode;
import zhy2002.neutron.UiNodeConfig;

public class EmploymentEndedNodeConfig extends UiNodeConfig<EmploymentEndedNode> {
    @Override
    public String getName() {
        return "employmentEndedNode";
    }

    @Override
    public void onAddedToParent(EmploymentEndedNode node) {
        super.onAddedToParent(node);

        if(node.getParent().getParent() instanceof CurrentEmploymentNode) {
            node.setLoadWithParent(false);
        }
    }
}
