package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class ShowErrorListRule extends UiNodeRule<ApplicationNode> {

    public ShowErrorListRule(ApplicationNode owner) {
        super(owner);
    }

    protected ApplicationNode getApplicationNode() {
        return getOwner();
    }
}