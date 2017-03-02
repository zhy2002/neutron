package zhy2002.examples.register.rule;

import zhy2002.examples.register.gen.node.ErrorListNode;
import zhy2002.examples.register.gen.node.RegisterNode;
import zhy2002.examples.register.gen.rule.CreateErrorNodeRule;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;

/**
 * If the error list of a child is change check if we should create a new error node.
 */
public class CreateErrorNodeRuleImpl extends CreateErrorNodeRule {

    @Inject
    public CreateErrorNodeRuleImpl(@Owner RegisterNode owner) {
        super(owner);
    }

    protected ErrorListNode getErrorListNode() {
        return getOwner().getErrorListNode();
    }

}
