package zhy2002.neutron;

import java.util.Collection;


public interface EventBinding {

    Collection<UiNodeEventKey<?>> getEventKeys();

    TickPhase getPhase();

    boolean canFire(UiNodeEvent event);

    void fire(UiNodeEvent event);
}
