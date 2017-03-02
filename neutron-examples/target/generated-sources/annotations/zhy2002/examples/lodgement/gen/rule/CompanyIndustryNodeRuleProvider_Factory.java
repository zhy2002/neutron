package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyIndustryNodeRuleProvider_Factory
    implements Factory<CompanyIndustryNodeRuleProvider> {
  private final MembersInjector<CompanyIndustryNodeRuleProvider>
      companyIndustryNodeRuleProviderMembersInjector;

  public CompanyIndustryNodeRuleProvider_Factory(
      MembersInjector<CompanyIndustryNodeRuleProvider>
          companyIndustryNodeRuleProviderMembersInjector) {
    assert companyIndustryNodeRuleProviderMembersInjector != null;
    this.companyIndustryNodeRuleProviderMembersInjector =
        companyIndustryNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyIndustryNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyIndustryNodeRuleProviderMembersInjector, new CompanyIndustryNodeRuleProvider());
  }

  public static Factory<CompanyIndustryNodeRuleProvider> create(
      MembersInjector<CompanyIndustryNodeRuleProvider>
          companyIndustryNodeRuleProviderMembersInjector) {
    return new CompanyIndustryNodeRuleProvider_Factory(
        companyIndustryNodeRuleProviderMembersInjector);
  }
}
