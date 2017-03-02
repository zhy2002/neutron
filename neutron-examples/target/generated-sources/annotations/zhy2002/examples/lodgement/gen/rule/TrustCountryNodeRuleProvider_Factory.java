package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustCountryNodeRuleProvider_Factory
    implements Factory<TrustCountryNodeRuleProvider> {
  private final MembersInjector<TrustCountryNodeRuleProvider>
      trustCountryNodeRuleProviderMembersInjector;

  public TrustCountryNodeRuleProvider_Factory(
      MembersInjector<TrustCountryNodeRuleProvider> trustCountryNodeRuleProviderMembersInjector) {
    assert trustCountryNodeRuleProviderMembersInjector != null;
    this.trustCountryNodeRuleProviderMembersInjector = trustCountryNodeRuleProviderMembersInjector;
  }

  @Override
  public TrustCountryNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        trustCountryNodeRuleProviderMembersInjector, new TrustCountryNodeRuleProvider());
  }

  public static Factory<TrustCountryNodeRuleProvider> create(
      MembersInjector<TrustCountryNodeRuleProvider> trustCountryNodeRuleProviderMembersInjector) {
    return new TrustCountryNodeRuleProvider_Factory(trustCountryNodeRuleProviderMembersInjector);
  }
}
