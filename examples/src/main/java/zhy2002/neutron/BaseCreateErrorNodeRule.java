package zhy2002.neutron;


import zhy2002.neutron.data.ValidationError;
import zhy2002.neutron.data.ValidationErrorList;
import zhy2002.neutron.event.ValidationErrorListStateChangeEvent;
import zhy2002.neutron.event.ValidationErrorListStateChangeEventBinding;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public abstract class BaseCreateErrorNodeRule<N extends UiNode<?>> extends UiNodeRule<N> {

    protected BaseCreateErrorNodeRule(N owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new ValidationErrorListStateChangeEventBinding(
                        this::updateErrorNodeList
                )
        );
    }

    protected abstract ListUiNode<?, ?, ? extends LeafUiNode<?, ValidationError>> getErrorListNode();

    private void updateErrorNodeList(ValidationErrorListStateChangeEvent typedEvent) {
        ListUiNode<?, ?, ? extends LeafUiNode<?, ValidationError>> errorListNode = getErrorListNode();
        ValidationErrorList newValidationErrorList = typedEvent.getOrigin().getValidationErrorList();
        Set<ValidationError> newValidationErrorSet = new HashSet<>();
        if (newValidationErrorList != null) {
            newValidationErrorSet.addAll(newValidationErrorList);
        }

        HashSet<ValidationError> existingValidationErrorSet = new HashSet<>();
        HashSet<UiNode<?>> notInNewValidationErrorSet = new HashSet<>();
        for (int i = 0; i < errorListNode.getItemCount(); i++) {
            ValidationError error = errorListNode.getItem(i).getValue();
            if (error.getOrigin() == typedEvent.getOrigin()) {
                if (newValidationErrorSet.contains(error)) {
                    existingValidationErrorSet.add(error);
                } else {
                    notInNewValidationErrorSet.add(errorListNode.getItem(i));
                }
            }
        }

        //remove nodes not in list anymore
        for (UiNode<?> errorNode : notInNewValidationErrorSet) {
            errorListNode.removeByName(errorNode.getName());
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
