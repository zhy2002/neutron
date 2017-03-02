package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedNodeRuleProvider_Factory
    implements Factory<UnemployedNodeRuleProvider> {
  private final MembersInjector<UnemployedNodeRuleProvider>
      unemployedNodeRuleProviderMembersInjector;

  public UnemployedNodeRuleProvider_Factory(
      MembersInjector<UnemployedNodeRuleProvider> unemployedNodeRuleProviderMembersInjector) {
    assert unemployedNodeRuleProviderMembersInjector != null;
    this.unemployedNodeRuleProviderMembersInjector = unemployedNodeRuleProviderMembersInjector;
  }

  @Override
  public UnemployedNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        unemployedNodeRuleProviderMembersInjector, new UnemployedNodeRuleProvider());
  }

  public static Factory<UnemployedNodeRuleProvider> create(
      MembersInjector<UnemployedNodeRuleProvider> unemployedNodeRuleProviderMembersInjector) {
    return new UnemployedNodeRuleProvider_Factory(unemployedNodeRuleProviderMembersInjector);
  }
}
