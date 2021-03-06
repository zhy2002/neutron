package zhy2002.neutron.examples.register.rule;

import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.RefreshEventBinding;
import zhy2002.neutron.core.UiNodeEvent;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;
import zhy2002.neutron.examples.register.gen.node.PhoneInfoNode;
import zhy2002.neutron.examples.register.gen.rule.PhoneInfoAllOrNothingRule;
import zhy2002.neutron.core.util.ValueUtil;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;

public class PhoneInfoAllOrNothingRuleImpl extends PhoneInfoAllOrNothingRule {

    @Inject
    public PhoneInfoAllOrNothingRuleImpl(@Owner PhoneInfoNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new RefreshEventBinding(this::canFire, e -> updateRequired()),
                new StringStateChangeEventBinding(this::canFire, e -> updateRequired())
        );
    }

    private boolean canFire(UiNodeEvent event) {
        return event.getOrigin().getParent() == getOwner();
    }

    private void updateRequired() {
        if (ValueUtil.isEmpty(getPhoneInfoNode().getCountryCodeNode().getValue()) &&
                ValueUtil.isEmpty(getPhoneInfoNode().getAreaCodeNode().getValue()) &&
                ValueUtil.isEmpty(getPhoneInfoNode().getPhoneNumberNode().getValue())) {
            getPhoneInfoNode().getCountryCodeNode().setRequired(false);
            getPhoneInfoNode().getAreaCodeNode().setRequired(false);
            getPhoneInfoNode().getPhoneNumberNode().setRequired(false);
        } else {
            getPhoneInfoNode().getCountryCodeNode().setRequired(true);
            getPhoneInfoNode().getAreaCodeNode().setRequired(true);
            getPhoneInfoNode().getPhoneNumberNode().setRequired(true);
        }
    }
}
