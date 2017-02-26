package zhy2002.examples.lodgement.config;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.UiNodeConfig;

public class EmploymentEndedNodeConfig extends UiNodeConfig<EmploymentEndedNode> {

    public EmploymentEndedNodeConfig(EmploymentEndedNode owner) {
        super(owner);
    }

    @Override
    public void postAddToParent() {
        if (getOwner().getParent().getParent() instanceof CurrentEmploymentNode) {
            getOwner().setLoadWithParent(false);
        }
    }
}
