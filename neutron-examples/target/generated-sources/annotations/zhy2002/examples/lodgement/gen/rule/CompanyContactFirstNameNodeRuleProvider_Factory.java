package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyContactFirstNameNodeRuleProvider_Factory
    implements Factory<CompanyContactFirstNameNodeRuleProvider> {
  private final MembersInjector<CompanyContactFirstNameNodeRuleProvider>
      companyContactFirstNameNodeRuleProviderMembersInjector;

  public CompanyContactFirstNameNodeRuleProvider_Factory(
      MembersInjector<CompanyContactFirstNameNodeRuleProvider>
          companyContactFirstNameNodeRuleProviderMembersInjector) {
    assert companyContactFirstNameNodeRuleProviderMembersInjector != null;
    this.companyContactFirstNameNodeRuleProviderMembersInjector =
        companyContactFirstNameNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyContactFirstNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyContactFirstNameNodeRuleProviderMembersInjector,
        new CompanyContactFirstNameNodeRuleProvider());
  }

  public static Factory<CompanyContactFirstNameNodeRuleProvider> create(
      MembersInjector<CompanyContactFirstNameNodeRuleProvider>
          companyContactFirstNameNodeRuleProviderMembersInjector) {
    return new CompanyContactFirstNameNodeRuleProvider_Factory(
        companyContactFirstNameNodeRuleProviderMembersInjector);
  }
}
