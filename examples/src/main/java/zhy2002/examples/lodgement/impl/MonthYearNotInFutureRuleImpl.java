package zhy2002.examples.lodgement.impl;


import com.google.gwt.i18n.shared.DateTimeFormat;
import zhy2002.examples.lodgement.gen.MonthYearNode;
import zhy2002.examples.lodgement.gen.rule.MonthYearNotInFutureRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.event.BigDecimalStateChangeEventBinding;
import zhy2002.neutron.util.CollectionUtil;
import zhy2002.neutron.util.SharedDateTimeFormat;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

public class MonthYearNotInFutureRuleImpl extends MonthYearNotInFutureRule {

    private DateTimeFormat dateTimeFormat = new SharedDateTimeFormat("yyyy-MM");

    public MonthYearNotInFutureRuleImpl(MonthYearNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new BigDecimalStateChangeEventBinding(
                        (e) -> validate()
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        if (!getMonthYearNode().getYearNode().hasValue() || !getMonthYearNode().getMonthNode().hasValue())
            return null;

        Date now = new Date();
        String yearMonth = dateTimeFormat.format(now);
        int index = yearMonth.indexOf("-");
        BigDecimal nowYear = new BigDecimal(yearMonth.substring(0, index));
        BigDecimal nowMonth = new BigDecimal(yearMonth.substring(index + 1));

        BigDecimal year = getMonthYearNode().getYearNode().getValue();
        BigDecimal month = getMonthYearNode().getMonthNode().getValue();

        if (year.compareTo(nowYear) < 0)
            return null;
        if (year.compareTo(nowYear) == 0 && month.compareTo(nowMonth) > 0)
            return "Cannot be in the future";
        return null;

    }
}
