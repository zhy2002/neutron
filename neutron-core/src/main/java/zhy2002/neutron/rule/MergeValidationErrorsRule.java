package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RootUiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.ValidationErrorListAdaptor;
import zhy2002.neutron.data.ValidationError;
import zhy2002.neutron.data.ValidationErrorList;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.ValidationErrorListStateChangeEvent;
import zhy2002.neutron.event.ValidationErrorListStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Update the global validation error list when the validation errors list of any node changes.
 * The global validation error list is a combination of all the validation errors
 * in the context.
 */
public class MergeValidationErrorsRule extends UiNodeRule<RootUiNode<?>> {

    @Inject
    protected MergeValidationErrorsRule(@Owner RootUiNode<?> owner) {
        super(owner);
    }

    private ValidationErrorListAdaptor errorListAdaptor;

    /**
     * Must set this property to make this rule active.
     *
     * @param errorListAdaptor an adaptor instance that can operate
     *                         on the real global validation list.
     */
    @Inject
    public void setErrorListAdaptor(ValidationErrorListAdaptor errorListAdaptor) {
        this.errorListAdaptor = errorListAdaptor;
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new ValidationErrorListStateChangeEventBinding(
                        e -> errorListAdaptor != null,
                        this::updateErrorNodeList
                )
        );
    }

    /**
     * Merge the new validation errors of a node into the global error list.
     *
     * @param typedEvent instance of ValidationErrorListStateChangeEvent.
     */
    private void updateErrorNodeList(ValidationErrorListStateChangeEvent typedEvent) {
        //find new validation errors
        ValidationErrorList newValidationErrorList = typedEvent.getOrigin().getValidationErrorList();
        Set<ValidationError> newValidationErrorSet = new HashSet<>();
        if (newValidationErrorList != null) {
            newValidationErrorSet.addAll(newValidationErrorList);
        }

        //identify which errors are not in the new validation errors set
        HashSet<ValidationError> existingValidationErrorSet = new HashSet<>();
        HashSet<String> notInNewValidationErrorSet = new HashSet<>();
        for (int i = 0; i < errorListAdaptor.getItemCount(); i++) {
            ValidationError error = errorListAdaptor.getItem(i);
            if (error.getOrigin() == typedEvent.getOrigin()) {
                if (newValidationErrorSet.contains(error)) {
                    existingValidationErrorSet.add(error);
                } else {
                    notInNewValidationErrorSet.add(errorListAdaptor.getItemName(i));
                }
            }
        }

        //remove nodes not in list anymore
        for (String name : notInNewValidationErrorSet) {
            errorListAdaptor.removeItem(name);
        }

        //add new nodes
        if (newValidationErrorList != null) {
            for (ValidationError error : newValidationErrorList) {
                if (!existingValidationErrorSet.contains(error)) {
                    errorListAdaptor.addItem(error);
                }
            }
        }
    }
}

