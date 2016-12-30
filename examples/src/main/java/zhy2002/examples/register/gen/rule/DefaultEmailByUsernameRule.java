package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.register.gen.*;


public abstract class DefaultEmailByUsernameRule extends UiNodeRule<UsernameNode> {

    public DefaultEmailByUsernameRule(UsernameNode owner) {
        super(owner);
    }

    protected UsernameNode getUsernameNode() {
        return getOwner();
    }
}
