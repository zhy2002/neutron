package zhy2002.neutron.core;

import zhy2002.neutron.core.util.ValueUtil;

import javax.validation.constraints.NotNull;

/**
 * Base class of all concrete event bindings.
 *
 * @param <E> the type of the event.
 */
public abstract class AbstractEventBinding<E extends UiNodeEvent> implements EventBinding {

    private final UiNodeEventKey<?> eventKey;
    private final TickPhase phase;
    private final UiNodeEventFilter<E> filter;
    private final UiNodeEventHandler<E> handler;

    protected AbstractEventBinding(
            UiNodeEventFilter<E> filter,
            @NotNull UiNodeEventHandler<E> handler,
            @NotNull Class<? extends UiNodeEvent> eventClass,
            @NotNull String subject,
            TickPhase phase
    ) {
        assert eventClass != null;
        assert subject != null;
        assert handler != null;
        this.eventKey = new UiNodeEventKey<>(eventClass, subject);
        this.handler = handler;
        this.phase = ValueUtil.ifNull(phase, PredefinedPhases.Post);
        this.filter = ValueUtil.ifNull(filter, e -> true);
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
        return "Binding on " + getEventKey().toString() + " " + this.phase + " phase";
    }
}
