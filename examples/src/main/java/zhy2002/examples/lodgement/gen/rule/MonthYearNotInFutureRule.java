package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class MonthYearNotInFutureRule extends ValidationRule<MonthYearNode<?>> {

    public MonthYearNotInFutureRule(MonthYearNode<?> owner) {
        super(owner);
    }

    protected MonthYearNode<?> getMonthYearNode() {
        return getOwner();
    }
}
