package zhy2002.neutron;

import javax.validation.constraints.NotNull;

/**
 * An event can only activate the rules that handles its event key.
 */
public final class UiNodeEventKey<E extends UiNodeEvent> {

    private final Class<E> eventClass;
    private final String subject;

    public UiNodeEventKey(@NotNull Class<E> eventClass, @NotNull String subject) {
        this.eventClass = eventClass;
        this.subject = subject;
    }

    public Class<E> getEventClass() {
        return eventClass;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UiNodeEventKey<?> eventKey = (UiNodeEventKey<?>) o;

        if (!eventClass.equals(eventKey.eventClass)) return false;
        return subject.equals(eventKey.subject);
    }

    @Override
    public int hashCode() {
        int result = eventClass.hashCode();
        result = 31 * result + subject.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return subject + ":" + eventClass.getSimpleName();
    }
}
