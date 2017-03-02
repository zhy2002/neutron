package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyWorkPhoneNodeRuleProvider_Factory
    implements Factory<ThirdPartyWorkPhoneNodeRuleProvider> {
  private final MembersInjector<ThirdPartyWorkPhoneNodeRuleProvider>
      thirdPartyWorkPhoneNodeRuleProviderMembersInjector;

  public ThirdPartyWorkPhoneNodeRuleProvider_Factory(
      MembersInjector<ThirdPartyWorkPhoneNodeRuleProvider>
          thirdPartyWorkPhoneNodeRuleProviderMembersInjector) {
    assert thirdPartyWorkPhoneNodeRuleProviderMembersInjector != null;
    this.thirdPartyWorkPhoneNodeRuleProviderMembersInjector =
        thirdPartyWorkPhoneNodeRuleProviderMembersInjector;
  }

  @Override
  public ThirdPartyWorkPhoneNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        thirdPartyWorkPhoneNodeRuleProviderMembersInjector,
        new ThirdPartyWorkPhoneNodeRuleProvider());
  }

  public static Factory<ThirdPartyWorkPhoneNodeRuleProvider> create(
      MembersInjector<ThirdPartyWorkPhoneNodeRuleProvider>
          thirdPartyWorkPhoneNodeRuleProviderMembersInjector) {
    return new ThirdPartyWorkPhoneNodeRuleProvider_Factory(
        thirdPartyWorkPhoneNodeRuleProviderMembersInjector);
  }
}
