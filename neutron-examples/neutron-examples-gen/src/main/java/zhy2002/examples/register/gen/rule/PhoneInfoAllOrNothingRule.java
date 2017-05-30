package zhy2002.examples.register.gen.rule;
/* template name: rule.ftl */
import zhy2002.neutron.*;
import zhy2002.examples.register.gen.node.*;


public abstract class PhoneInfoAllOrNothingRule extends UiNodeRule<PhoneInfoNode> {

    public PhoneInfoAllOrNothingRule(PhoneInfoNode owner) {
        super(owner);
    }

    protected PhoneInfoNode getPhoneInfoNode() {
        return getOwner();
    }
}
