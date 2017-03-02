package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyAcnNodeRuleProvider_Factory
    implements Factory<CompanyAcnNodeRuleProvider> {
  private final MembersInjector<CompanyAcnNodeRuleProvider>
      companyAcnNodeRuleProviderMembersInjector;

  public CompanyAcnNodeRuleProvider_Factory(
      MembersInjector<CompanyAcnNodeRuleProvider> companyAcnNodeRuleProviderMembersInjector) {
    assert companyAcnNodeRuleProviderMembersInjector != null;
    this.companyAcnNodeRuleProviderMembersInjector = companyAcnNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyAcnNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyAcnNodeRuleProviderMembersInjector, new CompanyAcnNodeRuleProvider());
  }

  public static Factory<CompanyAcnNodeRuleProvider> create(
      MembersInjector<CompanyAcnNodeRuleProvider> companyAcnNodeRuleProviderMembersInjector) {
    return new CompanyAcnNodeRuleProvider_Factory(companyAcnNodeRuleProviderMembersInjector);
  }
}
