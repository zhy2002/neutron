package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class CreditCardClearingFlagChangedRule extends UiNodeRule<CreditCardClearingFlagNode> {

    public CreditCardClearingFlagChangedRule(CreditCardClearingFlagNode owner) {
        super(owner);
    }

    protected CreditCardClearingFlagNode getCreditCardClearingFlagNode() {
        return getOwner();
    }
}
