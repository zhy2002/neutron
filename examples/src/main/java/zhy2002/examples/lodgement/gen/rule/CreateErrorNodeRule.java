package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class CreateErrorNodeRule extends BaseCreateErrorNodeRule<ApplicationNode> {

    public CreateErrorNodeRule(ApplicationNode owner) {
        super(owner);
    }

    protected ApplicationNode getApplicationNode() {
        return getOwner();
    }
}
