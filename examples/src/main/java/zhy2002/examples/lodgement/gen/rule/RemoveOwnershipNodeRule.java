package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class RemoveOwnershipNodeRule extends UiNodeRule<ApplicantReferenceNode> {

    public RemoveOwnershipNodeRule(ApplicantReferenceNode owner) {
        super(owner);
    }

    protected ApplicantReferenceNode getApplicantReferenceNode() {
        return getOwner();
    }
}
