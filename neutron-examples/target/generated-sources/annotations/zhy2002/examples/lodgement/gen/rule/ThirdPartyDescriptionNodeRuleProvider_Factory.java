package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyDescriptionNodeRuleProvider_Factory
    implements Factory<ThirdPartyDescriptionNodeRuleProvider> {
  private final MembersInjector<ThirdPartyDescriptionNodeRuleProvider>
      thirdPartyDescriptionNodeRuleProviderMembersInjector;

  public ThirdPartyDescriptionNodeRuleProvider_Factory(
      MembersInjector<ThirdPartyDescriptionNodeRuleProvider>
          thirdPartyDescriptionNodeRuleProviderMembersInjector) {
    assert thirdPartyDescriptionNodeRuleProviderMembersInjector != null;
    this.thirdPartyDescriptionNodeRuleProviderMembersInjector =
        thirdPartyDescriptionNodeRuleProviderMembersInjector;
  }

  @Override
  public ThirdPartyDescriptionNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        thirdPartyDescriptionNodeRuleProviderMembersInjector,
        new ThirdPartyDescriptionNodeRuleProvider());
  }

  public static Factory<ThirdPartyDescriptionNodeRuleProvider> create(
      MembersInjector<ThirdPartyDescriptionNodeRuleProvider>
          thirdPartyDescriptionNodeRuleProviderMembersInjector) {
    return new ThirdPartyDescriptionNodeRuleProvider_Factory(
        thirdPartyDescriptionNodeRuleProviderMembersInjector);
  }
}
