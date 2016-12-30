package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.ApplicationNode;
import zhy2002.examples.lodgement.gen.ErrorListNode;
import zhy2002.examples.lodgement.gen.rule.CreateErrorNodeRule;


public class CreateErrorNodeRuleImpl extends CreateErrorNodeRule {

    public CreateErrorNodeRuleImpl(ApplicationNode owner) {
        super(owner);
    }

    protected ErrorListNode getErrorListNode() {
        return getOwner().getErrorListNode();
    }

}
