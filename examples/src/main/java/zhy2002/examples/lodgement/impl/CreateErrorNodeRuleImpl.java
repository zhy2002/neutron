package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.ApplicationNode;
import zhy2002.examples.lodgement.gen.ErrorListNode;
import zhy2002.examples.lodgement.gen.rule.CreateErrorNodeRule;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;


public class CreateErrorNodeRuleImpl extends CreateErrorNodeRule {

    @Inject
    public CreateErrorNodeRuleImpl(@Owner ApplicationNode owner) {
        super(owner);
    }

    protected ErrorListNode getErrorListNode() {
        return getOwner().getErrorListNode();
    }

}
