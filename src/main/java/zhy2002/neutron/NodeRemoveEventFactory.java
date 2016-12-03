package zhy2002.neutron;

@FunctionalInterface
public interface NodeRemoveEventFactory<N extends UiNode<? extends ListUiNode<?, ?, N>>> {

    NodeRemoveEvent<N> create(N item);

}

