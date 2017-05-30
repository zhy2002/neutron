package zhy2002.examples.lodgement.gen.rule;
/* template name: rule.ftl */
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class ChangeFocusErrorRule extends UiNodeRule<ErrorListNode> {

    public ChangeFocusErrorRule(ErrorListNode owner) {
        super(owner);
    }

    protected ErrorListNode getErrorListNode() {
        return getOwner();
    }
}
