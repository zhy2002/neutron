package zhy2002.examples.app.gen;

import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.app.gen.node.LodgementNode;
import zhy2002.neutron.NodeFinder;
import zhy2002.neutron.NodeReferenceRegistry;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LodgementNodeContext_MembersInjector
    implements MembersInjector<LodgementNodeContext> {
  private final Provider<NodeFinder> nodeFinderProvider;

  private final Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider;

  private final Provider<LodgementNode> rootNodeLazyProvider;

  public LodgementNodeContext_MembersInjector(
      Provider<NodeFinder> nodeFinderProvider,
      Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider,
      Provider<LodgementNode> rootNodeLazyProvider) {
    assert nodeFinderProvider != null;
    this.nodeFinderProvider = nodeFinderProvider;
    assert nodeReferenceRegistryProvider != null;
    this.nodeReferenceRegistryProvider = nodeReferenceRegistryProvider;
    assert rootNodeLazyProvider != null;
    this.rootNodeLazyProvider = rootNodeLazyProvider;
  }

  public static MembersInjector<LodgementNodeContext> create(
      Provider<NodeFinder> nodeFinderProvider,
      Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider,
      Provider<LodgementNode> rootNodeLazyProvider) {
    return new LodgementNodeContext_MembersInjector(
        nodeFinderProvider, nodeReferenceRegistryProvider, rootNodeLazyProvider);
  }

  @Override
  public void injectMembers(LodgementNodeContext instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.neutron.AbstractUiNodeContext_MembersInjector.injectNodeFinder(
        instance, nodeFinderProvider);
    zhy2002.neutron.AbstractUiNodeContext_MembersInjector.injectNodeReferenceRegistry(
        instance, nodeReferenceRegistryProvider);
    instance.rootNodeLazy = DoubleCheck.lazy(rootNodeLazyProvider);
  }

  public static void injectRootNodeLazy(
      LodgementNodeContext instance, Provider<LodgementNode> rootNodeLazyProvider) {
    instance.rootNodeLazy = DoubleCheck.lazy(rootNodeLazyProvider);
  }
}
