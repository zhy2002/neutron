package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.rule.AtMostOnePrimaryApplicantRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.util.CollectionUtil;

import javax.inject.Inject;
import java.util.Collection;

public class AtMostOnePrimaryApplicantRuleImpl extends AtMostOnePrimaryApplicantRule {
    @Inject
    public AtMostOnePrimaryApplicantRuleImpl(@Owner PrimaryApplicantFlagNode owner) {
        super(owner);
    }

    //todo generate this
    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new BooleanStateChangeEventBinding(
                        event -> event.getOrigin() instanceof PrimaryApplicantFlagNode,
                        event -> validate()
                )
        );
    }

    //todo generate this
    @Override
    protected UiNode<?> findHost() {
        return getPrimaryApplicantFlagNode().getParent().getParent().getParent();
    }

    @Override
    protected String getErrorMessage() {
        if (isActivated())
            return "There can be at most one primary applicant.";
        return null;
    }

    private boolean isActivated() {
        PersonNode personNode = getPrimaryApplicantFlagNode().getParent().getParent();

        int primaryCount = 0;
        PersonListNode personListNode = personNode.getParent();
        for (int i = 0; i < personListNode.getItemCount(); i++) {
            personNode = personListNode.getItem(i);
            if (Boolean.TRUE.equals(personNode.getPersonGeneralNode().getPrimaryApplicantFlagNode().getValue())) {
                primaryCount++;
                if (primaryCount > 1)
                    return true;
            }
        }
        return false;
    }
}
