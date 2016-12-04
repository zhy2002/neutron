package zhy2002.neutron;

/**
 * The common factory base class for creating child nodes.
 */
@FunctionalInterface
public interface ChildNodeFactory<N extends UiNode<? extends P>, P extends ParentUiNode<?>> {

    N create(P parent, String name);
}
