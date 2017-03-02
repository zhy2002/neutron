package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyRegistrationStateNodeRuleProvider_Factory
    implements Factory<CompanyRegistrationStateNodeRuleProvider> {
  private final MembersInjector<CompanyRegistrationStateNodeRuleProvider>
      companyRegistrationStateNodeRuleProviderMembersInjector;

  public CompanyRegistrationStateNodeRuleProvider_Factory(
      MembersInjector<CompanyRegistrationStateNodeRuleProvider>
          companyRegistrationStateNodeRuleProviderMembersInjector) {
    assert companyRegistrationStateNodeRuleProviderMembersInjector != null;
    this.companyRegistrationStateNodeRuleProviderMembersInjector =
        companyRegistrationStateNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyRegistrationStateNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyRegistrationStateNodeRuleProviderMembersInjector,
        new CompanyRegistrationStateNodeRuleProvider());
  }

  public static Factory<CompanyRegistrationStateNodeRuleProvider> create(
      MembersInjector<CompanyRegistrationStateNodeRuleProvider>
          companyRegistrationStateNodeRuleProviderMembersInjector) {
    return new CompanyRegistrationStateNodeRuleProvider_Factory(
        companyRegistrationStateNodeRuleProviderMembersInjector);
  }
}
