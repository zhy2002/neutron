package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.PhoneInfoFieldNode;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.event.BooleanStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.util.EnhancedLinkedList;
import zhy2002.neutron.util.ValueUtil;


public class PhoneFieldIsRequiredRule extends ValidationRule<PhoneInfoFieldNode> {
    public PhoneFieldIsRequiredRule(PhoneInfoFieldNode owner) {
        super(owner);
    }

    private PhoneInfoFieldNode getPhoneInfoFieldNode() {
        return getOwner();
    }

    @Override
    protected ErrorListNode getErrorListNode() {
        return getPhoneInfoFieldNode().getParent().getParent().getErrorListNode();
    }

    @Override
    public EnhancedLinkedList<Class<? extends UiNodeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(BooleanStateChangeEvent.class).and(StringStateChangeEvent.class);
    }

    @Override
    protected boolean isValid(UiNodeEvent typedEvent) {
        return !getPhoneInfoFieldNode().getRequired() || !ValueUtil.isEmpty(getPhoneInfoFieldNode().getValue());
    }

    @Override
    public String getErrorMessage(UiNodeEvent typedEvent) {
        return getPhoneInfoFieldNode().getName() + " is required.";
    }
}
