package zhy2002.neutron;

@FunctionalInterface
public interface NodeUnloadEventFactory<N extends UiNode<?>> {

    NodeUnloadEvent<N> create(N target);

}