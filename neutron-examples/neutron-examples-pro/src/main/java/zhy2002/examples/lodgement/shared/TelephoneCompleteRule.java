package zhy2002.examples.lodgement.shared;

import zhy2002.examples.lodgement.data.Telephone;
import zhy2002.examples.lodgement.gen.event.TelephoneStateChangeEvent;
import zhy2002.examples.lodgement.gen.node.TelephoneNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.GenericStateChangeEventBinding;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.util.CollectionUtil;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;
import java.util.Collection;

public class TelephoneCompleteRule extends ValidationRule<TelephoneNode<?>> {

    @Inject
    public TelephoneCompleteRule(@Owner TelephoneNode<?> owner) {
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
                ),
                new BooleanStateChangeEventBinding(
                        e -> validate(),
                        TelephoneNode.SUPPRESS_TELEPHONE_COMPLETE_RULE_PROPERTY.getStateKey()
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        if (isActivated())
            return "Telephone information is not complete.";
        return null;
    }

    private boolean isActivated() {
        Telephone value = getTelephoneNode().getValue();
        if (!getTelephoneNode().isValueUpdated())
            return false;

        if (getTelephoneNode().getSuppressTelephoneCompleteRule()) {
            return false;
        }

        if (Boolean.TRUE.equals(getTelephoneNode().getCountryCodeReadonly())) {
            return !(
                    ValueUtil.isEmpty(value.getAreaCode())
                            && ValueUtil.isEmpty(value.getPhoneNumber())
                            || !ValueUtil.isEmpty(value.getAreaCode())
                            && !ValueUtil.isEmpty(value.getPhoneNumber())
            );
        }

        return !(
                ValueUtil.isEmpty(value.getCountryCode())
                        && ValueUtil.isEmpty(value.getAreaCode())
                        && ValueUtil.isEmpty(value.getPhoneNumber())
                        || !ValueUtil.isEmpty(value.getCountryCode())
                        && !ValueUtil.isEmpty(value.getAreaCode())
                        && !ValueUtil.isEmpty(value.getPhoneNumber())
        );
    }
}
