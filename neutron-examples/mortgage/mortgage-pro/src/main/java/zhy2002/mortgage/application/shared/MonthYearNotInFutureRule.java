package zhy2002.mortgage.application.shared;

import com.google.gwt.i18n.shared.DateTimeFormat;
import zhy2002.mortgage.application.gen.node.MonthYearNode;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.ValidationRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.BigDecimalStateChangeEventBinding;
import zhy2002.neutron.core.util.CollectionUtil;
import zhy2002.neutron.core.util.SharedDateTimeFormat;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Date;

public class MonthYearNotInFutureRule extends ValidationRule<MonthYearNode<?>> {

    private DateTimeFormat dateTimeFormat = new SharedDateTimeFormat("yyyy-MM");

    @Inject
    public MonthYearNotInFutureRule(@Owner MonthYearNode<?> owner) {
        super(owner);
    }

    protected MonthYearNode<?> getMonthYearNode() {
        return getOwner();
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
        Double nowYear = new Double(yearMonth.substring(0, index));
        Double nowMonth = new Double(yearMonth.substring(index + 1));

        Double year = getMonthYearNode().getYearNode().getValue();
        Double month = getMonthYearNode().getMonthNode().getValue();

        if (year.compareTo(nowYear) < 0)
            return null;
        if (year.compareTo(nowYear) == 0 && month.compareTo(nowMonth) > 0)
            return "Cannot be in the future";
        return null;

    }
}
