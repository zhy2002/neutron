package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyEmailNodeRuleProvider_Factory
    implements Factory<ThirdPartyEmailNodeRuleProvider> {
  private final MembersInjector<ThirdPartyEmailNodeRuleProvider>
      thirdPartyEmailNodeRuleProviderMembersInjector;

  public ThirdPartyEmailNodeRuleProvider_Factory(
      MembersInjector<ThirdPartyEmailNodeRuleProvider>
          thirdPartyEmailNodeRuleProviderMembersInjector) {
    assert thirdPartyEmailNodeRuleProviderMembersInjector != null;
    this.thirdPartyEmailNodeRuleProviderMembersInjector =
        thirdPartyEmailNodeRuleProviderMembersInjector;
  }

  @Override
  public ThirdPartyEmailNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        thirdPartyEmailNodeRuleProviderMembersInjector, new ThirdPartyEmailNodeRuleProvider());
  }

  public static Factory<ThirdPartyEmailNodeRuleProvider> create(
      MembersInjector<ThirdPartyEmailNodeRuleProvider>
          thirdPartyEmailNodeRuleProviderMembersInjector) {
    return new ThirdPartyEmailNodeRuleProvider_Factory(
        thirdPartyEmailNodeRuleProviderMembersInjector);
  }
}
