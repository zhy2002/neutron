package zhy2002.neutron;

import zhy2002.examples.register.UiNodeChangeListener;

import java.util.*;

/**
 * Contains all changes done in this cycle.
 */
public class Cycle {

    private Deque<UiNodeEvent> eventDeque = new ArrayDeque<>();
    private boolean applied;

    public boolean isApplied() {
        return applied;
    }

    public void apply() {
        Iterator<UiNodeEvent> iterator = eventDeque.iterator();
        while (iterator.hasNext()) {
            UiNodeEvent uiNodeEvent = iterator.next();
            if (uiNodeEvent instanceof ChangeUiNodeEvent) {
                ChangeUiNodeEvent changeUiNodeEvent = (ChangeUiNodeEvent) uiNodeEvent;
                changeUiNodeEvent.apply();
            }
        }
        applied = true;
    }

    public void revert() {
        Iterator<UiNodeEvent> iterator = eventDeque.descendingIterator();
        while (iterator.hasNext()) {
            UiNodeEvent uiNodeEvent = iterator.next();
            if (uiNodeEvent instanceof ChangeUiNodeEvent) {
                ChangeUiNodeEvent changeUiNodeEvent = (ChangeUiNodeEvent) uiNodeEvent;
                changeUiNodeEvent.revert();
            }
        }
        applied = false;
    }

    public void add(UiNodeEvent event) {
        eventDeque.add(event);
    }

    public void notifyChanges() {
        Iterator<UiNodeEvent> iterator = applied ? eventDeque.iterator() : eventDeque.descendingIterator();
        List<UiNode<?>> changedNodes = new ArrayList<>();
        while (iterator.hasNext()) {
            UiNodeEvent uiNodeEvent = iterator.next();
            if (uiNodeEvent instanceof ChangeUiNodeEvent) {
                changedNodes.add(uiNodeEvent.getTarget());
            }
        }
        for(UiNode<?> node : changedNodes) {
            node.notifyChange();
        }
    }
}
