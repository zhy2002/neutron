package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class ChangeApplicationTypeRule extends UiNodeRule<ApplicationTypeNode> {

    public ChangeApplicationTypeRule(ApplicationTypeNode owner) {
        super(owner);
    }

    protected ApplicationTypeNode getApplicationTypeNode() {
        return getOwner();
    }
}
