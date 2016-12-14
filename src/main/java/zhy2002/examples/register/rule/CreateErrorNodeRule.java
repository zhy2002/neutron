package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.RegisterNode;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.event.ValidationErrorListStateChangeEvent;
import zhy2002.neutron.rule.*;
import zhy2002.neutron.util.EnhancedLinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * If the error list of a child is change check if we should create a new error node.
 */
public class CreateErrorNodeRule extends UiNodeRule<ValidationErrorListStateChangeEvent, RegisterNode> {

    public CreateErrorNodeRule(RegisterNode owner) {
        super(owner, PredefinedPhases.Validate);
    }

    private ErrorListNode getErrorListNode() {
        return getOwner().getErrorListNode();
    }

    @Override
    public EnhancedLinkedList<Class<? extends ValidationErrorListStateChangeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(ValidationErrorListStateChangeEvent.class);
    }

    @Override
    public boolean canFire(UiNodeEvent event) {
        return true;
    }

    @Override
    protected void doFire(ValidationErrorListStateChangeEvent typedEvent) {
        ErrorListNode errorListNode = getErrorListNode();
        ValidationErrorList newValidationErrorList = typedEvent.getTarget().getValidationErrors();
        Set<ValidationError> newValidationErrorSet = new HashSet<>();
        if (newValidationErrorList != null) {
            newValidationErrorSet.addAll(newValidationErrorList);
        }

        HashSet<ValidationError> existingValidationErrorSet = new HashSet<>();
        HashSet<ErrorNode> notInNewValidationErrorSet = new HashSet<>();
        for (int i = 0; i < errorListNode.getItemCount(); i++) {
            ValidationError error = errorListNode.getItem(i).getValue();
            if (error.getOrigin() == typedEvent.getTarget() && error.getRule() instanceof zhy2002.neutron.rule.ValidationRule) {
                if (newValidationErrorSet.contains(error)) {
                    existingValidationErrorSet.add(error);
                } else {
                    notInNewValidationErrorSet.add(errorListNode.getItem(i));
                }
            }
        }

        //remove nodes not in list anymore
        for (ErrorNode errorNode : notInNewValidationErrorSet) {
            errorListNode.removeItem(errorNode);
        }
        //add new nodes
        if (newValidationErrorList != null) {
            for (ValidationError error : newValidationErrorList) {
                if (!existingValidationErrorSet.contains(error)) {
                    errorListNode.createItem().setValue(error);
                }
            }
        }
    }
}
