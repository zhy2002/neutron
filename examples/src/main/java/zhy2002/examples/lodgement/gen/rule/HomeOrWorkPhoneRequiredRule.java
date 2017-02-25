package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class HomeOrWorkPhoneRequiredRule extends UiNodeRule<PersonContactNode> {

    public HomeOrWorkPhoneRequiredRule(PersonContactNode owner) {
        super(owner);
    }

    protected PersonContactNode getPersonContactNode() {
        return getOwner();
    }
}
