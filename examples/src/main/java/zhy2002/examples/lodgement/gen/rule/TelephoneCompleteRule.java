package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class TelephoneCompleteRule extends ValidationRule<TelephoneNode<?>> {

    public TelephoneCompleteRule(TelephoneNode<?> owner) {
        super(owner);
    }

    protected TelephoneNode<?> getTelephoneNode() {
        return getOwner();
    }
}
