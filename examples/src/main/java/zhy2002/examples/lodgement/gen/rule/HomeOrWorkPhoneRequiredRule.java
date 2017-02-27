package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class HomeOrWorkPhoneRequiredRule extends UiNodeRule<BaseContactNode<?>> {

    public HomeOrWorkPhoneRequiredRule(BaseContactNode<?> owner) {
        super(owner);
    }

    protected BaseContactNode<?> getBaseContactNode() {
        return getOwner();
    }
}
