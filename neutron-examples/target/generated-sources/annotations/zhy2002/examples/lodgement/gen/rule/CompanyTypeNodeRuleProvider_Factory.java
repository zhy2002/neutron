package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyTypeNodeRuleProvider_Factory
    implements Factory<CompanyTypeNodeRuleProvider> {
  private final MembersInjector<CompanyTypeNodeRuleProvider>
      companyTypeNodeRuleProviderMembersInjector;

  public CompanyTypeNodeRuleProvider_Factory(
      MembersInjector<CompanyTypeNodeRuleProvider> companyTypeNodeRuleProviderMembersInjector) {
    assert companyTypeNodeRuleProviderMembersInjector != null;
    this.companyTypeNodeRuleProviderMembersInjector = companyTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyTypeNodeRuleProviderMembersInjector, new CompanyTypeNodeRuleProvider());
  }

  public static Factory<CompanyTypeNodeRuleProvider> create(
      MembersInjector<CompanyTypeNodeRuleProvider> companyTypeNodeRuleProviderMembersInjector) {
    return new CompanyTypeNodeRuleProvider_Factory(companyTypeNodeRuleProviderMembersInjector);
  }
}
