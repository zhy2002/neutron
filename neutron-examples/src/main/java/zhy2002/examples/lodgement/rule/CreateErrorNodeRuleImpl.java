package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.node.*;
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
