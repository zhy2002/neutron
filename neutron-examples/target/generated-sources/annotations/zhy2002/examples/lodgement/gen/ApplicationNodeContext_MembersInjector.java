package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.neutron.NodeFinder;
import zhy2002.neutron.NodeReferenceRegistry;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationNodeContext_MembersInjector
    implements MembersInjector<ApplicationNodeContext> {
  private final Provider<NodeFinder> nodeFinderProvider;

  private final Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider;

  private final Provider<ApplicationNode> rootNodeLazyProvider;

  public ApplicationNodeContext_MembersInjector(
      Provider<NodeFinder> nodeFinderProvider,
      Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider,
      Provider<ApplicationNode> rootNodeLazyProvider) {
    assert nodeFinderProvider != null;
    this.nodeFinderProvider = nodeFinderProvider;
    assert nodeReferenceRegistryProvider != null;
    this.nodeReferenceRegistryProvider = nodeReferenceRegistryProvider;
    assert rootNodeLazyProvider != null;
    this.rootNodeLazyProvider = rootNodeLazyProvider;
  }

  public static MembersInjector<ApplicationNodeContext> create(
      Provider<NodeFinder> nodeFinderProvider,
      Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider,
      Provider<ApplicationNode> rootNodeLazyProvider) {
    return new ApplicationNodeContext_MembersInjector(
        nodeFinderProvider, nodeReferenceRegistryProvider, rootNodeLazyProvider);
  }

  @Override
  public void injectMembers(ApplicationNodeContext instance) {
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
      ApplicationNodeContext instance, Provider<ApplicationNode> rootNodeLazyProvider) {
    instance.rootNodeLazy = DoubleCheck.lazy(rootNodeLazyProvider);
  }
}
