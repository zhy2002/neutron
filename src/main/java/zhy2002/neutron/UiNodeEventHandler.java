package zhy2002.neutron;

@FunctionalInterface
public interface UiNodeEventHandler<E extends UiNodeEvent> {

    void handle(E event);

}
