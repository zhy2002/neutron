package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class EmploymentTypeChangedRule extends UiNodeRule<EmploymentTypeNode> {

    public EmploymentTypeChangedRule(EmploymentTypeNode owner) {
        super(owner);
    }

    protected EmploymentTypeNode getEmploymentTypeNode() {
        return getOwner();
    }
}
