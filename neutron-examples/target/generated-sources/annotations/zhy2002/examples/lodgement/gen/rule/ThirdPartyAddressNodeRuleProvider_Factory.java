package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyAddressNodeRuleProvider_Factory
    implements Factory<ThirdPartyAddressNodeRuleProvider> {
  private final MembersInjector<ThirdPartyAddressNodeRuleProvider>
      thirdPartyAddressNodeRuleProviderMembersInjector;

  public ThirdPartyAddressNodeRuleProvider_Factory(
      MembersInjector<ThirdPartyAddressNodeRuleProvider>
          thirdPartyAddressNodeRuleProviderMembersInjector) {
    assert thirdPartyAddressNodeRuleProviderMembersInjector != null;
    this.thirdPartyAddressNodeRuleProviderMembersInjector =
        thirdPartyAddressNodeRuleProviderMembersInjector;
  }

  @Override
  public ThirdPartyAddressNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        thirdPartyAddressNodeRuleProviderMembersInjector, new ThirdPartyAddressNodeRuleProvider());
  }

  public static Factory<ThirdPartyAddressNodeRuleProvider> create(
      MembersInjector<ThirdPartyAddressNodeRuleProvider>
          thirdPartyAddressNodeRuleProviderMembersInjector) {
    return new ThirdPartyAddressNodeRuleProvider_Factory(
        thirdPartyAddressNodeRuleProviderMembersInjector);
  }
}
