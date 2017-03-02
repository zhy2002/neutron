package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustSettlorListNodeRuleProvider_Factory
    implements Factory<TrustSettlorListNodeRuleProvider> {
  private final MembersInjector<TrustSettlorListNodeRuleProvider>
      trustSettlorListNodeRuleProviderMembersInjector;

  public TrustSettlorListNodeRuleProvider_Factory(
      MembersInjector<TrustSettlorListNodeRuleProvider>
          trustSettlorListNodeRuleProviderMembersInjector) {
    assert trustSettlorListNodeRuleProviderMembersInjector != null;
    this.trustSettlorListNodeRuleProviderMembersInjector =
        trustSettlorListNodeRuleProviderMembersInjector;
  }

  @Override
  public TrustSettlorListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        trustSettlorListNodeRuleProviderMembersInjector, new TrustSettlorListNodeRuleProvider());
  }

  public static Factory<TrustSettlorListNodeRuleProvider> create(
      MembersInjector<TrustSettlorListNodeRuleProvider>
          trustSettlorListNodeRuleProviderMembersInjector) {
    return new TrustSettlorListNodeRuleProvider_Factory(
        trustSettlorListNodeRuleProviderMembersInjector);
  }
}
