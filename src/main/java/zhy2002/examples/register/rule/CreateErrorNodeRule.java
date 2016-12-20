package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.RegisterNode;
import zhy2002.neutron.*;
import zhy2002.neutron.data.ValidationError;
import zhy2002.neutron.data.ValidationErrorList;
import zhy2002.neutron.event.ValidationErrorListStateChangeEvent;
import zhy2002.neutron.event.ValidationErrorListStateChangeEventBinding;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * If the error list of a child is change check if we should create a new error node.
 */
public class CreateErrorNodeRule extends UiNodeRule<RegisterNode> {

    public CreateErrorNodeRule(RegisterNode owner) {
        super(owner);
    }

    private ErrorListNode getErrorListNode() {
        return getOwner().getErrorListNode();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new ValidationErrorListStateChangeEventBinding(
                        this::updateErrorNodeList
                )
        );
    }

    private void updateErrorNodeList(ValidationErrorListStateChangeEvent typedEvent) {
        ErrorListNode errorListNode = getErrorListNode();
        ValidationErrorList newValidationErrorList = typedEvent.getOrigin().getValidationErrorList();
        Set<ValidationError> newValidationErrorSet = new HashSet<>();
        if (newValidationErrorList != null) {
            newValidationErrorSet.addAll(newValidationErrorList);
        }

        HashSet<ValidationError> existingValidationErrorSet = new HashSet<>();
        HashSet<ErrorNode> notInNewValidationErrorSet = new HashSet<>();
        for (int i = 0; i < errorListNode.getItemCount(); i++) {
            ValidationError error = errorListNode.getItem(i).getValue();
            if (error.getOrigin() == typedEvent.getOrigin() ) {
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
