package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class ResponsibleSignificantChangeRule extends UiNodeRule<ResponsibleSignificantChangeFlagNode> {

    public ResponsibleSignificantChangeRule(ResponsibleSignificantChangeFlagNode owner) {
        super(owner);
    }

    protected ResponsibleSignificantChangeFlagNode getResponsibleSignificantChangeFlagNode() {
        return getOwner();
    }
}
