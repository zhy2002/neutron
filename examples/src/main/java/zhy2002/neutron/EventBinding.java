package zhy2002.neutron;

import java.util.Collection;

/**
 * Implementor of this interface are hooks into the node structure
 * which is fired when at the specified phase of interested events.
 */
public interface EventBinding {

    Collection<UiNodeEventKey<?>> getEventKeys();

    TickPhase getPhase();

    boolean canFire(UiNodeEvent event);

    void fire(UiNodeEvent event);
}
