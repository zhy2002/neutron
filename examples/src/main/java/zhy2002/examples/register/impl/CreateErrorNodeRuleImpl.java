package zhy2002.examples.register.impl;

import zhy2002.examples.register.gen.ErrorListNode;
import zhy2002.examples.register.gen.ErrorNode;
import zhy2002.examples.register.gen.RegisterNode;
import zhy2002.examples.register.gen.rule.CreateErrorNodeRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.data.ValidationError;
import zhy2002.neutron.data.ValidationErrorList;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.ValidationErrorListStateChangeEvent;
import zhy2002.neutron.event.ValidationErrorListStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

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
