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

public class UpdateDisabledRule extends UiNodeRule<ParentUiNode<?>> {

    @Inject
    protected UpdateDisabledRule(@Owner ParentUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new BooleanStateChangeEventBinding(
                        e -> e.getOrigin() == getOwner() && !Objects.equals(e.getOldValue(), e.getNewValue()),
                        this::updateDisabledAncestorCount,
                        Collections.singleton(NeutronEventSubjects.DISABLED)
                )
        );
    }

    private void updateDisabledAncestorCount(BooleanStateChangeEvent event) {
        int delta;
        if (Boolean.TRUE.equals(event.getNewValue())) {
            delta = 1;
        } else {
            delta = -1;
        }

        Queue<UiNode<?>> nodes = new ArrayDeque<>();
        nodes.addAll(Arrays.asList(getOwner().getChildren()));
        while (!nodes.isEmpty()) {
            UiNode<?> node = nodes.poll();
            node.setDisabledAncestorCount(node.getDisabledAncestorCount() + delta);
            if (node instanceof ParentUiNode) {
                ParentUiNode<?> parent = (ParentUiNode<?>) node;
                nodes.addAll(Arrays.asList(parent.getChildren()));
            }
        }
    }
}
