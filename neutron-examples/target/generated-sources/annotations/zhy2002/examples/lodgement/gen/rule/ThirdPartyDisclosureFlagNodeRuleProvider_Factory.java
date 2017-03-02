package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyDisclosureFlagNodeRuleProvider_Factory
    implements Factory<ThirdPartyDisclosureFlagNodeRuleProvider> {
  private final MembersInjector<ThirdPartyDisclosureFlagNodeRuleProvider>
      thirdPartyDisclosureFlagNodeRuleProviderMembersInjector;

  public ThirdPartyDisclosureFlagNodeRuleProvider_Factory(
      MembersInjector<ThirdPartyDisclosureFlagNodeRuleProvider>
          thirdPartyDisclosureFlagNodeRuleProviderMembersInjector) {
    assert thirdPartyDisclosureFlagNodeRuleProviderMembersInjector != null;
    this.thirdPartyDisclosureFlagNodeRuleProviderMembersInjector =
        thirdPartyDisclosureFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public ThirdPartyDisclosureFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        thirdPartyDisclosureFlagNodeRuleProviderMembersInjector,
        new ThirdPartyDisclosureFlagNodeRuleProvider());
  }

  public static Factory<ThirdPartyDisclosureFlagNodeRuleProvider> create(
      MembersInjector<ThirdPartyDisclosureFlagNodeRuleProvider>
          thirdPartyDisclosureFlagNodeRuleProviderMembersInjector) {
    return new ThirdPartyDisclosureFlagNodeRuleProvider_Factory(
        thirdPartyDisclosureFlagNodeRuleProviderMembersInjector);
  }
}
