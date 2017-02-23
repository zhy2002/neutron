package zhy2002.examples.lodgement.impl;

import com.google.gwt.i18n.shared.DateTimeFormat;
import zhy2002.examples.lodgement.gen.DobNode;
import zhy2002.examples.lodgement.gen.rule.DobRangeValidationRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.util.CollectionUtil;
import zhy2002.neutron.util.SharedDateTimeFormat;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Date;


public class DobRangeValidationRuleImpl extends DobRangeValidationRule {

    private DateTimeFormat dateFormat = new SharedDateTimeFormat("yyyy-MM-dd");

    @Inject
    public DobRangeValidationRuleImpl(@Owner DobNode<?> owner) {
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
        DobNode<?> dobNode = getOwner();
        if (!dobNode.hasValue())
            return null;

        String dob = ValueUtil.beforeFirst(dobNode.getValue(), "T");
        Integer minAge = dobNode.getMinAge();
        if (smallerThanMinAge(dob, minAge)) {
            return "Minimum age is " + minAge;
        }

        Integer maxAge = dobNode.getMaxAge();
        if (greaterThanMaxAge(dob, maxAge)) {
            return "Max age is " + maxAge;
        }

        return null;
    }

    private boolean smallerThanMinAge(String dob, Integer minAge) {
        if (minAge == null)
            return false;

        Date dateMinAge = addYear(dob, minAge);
        Date now = new Date(); //todo extract to a service, and remove time component
        return dateMinAge.compareTo(now) > 0;
    }

    private boolean greaterThanMaxAge(String dob, Integer maxAge) {
        if (maxAge == null)
            return false;

        Date dateMaxAge = addYear(dob, maxAge);
        Date now = new Date(); //todo fix, see above
        return dateMaxAge.compareTo(now) < 0;
    }

    private Date addYear(String dob, int years) {
        int index = dob.indexOf('-');
        int year = Integer.parseInt(dob.substring(0, index));
        year += years;
        return dateFormat.parse(year + dob.substring(index));
    }
}
