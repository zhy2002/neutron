package zhy2002.examples.register.gen.rule;
/* template name: rule.ftl */
import zhy2002.neutron.*;
import zhy2002.examples.register.gen.node.*;


public abstract class UpdatePlanRule extends UiNodeRule<AgeNode> {

    public UpdatePlanRule(AgeNode owner) {
        super(owner);
    }

    protected AgeNode getAgeNode() {
        return getOwner();
    }
}
