package zhy2002.neutron;

@FunctionalInterface
public interface NodeLoadEventFactory<N extends UiNode<?>> {

    NodeLoadEvent<N> create(N target);

}
