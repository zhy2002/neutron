package zhy2002.examples.register.gen;

import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.node.RegisterNode;
import zhy2002.neutron.NodeFinder;
import zhy2002.neutron.NodeReferenceRegistry;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterNodeContext_MembersInjector
    implements MembersInjector<RegisterNodeContext> {
  private final Provider<NodeFinder> nodeFinderProvider;

  private final Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider;

  private final Provider<RegisterNode> rootNodeLazyProvider;

  public RegisterNodeContext_MembersInjector(
      Provider<NodeFinder> nodeFinderProvider,
      Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider,
      Provider<RegisterNode> rootNodeLazyProvider) {
    assert nodeFinderProvider != null;
    this.nodeFinderProvider = nodeFinderProvider;
    assert nodeReferenceRegistryProvider != null;
    this.nodeReferenceRegistryProvider = nodeReferenceRegistryProvider;
    assert rootNodeLazyProvider != null;
    this.rootNodeLazyProvider = rootNodeLazyProvider;
  }

  public static MembersInjector<RegisterNodeContext> create(
      Provider<NodeFinder> nodeFinderProvider,
      Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider,
      Provider<RegisterNode> rootNodeLazyProvider) {
    return new RegisterNodeContext_MembersInjector(
        nodeFinderProvider, nodeReferenceRegistryProvider, rootNodeLazyProvider);
  }

  @Override
  public void injectMembers(RegisterNodeContext instance) {
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
      RegisterNodeContext instance, Provider<RegisterNode> rootNodeLazyProvider) {
    instance.rootNodeLazy = DoubleCheck.lazy(rootNodeLazyProvider);
  }
}
