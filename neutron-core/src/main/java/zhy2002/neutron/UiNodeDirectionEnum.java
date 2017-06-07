package zhy2002.neutron;

import jsinterop.annotations.JsType;
import zhy2002.neutron.config.NeutronConstants;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * How the action is propagated through the event system.
 */
@JsType(name = NeutronConstants.JS_NAMESPACE)
public enum UiNodeDirectionEnum {

    Up(DirectionConstants.UP), Down(DirectionConstants.DOWN);

    private final int direction;

    UiNodeDirectionEnum(int direction) {
        this.direction = direction;
    }

    public final Iterable<BindingActivation> getActivations(UiNodeEvent event) {
        if (direction == DirectionConstants.UP) {
            return getUpActivations(event);
        } else {
            return getDownActivations(event);
        }
    }

    private Iterable<BindingActivation> getDownActivations(UiNodeEvent event) {
        List<BindingActivation> result = new ArrayList<>();
        UiNode<?> target = event.getOrigin();
        Queue<UiNode<?>> queue = new ArrayDeque<>();
        queue.add(target); //bfs
        while (!queue.isEmpty()) {
            target = queue.poll();
            if (target instanceof ParentUiNode) {
                ParentUiNode<?> parentUiNode = (ParentUiNode<?>) target;
                for (int i = 0; i < parentUiNode.getChildCount(); i++) {
                    queue.add(parentUiNode.getChild(i));
                }
            }
            event.addBindingActivations(result, target);
        }
        return result;
    }

    private Iterable<BindingActivation> getUpActivations(UiNodeEvent event) {
        List<BindingActivation> result = new ArrayList<>();
        UiNode<?> anchor = event.getOrigin();
        do {
            event.addBindingActivations(result, anchor);
            anchor = anchor.getParent();
        } while (anchor != null);

        return result;
    }
}

class DirectionConstants {
    static final int UP = 0;
    static final int DOWN = 1;
}