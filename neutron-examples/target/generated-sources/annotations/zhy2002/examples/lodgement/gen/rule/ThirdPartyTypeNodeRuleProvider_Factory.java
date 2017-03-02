package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyTypeNodeRuleProvider_Factory
    implements Factory<ThirdPartyTypeNodeRuleProvider> {
  private final MembersInjector<ThirdPartyTypeNodeRuleProvider>
      thirdPartyTypeNodeRuleProviderMembersInjector;

  public ThirdPartyTypeNodeRuleProvider_Factory(
      MembersInjector<ThirdPartyTypeNodeRuleProvider>
          thirdPartyTypeNodeRuleProviderMembersInjector) {
    assert thirdPartyTypeNodeRuleProviderMembersInjector != null;
    this.thirdPartyTypeNodeRuleProviderMembersInjector =
        thirdPartyTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public ThirdPartyTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        thirdPartyTypeNodeRuleProviderMembersInjector, new ThirdPartyTypeNodeRuleProvider());
  }

  public static Factory<ThirdPartyTypeNodeRuleProvider> create(
      MembersInjector<ThirdPartyTypeNodeRuleProvider>
          thirdPartyTypeNodeRuleProviderMembersInjector) {
    return new ThirdPartyTypeNodeRuleProvider_Factory(
        thirdPartyTypeNodeRuleProviderMembersInjector);
  }
}
