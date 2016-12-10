package zhy2002.examples.register.rule;

import zhy2002.examples.register.AgeNode;
import zhy2002.examples.register.ErrorListNode;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.event.BigDecimalStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.util.EnhancedLinkedList;

import java.math.BigDecimal;

public class AgeValidRule extends ValidationRule<AgeNode> {

    public AgeValidRule(AgeNode owner) {
        super(owner);
    }

    private static final BigDecimal MIN_AGE = new BigDecimal("0");
    private static final BigDecimal MAX_AGE = new BigDecimal("120");

    private AgeNode getAgeNode() {
        return getOwner();
    }

    @Override
    protected ErrorListNode getErrorListNode() {
        return getOwner().getParent().getErrorListNode();
    }

    @Override
    public EnhancedLinkedList<Class<? extends UiNodeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(BigDecimalStateChangeEvent.class).and(StringStateChangeEvent.class);
    }

    @Override
    protected boolean isValid(UiNodeEvent typedEvent) {
        AgeNode ageNode = getAgeNode();
        return !ageNode.hasValue() || ageNode.getValue() != null && ageNode.getValue().compareTo(MIN_AGE) >= 0 && ageNode.getValue().compareTo(MAX_AGE) <= 0;
    }

    @Override
    public String getErrorMessage(UiNodeEvent typedEvent) {
        return "Age is not valid.";
    }


}
