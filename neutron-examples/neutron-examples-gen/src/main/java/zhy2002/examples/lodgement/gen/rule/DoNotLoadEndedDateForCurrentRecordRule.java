package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class DoNotLoadEndedDateForCurrentRecordRule extends UiNodeRule<EmployedNode> {

    public DoNotLoadEndedDateForCurrentRecordRule(EmployedNode owner) {
        super(owner);
    }

    protected EmployedNode getEmployedNode() {
        return getOwner();
    }
}
