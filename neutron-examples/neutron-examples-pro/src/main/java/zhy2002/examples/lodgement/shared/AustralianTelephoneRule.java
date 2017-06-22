package zhy2002.examples.lodgement.shared;

import com.google.common.base.Strings;
import zhy2002.examples.lodgement.data.Telephone;
import zhy2002.examples.lodgement.gen.event.TelephoneStateChangeEvent;
import zhy2002.examples.lodgement.gen.node.TelephoneNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.event.GenericStateChangeEventBinding;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.util.CollectionUtil;

import javax.inject.Inject;
import java.util.Collection;


public class AustralianTelephoneRule extends ValidationRule<TelephoneNode<?>> {

    @Inject
    protected AustralianTelephoneRule(@Owner TelephoneNode<?> owner) {
        super(owner);
    }

    protected TelephoneNode<?> getTelephoneNode() {
        return getOwner();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new GenericStateChangeEventBinding<>(
                        TelephoneStateChangeEvent.class,
                        e -> validate(),
                        TelephoneNode.VALUE_PROPERTY.getStateKey()
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        Telephone telephone = getTelephoneNode().getValue();
        if (telephone == null || !"+61".equals(telephone.getCountryCode()))
            return null;

        if (!Strings.isNullOrEmpty(telephone.getAreaCode())) {
            if (!telephone.getAreaCode().matches("^\\d\\d?$")) {
                return "Area code must be one or two digits.";
            }
        }

        if (!Strings.isNullOrEmpty(telephone.getPhoneNumber())) {
            if (telephone.getPhoneNumber().length() != 8) {
                return "Phone number must be 8 digits.";
            }
        }
        return null;
    }
}
