package zhy2002.neutron;

@FunctionalInterface
public interface NodeAddEventFactory<N extends UiNode<? extends ListUiNode<?, ?, N>>> {

    NodeAddEvent<N> create(N item);
}
