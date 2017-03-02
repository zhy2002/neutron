package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyTitleNodeRuleProvider_Factory
    implements Factory<ThirdPartyTitleNodeRuleProvider> {
  private final MembersInjector<ThirdPartyTitleNodeRuleProvider>
      thirdPartyTitleNodeRuleProviderMembersInjector;

  public ThirdPartyTitleNodeRuleProvider_Factory(
      MembersInjector<ThirdPartyTitleNodeRuleProvider>
          thirdPartyTitleNodeRuleProviderMembersInjector) {
    assert thirdPartyTitleNodeRuleProviderMembersInjector != null;
    this.thirdPartyTitleNodeRuleProviderMembersInjector =
        thirdPartyTitleNodeRuleProviderMembersInjector;
  }

  @Override
  public ThirdPartyTitleNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        thirdPartyTitleNodeRuleProviderMembersInjector, new ThirdPartyTitleNodeRuleProvider());
  }

  public static Factory<ThirdPartyTitleNodeRuleProvider> create(
      MembersInjector<ThirdPartyTitleNodeRuleProvider>
          thirdPartyTitleNodeRuleProviderMembersInjector) {
    return new ThirdPartyTitleNodeRuleProvider_Factory(
        thirdPartyTitleNodeRuleProviderMembersInjector);
  }
}
