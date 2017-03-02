package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyFirstNameNodeRuleProvider_Factory
    implements Factory<ThirdPartyFirstNameNodeRuleProvider> {
  private final MembersInjector<ThirdPartyFirstNameNodeRuleProvider>
      thirdPartyFirstNameNodeRuleProviderMembersInjector;

  public ThirdPartyFirstNameNodeRuleProvider_Factory(
      MembersInjector<ThirdPartyFirstNameNodeRuleProvider>
          thirdPartyFirstNameNodeRuleProviderMembersInjector) {
    assert thirdPartyFirstNameNodeRuleProviderMembersInjector != null;
    this.thirdPartyFirstNameNodeRuleProviderMembersInjector =
        thirdPartyFirstNameNodeRuleProviderMembersInjector;
  }

  @Override
  public ThirdPartyFirstNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        thirdPartyFirstNameNodeRuleProviderMembersInjector,
        new ThirdPartyFirstNameNodeRuleProvider());
  }

  public static Factory<ThirdPartyFirstNameNodeRuleProvider> create(
      MembersInjector<ThirdPartyFirstNameNodeRuleProvider>
          thirdPartyFirstNameNodeRuleProviderMembersInjector) {
    return new ThirdPartyFirstNameNodeRuleProvider_Factory(
        thirdPartyFirstNameNodeRuleProviderMembersInjector);
  }
}
