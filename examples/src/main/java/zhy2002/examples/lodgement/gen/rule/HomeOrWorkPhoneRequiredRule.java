package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class HomeOrWorkPhoneRequiredRule extends UiNodeRule<ContactNode> {

    public HomeOrWorkPhoneRequiredRule(ContactNode owner) {
        super(owner);
    }

    protected ContactNode getContactNode() {
        return getOwner();
    }
}
