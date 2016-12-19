package zhy2002.examples.register.rule;

import zhy2002.examples.register.PhoneInfoNode;
import zhy2002.neutron.*;
import zhy2002.neutron.util.ValueUtil;

import java.util.Arrays;
import java.util.Collection;

public class PhoneInfoAllOrNothingRule extends UiNodeRule<PhoneInfoNode> {

    public PhoneInfoAllOrNothingRule(PhoneInfoNode owner) {
        super(owner);
    }

    private PhoneInfoNode getPhoneInfoNode() {
        return getOwner();
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
