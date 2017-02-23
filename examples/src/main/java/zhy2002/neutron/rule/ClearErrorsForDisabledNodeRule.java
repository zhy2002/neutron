package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.ParentUiNode;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEvent;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import java.util.*;

/**
 * Clears validations of this node and all descendant nodes.
 */
public class ClearErrorsForDisabledNodeRule extends UiNodeRule<UiNode<?>> {

    @Inject
    public ClearErrorsForDisabledNodeRule(@Owner UiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new BooleanStateChangeEventBinding(
                        event -> Boolean.TRUE.equals(event.getNewValue()),
                        this::clearValidationErrors,
                        Collections.singletonList(NeutronEventSubjects.DISABLED)
                )
        );
    }

    private void clearValidationErrors(BooleanStateChangeEvent event) {
        Deque<UiNode<?>> queue = new ArrayDeque<>();
        queue.add(event.getOrigin());
        while (!queue.isEmpty()) {
            UiNode<?> node = queue.poll();
            node.clearValidationErrors();
            if (node instanceof ParentUiNode) {
                ParentUiNode<?> parent = (ParentUiNode<?>) node;
                queue.addAll(Arrays.asList(parent.getChildren()));
            }
        }
    }
}
