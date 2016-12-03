package zhy2002.neutron;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * An event that can only trigger post change rules.
 */
public class RefreshUiNodeEvent extends UiNodeEvent {

    protected RefreshUiNodeEvent(UiNode<?> target) {
        super(target);
    }

    @Override
    public Iterable<UiNodeRuleActivation> getActivations() {
        List<UiNodeRuleActivation> result = new ArrayList<>();
        UiNode<?> target = getTarget();
        Queue<UiNode<?>> queue = new ArrayDeque<>();
        queue.add(target); //dfs
        while (!queue.isEmpty()) {
            target = queue.poll();
            if (target instanceof ParentUiNode) {
                ParentUiNode<?> parentUiNode = (ParentUiNode<?>) target;
                for (int i = 0; i < parentUiNode.getChildCount(); i++) {
                    queue.add(parentUiNode.getChild(i));
                }
            }
            for (UiNodeRule<?, ?> rule : target.getAttachedRules(this.getClass())) {//todo not right, event inheritance
                UiNodeRuleActivation activation = new UiNodeRuleActivation(rule, this);
                result.add(activation);
            }
        }
        return result;
    }
/*
UiNodeEvent event

*/

}
