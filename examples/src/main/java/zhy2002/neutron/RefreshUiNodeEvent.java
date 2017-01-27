package zhy2002.neutron;

import zhy2002.neutron.util.NeutronEventSubjects;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * An event that can only trigger post change rules.
 */
public class RefreshUiNodeEvent extends UiNodeEvent {

    protected RefreshUiNodeEvent(UiNode<?> origin) {
        this(origin, null);
    }

    protected RefreshUiNodeEvent(UiNode<?> origin, String reason) {
        super(origin, reason == null ? NeutronEventSubjects.DEFAULT_REFRESH_REASON : reason);
    }

    @Override
    public Iterable<BindingActivation> getActivations() {
        List<BindingActivation> result = new ArrayList<>();
        UiNode<?> target = getOrigin();
        Queue<UiNode<?>> queue = new ArrayDeque<>();
        queue.add(target); //bfs
        while (!queue.isEmpty()) {
            target = queue.poll();
            if(target.isDisabled())
                continue;
            if (target instanceof ParentUiNode) {
                ParentUiNode<?> parentUiNode = (ParentUiNode<?>) target;
                for (int i = 0; i < parentUiNode.getChildCount(); i++) {
                    queue.add(parentUiNode.getChild(i));
                }
            }
            for (EventBinding binding : target.getAttachedEventBindings(this.getEventKey())) {//todo not right, event inheritance
                BindingActivation activation = new BindingActivation(binding, this);
                result.add(activation);
            }
        }
        return result;
    }

}
