package zhy2002.examples.register.rule;

import zhy2002.examples.register.PhoneInfoNode;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.RefreshUiNodeEvent;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.util.EnhancedLinkedList;
import zhy2002.neutron.util.ValueUtil;

public class PhoneInfoAllOrNothingRule extends UiNodeRule<UiNodeEvent, PhoneInfoNode> {
    public PhoneInfoAllOrNothingRule(PhoneInfoNode owner) {
        super(owner, PredefinedPhases.Post);
    }

    private PhoneInfoNode getPhoneInfoNode() {
        return getOwner();
    }

    @Override
    public EnhancedLinkedList<Class<? extends UiNodeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(RefreshUiNodeEvent.class).and(StringStateChangeEvent.class);
    }

    @Override
    public boolean canFire(UiNodeEvent event) {
        return event.getTarget().getParent() == getOwner() || event instanceof RefreshUiNodeEvent;
    }

    @Override
    protected void doFire(UiNodeEvent typedEvent) {
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
