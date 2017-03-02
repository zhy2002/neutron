package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.register.gen.node.*;


public abstract class EmailIsRequiredWhenReceiveOffersRule extends UiNodeRule<ReceiveOffersNode> {

    public EmailIsRequiredWhenReceiveOffersRule(ReceiveOffersNode owner) {
        super(owner);
    }

    protected ReceiveOffersNode getReceiveOffersNode() {
        return getOwner();
    }
}
