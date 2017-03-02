package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustIndustryNodeRuleProvider_Factory
    implements Factory<TrustIndustryNodeRuleProvider> {
  private final MembersInjector<TrustIndustryNodeRuleProvider>
      trustIndustryNodeRuleProviderMembersInjector;

  public TrustIndustryNodeRuleProvider_Factory(
      MembersInjector<TrustIndustryNodeRuleProvider> trustIndustryNodeRuleProviderMembersInjector) {
    assert trustIndustryNodeRuleProviderMembersInjector != null;
    this.trustIndustryNodeRuleProviderMembersInjector =
        trustIndustryNodeRuleProviderMembersInjector;
  }

  @Override
  public TrustIndustryNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        trustIndustryNodeRuleProviderMembersInjector, new TrustIndustryNodeRuleProvider());
  }

  public static Factory<TrustIndustryNodeRuleProvider> create(
      MembersInjector<TrustIndustryNodeRuleProvider> trustIndustryNodeRuleProviderMembersInjector) {
    return new TrustIndustryNodeRuleProvider_Factory(trustIndustryNodeRuleProviderMembersInjector);
  }
}
