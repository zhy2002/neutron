package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyListNodeRuleProvider_Factory
    implements Factory<CompanyListNodeRuleProvider> {
  private final MembersInjector<CompanyListNodeRuleProvider>
      companyListNodeRuleProviderMembersInjector;

  public CompanyListNodeRuleProvider_Factory(
      MembersInjector<CompanyListNodeRuleProvider> companyListNodeRuleProviderMembersInjector) {
    assert companyListNodeRuleProviderMembersInjector != null;
    this.companyListNodeRuleProviderMembersInjector = companyListNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyListNodeRuleProviderMembersInjector, new CompanyListNodeRuleProvider());
  }

  public static Factory<CompanyListNodeRuleProvider> create(
      MembersInjector<CompanyListNodeRuleProvider> companyListNodeRuleProviderMembersInjector) {
    return new CompanyListNodeRuleProvider_Factory(companyListNodeRuleProviderMembersInjector);
  }
}
