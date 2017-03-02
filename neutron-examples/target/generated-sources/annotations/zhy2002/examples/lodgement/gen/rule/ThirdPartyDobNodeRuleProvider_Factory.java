package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyDobNodeRuleProvider_Factory
    implements Factory<ThirdPartyDobNodeRuleProvider> {
  private final MembersInjector<ThirdPartyDobNodeRuleProvider>
      thirdPartyDobNodeRuleProviderMembersInjector;

  public ThirdPartyDobNodeRuleProvider_Factory(
      MembersInjector<ThirdPartyDobNodeRuleProvider> thirdPartyDobNodeRuleProviderMembersInjector) {
    assert thirdPartyDobNodeRuleProviderMembersInjector != null;
    this.thirdPartyDobNodeRuleProviderMembersInjector =
        thirdPartyDobNodeRuleProviderMembersInjector;
  }

  @Override
  public ThirdPartyDobNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        thirdPartyDobNodeRuleProviderMembersInjector, new ThirdPartyDobNodeRuleProvider());
  }

  public static Factory<ThirdPartyDobNodeRuleProvider> create(
      MembersInjector<ThirdPartyDobNodeRuleProvider> thirdPartyDobNodeRuleProviderMembersInjector) {
    return new ThirdPartyDobNodeRuleProvider_Factory(thirdPartyDobNodeRuleProviderMembersInjector);
  }
}
