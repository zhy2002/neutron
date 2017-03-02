package zhy2002.neutron.rule;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.NodeReferenceRegistry;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NodeReferenceChangeRule_MembersInjector
    implements MembersInjector<NodeReferenceChangeRule> {
  private final Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider;

  public NodeReferenceChangeRule_MembersInjector(
      Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider) {
    assert nodeReferenceRegistryProvider != null;
    this.nodeReferenceRegistryProvider = nodeReferenceRegistryProvider;
  }

  public static MembersInjector<NodeReferenceChangeRule> create(
      Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider) {
    return new NodeReferenceChangeRule_MembersInjector(nodeReferenceRegistryProvider);
  }

  @Override
  public void injectMembers(NodeReferenceChangeRule instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.nodeReferenceRegistry = nodeReferenceRegistryProvider.get();
  }

  public static void injectNodeReferenceRegistry(
      NodeReferenceChangeRule instance,
      Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider) {
    instance.nodeReferenceRegistry = nodeReferenceRegistryProvider.get();
  }
}
