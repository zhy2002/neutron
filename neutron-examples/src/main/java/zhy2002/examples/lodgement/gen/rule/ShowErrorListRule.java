package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class ShowErrorListRule extends UiNodeRule<ApplicationNode> {

    public ShowErrorListRule(ApplicationNode owner) {
        super(owner);
    }

    protected ApplicationNode getApplicationNode() {
        return getOwner();
    }
}
