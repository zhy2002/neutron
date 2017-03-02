package zhy2002.neutron;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.node.VoidUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AbstractUiNodeContext_MembersInjector<R extends UiNode<VoidUiNode>>
    implements MembersInjector<AbstractUiNodeContext<R>> {
  private final Provider<NodeFinder> nodeFinderProvider;

  private final Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider;

  public AbstractUiNodeContext_MembersInjector(
      Provider<NodeFinder> nodeFinderProvider,
      Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider) {
    assert nodeFinderProvider != null;
    this.nodeFinderProvider = nodeFinderProvider;
    assert nodeReferenceRegistryProvider != null;
    this.nodeReferenceRegistryProvider = nodeReferenceRegistryProvider;
  }

  public static <R extends UiNode<VoidUiNode>> MembersInjector<AbstractUiNodeContext<R>> create(
      Provider<NodeFinder> nodeFinderProvider,
      Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider) {
    return new AbstractUiNodeContext_MembersInjector<R>(
        nodeFinderProvider, nodeReferenceRegistryProvider);
  }

  @Override
  public void injectMembers(AbstractUiNodeContext<R> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.nodeFinder = nodeFinderProvider.get();
    instance.nodeReferenceRegistry = nodeReferenceRegistryProvider.get();
  }

  public static <R extends UiNode<VoidUiNode>> void injectNodeFinder(
      AbstractUiNodeContext<R> instance, Provider<NodeFinder> nodeFinderProvider) {
    instance.nodeFinder = nodeFinderProvider.get();
  }

  public static <R extends UiNode<VoidUiNode>> void injectNodeReferenceRegistry(
      AbstractUiNodeContext<R> instance,
      Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider) {
    instance.nodeReferenceRegistry = nodeReferenceRegistryProvider.get();
  }
}
