package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.PersonListNode;
import zhy2002.examples.lodgement.gen.PersonNode;
import zhy2002.examples.lodgement.gen.PrimaryApplicantFlagNode;
import zhy2002.examples.lodgement.gen.rule.AtLeastOnePrimaryApplicantRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.util.CollectionUtil;

import java.util.Collection;

public class AtLeastOnePrimaryApplicantRuleImpl extends AtLeastOnePrimaryApplicantRule {

    public AtLeastOnePrimaryApplicantRuleImpl(PrimaryApplicantFlagNode owner) {
        super(owner);
    }

    //todo generated property names should be put in a constant.

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new BooleanStateChangeEventBinding(
                        event -> getOwner().getParent().getIndex() == 0,
                        event -> validate()
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        return "At least one primary applicant is required.";
    }

    @Override
    protected boolean isActivated() {
        boolean hasPrimary = false;
        PersonListNode personListNode = getPrimaryApplicantFlagNode().getParent().getParent().getParent();
        for (int i = 0; i < personListNode.getItemCount(); i++) {
            PersonNode personNode = personListNode.getItem(i);
            if (Boolean.TRUE.equals(personNode.getGeneralNode().getPrimaryApplicantFlagNode().getValue())) {
                hasPrimary = true;
                break;
            }
        }
        return !hasPrimary;
    }
}
