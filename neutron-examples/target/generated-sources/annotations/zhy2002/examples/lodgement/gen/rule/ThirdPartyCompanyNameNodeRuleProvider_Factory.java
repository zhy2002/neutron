package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyCompanyNameNodeRuleProvider_Factory
    implements Factory<ThirdPartyCompanyNameNodeRuleProvider> {
  private final MembersInjector<ThirdPartyCompanyNameNodeRuleProvider>
      thirdPartyCompanyNameNodeRuleProviderMembersInjector;

  public ThirdPartyCompanyNameNodeRuleProvider_Factory(
      MembersInjector<ThirdPartyCompanyNameNodeRuleProvider>
          thirdPartyCompanyNameNodeRuleProviderMembersInjector) {
    assert thirdPartyCompanyNameNodeRuleProviderMembersInjector != null;
    this.thirdPartyCompanyNameNodeRuleProviderMembersInjector =
        thirdPartyCompanyNameNodeRuleProviderMembersInjector;
  }

  @Override
  public ThirdPartyCompanyNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        thirdPartyCompanyNameNodeRuleProviderMembersInjector,
        new ThirdPartyCompanyNameNodeRuleProvider());
  }

  public static Factory<ThirdPartyCompanyNameNodeRuleProvider> create(
      MembersInjector<ThirdPartyCompanyNameNodeRuleProvider>
          thirdPartyCompanyNameNodeRuleProviderMembersInjector) {
    return new ThirdPartyCompanyNameNodeRuleProvider_Factory(
        thirdPartyCompanyNameNodeRuleProviderMembersInjector);
  }
}
