package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyTrustNodeRuleProvider_Factory
    implements Factory<CompanyTrustNodeRuleProvider> {
  private final MembersInjector<CompanyTrustNodeRuleProvider>
      companyTrustNodeRuleProviderMembersInjector;

  public CompanyTrustNodeRuleProvider_Factory(
      MembersInjector<CompanyTrustNodeRuleProvider> companyTrustNodeRuleProviderMembersInjector) {
    assert companyTrustNodeRuleProviderMembersInjector != null;
    this.companyTrustNodeRuleProviderMembersInjector = companyTrustNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyTrustNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyTrustNodeRuleProviderMembersInjector, new CompanyTrustNodeRuleProvider());
  }

  public static Factory<CompanyTrustNodeRuleProvider> create(
      MembersInjector<CompanyTrustNodeRuleProvider> companyTrustNodeRuleProviderMembersInjector) {
    return new CompanyTrustNodeRuleProvider_Factory(companyTrustNodeRuleProviderMembersInjector);
  }
}
