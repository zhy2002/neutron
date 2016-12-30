package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.register.gen.*;


public abstract class UpdatePlanRule extends UiNodeRule<AgeNode> {

    public UpdatePlanRule(AgeNode owner) {
        super(owner);
    }

    protected AgeNode getAgeNode() {
        return getOwner();
    }
}
