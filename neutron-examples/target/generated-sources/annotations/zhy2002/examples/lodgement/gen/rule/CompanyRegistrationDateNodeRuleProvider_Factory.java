package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyRegistrationDateNodeRuleProvider_Factory
    implements Factory<CompanyRegistrationDateNodeRuleProvider> {
  private final MembersInjector<CompanyRegistrationDateNodeRuleProvider>
      companyRegistrationDateNodeRuleProviderMembersInjector;

  public CompanyRegistrationDateNodeRuleProvider_Factory(
      MembersInjector<CompanyRegistrationDateNodeRuleProvider>
          companyRegistrationDateNodeRuleProviderMembersInjector) {
    assert companyRegistrationDateNodeRuleProviderMembersInjector != null;
    this.companyRegistrationDateNodeRuleProviderMembersInjector =
        companyRegistrationDateNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyRegistrationDateNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyRegistrationDateNodeRuleProviderMembersInjector,
        new CompanyRegistrationDateNodeRuleProvider());
  }

  public static Factory<CompanyRegistrationDateNodeRuleProvider> create(
      MembersInjector<CompanyRegistrationDateNodeRuleProvider>
          companyRegistrationDateNodeRuleProviderMembersInjector) {
    return new CompanyRegistrationDateNodeRuleProvider_Factory(
        companyRegistrationDateNodeRuleProviderMembersInjector);
  }
}
