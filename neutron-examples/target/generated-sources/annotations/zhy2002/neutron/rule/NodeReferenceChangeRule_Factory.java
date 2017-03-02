package zhy2002.neutron.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.node.ReferenceUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NodeReferenceChangeRule_Factory implements Factory<NodeReferenceChangeRule> {
  private final MembersInjector<NodeReferenceChangeRule> nodeReferenceChangeRuleMembersInjector;

  private final Provider<ReferenceUiNode<?>> arg0Provider;

  public NodeReferenceChangeRule_Factory(
      MembersInjector<NodeReferenceChangeRule> nodeReferenceChangeRuleMembersInjector,
      Provider<ReferenceUiNode<?>> arg0Provider) {
    assert nodeReferenceChangeRuleMembersInjector != null;
    this.nodeReferenceChangeRuleMembersInjector = nodeReferenceChangeRuleMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public NodeReferenceChangeRule get() {
    return MembersInjectors.injectMembers(
        nodeReferenceChangeRuleMembersInjector, new NodeReferenceChangeRule(arg0Provider.get()));
  }

  public static Factory<NodeReferenceChangeRule> create(
      MembersInjector<NodeReferenceChangeRule> nodeReferenceChangeRuleMembersInjector,
      Provider<ReferenceUiNode<?>> arg0Provider) {
    return new NodeReferenceChangeRule_Factory(
        nodeReferenceChangeRuleMembersInjector, arg0Provider);
  }
}
