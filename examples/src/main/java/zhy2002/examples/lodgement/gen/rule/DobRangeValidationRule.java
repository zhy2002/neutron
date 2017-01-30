package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class DobRangeValidationRule extends ValidationRule<DobNode<?>> {

    public DobRangeValidationRule(DobNode<?> owner) {
        super(owner);
    }

    protected DobNode<?> getDobNode() {
        return getOwner();
    }
}
