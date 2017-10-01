package zhy2002.neutron.core;

@FunctionalInterface
public interface UiNodeEventHandler<E extends UiNodeEvent> {

    void handle(E event);

}
