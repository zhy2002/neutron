package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustAddressNodeRuleProvider_Factory
    implements Factory<TrustAddressNodeRuleProvider> {
  private final MembersInjector<TrustAddressNodeRuleProvider>
      trustAddressNodeRuleProviderMembersInjector;

  public TrustAddressNodeRuleProvider_Factory(
      MembersInjector<TrustAddressNodeRuleProvider> trustAddressNodeRuleProviderMembersInjector) {
    assert trustAddressNodeRuleProviderMembersInjector != null;
    this.trustAddressNodeRuleProviderMembersInjector = trustAddressNodeRuleProviderMembersInjector;
  }

  @Override
  public TrustAddressNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        trustAddressNodeRuleProviderMembersInjector, new TrustAddressNodeRuleProvider());
  }

  public static Factory<TrustAddressNodeRuleProvider> create(
      MembersInjector<TrustAddressNodeRuleProvider> trustAddressNodeRuleProviderMembersInjector) {
    return new TrustAddressNodeRuleProvider_Factory(trustAddressNodeRuleProviderMembersInjector);
  }
}
