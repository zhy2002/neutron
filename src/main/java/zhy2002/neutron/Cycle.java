package zhy2002.neutron;

import zhy2002.neutron.event.UiNodeEvent;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

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
            iterator.next().apply();
        }
        applied = true;
    }

    public void revert() {
        Iterator<UiNodeEvent> iterator = eventDeque.descendingIterator();
        while (iterator.hasNext()) {
            iterator.next().revert();
        }
        applied = false;
    }

    public void add(UiNodeEvent event) {
        eventDeque.add(event);
    }
}
