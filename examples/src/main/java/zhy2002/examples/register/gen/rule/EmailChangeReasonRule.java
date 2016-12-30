package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.register.gen.*;


public abstract class EmailChangeReasonRule extends UiNodeRule<EmailNode> {

    public EmailChangeReasonRule(EmailNode owner) {
        super(owner);
    }

    protected EmailNode getEmailNode() {
        return getOwner();
    }
}
