package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class ChangeFocusErrorRule extends UiNodeRule<ErrorListNode> {

    public ChangeFocusErrorRule(ErrorListNode owner) {
        super(owner);
    }

    protected ErrorListNode getErrorListNode() {
        return getOwner();
    }
}
