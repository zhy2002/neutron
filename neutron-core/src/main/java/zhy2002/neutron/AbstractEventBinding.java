package zhy2002.neutron;

import zhy2002.neutron.util.PredefinedPhases;
import zhy2002.neutron.util.ValueUtil;

import javax.validation.constraints.NotNull;

/**
 * An AbstractEventBinding instance is a hook into the node structure which is notified when
 * events occur.
 * If the event class matches and the subject is one of the subjects, then
 * at the phase of the event canFire is called. If canFire returns true fire is called.
 *
 * @param <E> the type of the event.
 */
public abstract class AbstractEventBinding<E extends UiNodeEvent> implements EventBinding {

    private final UiNodeEventKey<?> eventKey;
    private final TickPhase phase;
    private final UiNodeEventFilter<E> filter;
    private final UiNodeEventHandler<E> handler;

    AbstractEventBinding(
            UiNodeEventFilter<E> filter,
            @NotNull UiNodeEventHandler<E> handler,
            @NotNull Class<? extends UiNodeEvent> eventClass,
            @NotNull String subject,
            TickPhase phase
    ) {
        this.eventKey = new UiNodeEventKey<>(eventClass, subject);
        this.phase = ValueUtil.ifNull(phase, PredefinedPhases.Post);
        this.filter = ValueUtil.ifNull(filter, e -> true);
        this.handler = handler;
    }

    public final UiNodeEventKey<?> getEventKey() {
        return eventKey;
    }

    public final TickPhase getPhase() {
        return phase;
    }

    @SuppressWarnings("unchecked")
    public final boolean canFire(UiNodeEvent event) {
        return filter.pass((E) event);
    }

    @SuppressWarnings("unchecked")
    public final void fire(UiNodeEvent event) {
        handler.handle((E) event);
    }

    @Override
    public String toString() {
        return this.phase + " phase of " + getEventKey().toString();
    }
}
