package zhy2002.mortgage.application.shared;

import com.google.gwt.i18n.shared.DateTimeFormat;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.ValidationRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;
import zhy2002.neutron.core.node.StringUiNode;
import zhy2002.neutron.core.util.CollectionUtil;
import zhy2002.neutron.core.util.SharedDateTimeFormat;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Date;

public class DateNotInPastRule extends ValidationRule<StringUiNode<?>> {

    private static DateTimeFormat dateTimeFormat = new SharedDateTimeFormat("yyyy-MM-dd");

    @Inject
    public DateNotInPastRule(@Owner StringUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new StringStateChangeEventBinding(
                        (e) -> validate()
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        if (!getOwner().hasValue())
            return null;

        Date now = new Date();
        String dateString = getOwner().getValue();
        int index = dateString.indexOf("T");
        if (index <= 0)
            return null;
        dateString = dateString.substring(0, index);
        Date date = dateTimeFormat.parse(dateString);
        if (date.compareTo(now) < 0)
            return "Cannot be in the past";

        return null;
    }
}
