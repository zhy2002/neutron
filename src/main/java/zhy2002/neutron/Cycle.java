package zhy2002.neutron;

import java.util.*;

/**
 * Contains all changes done in this cycle.
 */
public class Cycle {

    private final Deque<UiNodeEvent> notAppliedDeque = new ArrayDeque<>();
    private final Deque<UiNodeEvent> appliedDeque = new ArrayDeque<>();

    public boolean isApplied() {
        return notAppliedDeque.isEmpty();
    }

    public void apply() {
        while (!notAppliedDeque.isEmpty()) {
            UiNodeEvent uiNodeEvent = notAppliedDeque.poll();
            if (uiNodeEvent instanceof ChangeUiNodeEvent) {
                ChangeUiNodeEvent changeUiNodeEvent = (ChangeUiNodeEvent) uiNodeEvent;
                changeUiNodeEvent.apply();
            }
            appliedDeque.add(uiNodeEvent);
        }
    }

    public void revert() {
        while (!appliedDeque.isEmpty()) {
            UiNodeEvent uiNodeEvent = appliedDeque.pollLast();
            if (uiNodeEvent instanceof ChangeUiNodeEvent) {
                ChangeUiNodeEvent changeUiNodeEvent = (ChangeUiNodeEvent) uiNodeEvent;
                changeUiNodeEvent.revert();
            }
            notAppliedDeque.addFirst(uiNodeEvent);
        }
    }

    public void add(UiNodeEvent event) {
        notAppliedDeque.add(event);
    }

    public void notifyChanges() {
        Iterator<UiNodeEvent> iterator = appliedDeque.iterator();
        List<UiNode<?>> changedNodes = new ArrayList<>();
        while (iterator.hasNext()) {
            UiNodeEvent uiNodeEvent = iterator.next();
            if (uiNodeEvent instanceof NodeAddEvent || uiNodeEvent instanceof NodeRemoveEvent) {
                changedNodes.add(uiNodeEvent.getTarget().getParent());
            }
            if (uiNodeEvent instanceof ChangeUiNodeEvent) {
                changedNodes.add(uiNodeEvent.getTarget());
            }
        }
        Set<UiNode<?>> notified = new HashSet<>();
        for (UiNode<?> node : changedNodes) {
            if (notified.contains(node))
                continue;
            node.notifyChange();
            notified.add(node);
        }
    }
}
