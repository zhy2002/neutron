package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyOtherIncomeListNodeRuleProvider_Factory
    implements Factory<CompanyOtherIncomeListNodeRuleProvider> {
  private final MembersInjector<CompanyOtherIncomeListNodeRuleProvider>
      companyOtherIncomeListNodeRuleProviderMembersInjector;

  public CompanyOtherIncomeListNodeRuleProvider_Factory(
      MembersInjector<CompanyOtherIncomeListNodeRuleProvider>
          companyOtherIncomeListNodeRuleProviderMembersInjector) {
    assert companyOtherIncomeListNodeRuleProviderMembersInjector != null;
    this.companyOtherIncomeListNodeRuleProviderMembersInjector =
        companyOtherIncomeListNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyOtherIncomeListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyOtherIncomeListNodeRuleProviderMembersInjector,
        new CompanyOtherIncomeListNodeRuleProvider());
  }

  public static Factory<CompanyOtherIncomeListNodeRuleProvider> create(
      MembersInjector<CompanyOtherIncomeListNodeRuleProvider>
          companyOtherIncomeListNodeRuleProviderMembersInjector) {
    return new CompanyOtherIncomeListNodeRuleProvider_Factory(
        companyOtherIncomeListNodeRuleProviderMembersInjector);
  }
}
