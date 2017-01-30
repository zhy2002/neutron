package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.data.Telephone;
import zhy2002.examples.lodgement.gen.TelephoneNode;
import zhy2002.examples.lodgement.gen.event.TelephoneStateChangeEvent;
import zhy2002.examples.lodgement.gen.rule.TelephoneCompleteRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.event.GenericStateChangeEventBinding;
import zhy2002.neutron.util.CollectionUtil;
import zhy2002.neutron.util.ValueUtil;

import java.util.Collection;

public class TelephoneCompleteRuleImpl extends TelephoneCompleteRule {

    public TelephoneCompleteRuleImpl(TelephoneNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new GenericStateChangeEventBinding<>(
                        e -> validate(),
                        TelephoneStateChangeEvent.class
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
        if (value == null)
            return false;

        return !(
                ValueUtil.isEmpty(value.getAreaCode())
                        && ValueUtil.isEmpty(value.getCountryCode())
                        && ValueUtil.isEmpty(value.getPhoneNumber())
                        || !ValueUtil.isEmpty(value.getAreaCode())
                        && !ValueUtil.isEmpty(value.getCountryCode())
                        && !ValueUtil.isEmpty(value.getPhoneNumber())
        );
    }
}
