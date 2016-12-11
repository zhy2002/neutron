package zhy2002.neutron;

/**
 * The common factory base class for creating child nodes.
 * This type has to be an abstract class rather than a functional interface
 * to avoid a GWT runtime ClassCastException.
 * I think this is a bug in GWT when 2 type parameters are used like this.
 */
@FunctionalInterface
public interface ChildNodeFactory<N extends UiNode<? extends P>, P extends ParentUiNode<?>> {

    N create(P parent, String name);
}
