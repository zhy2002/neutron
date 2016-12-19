package zhy2002.neutron;


@FunctionalInterface
public interface UiNodeEventFilter<E extends UiNodeEvent> {

    /**
     * @param event the UiNodeEvent.
     * @return true if event should be handled.
     */
    boolean pass(E event);
}
