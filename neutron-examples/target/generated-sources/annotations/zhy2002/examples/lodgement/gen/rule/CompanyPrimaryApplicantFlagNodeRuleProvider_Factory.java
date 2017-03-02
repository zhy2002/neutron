package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyPrimaryApplicantFlagNodeRuleProvider_Factory
    implements Factory<CompanyPrimaryApplicantFlagNodeRuleProvider> {
  private final MembersInjector<CompanyPrimaryApplicantFlagNodeRuleProvider>
      companyPrimaryApplicantFlagNodeRuleProviderMembersInjector;

  public CompanyPrimaryApplicantFlagNodeRuleProvider_Factory(
      MembersInjector<CompanyPrimaryApplicantFlagNodeRuleProvider>
          companyPrimaryApplicantFlagNodeRuleProviderMembersInjector) {
    assert companyPrimaryApplicantFlagNodeRuleProviderMembersInjector != null;
    this.companyPrimaryApplicantFlagNodeRuleProviderMembersInjector =
        companyPrimaryApplicantFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyPrimaryApplicantFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyPrimaryApplicantFlagNodeRuleProviderMembersInjector,
        new CompanyPrimaryApplicantFlagNodeRuleProvider());
  }

  public static Factory<CompanyPrimaryApplicantFlagNodeRuleProvider> create(
      MembersInjector<CompanyPrimaryApplicantFlagNodeRuleProvider>
          companyPrimaryApplicantFlagNodeRuleProviderMembersInjector) {
    return new CompanyPrimaryApplicantFlagNodeRuleProvider_Factory(
        companyPrimaryApplicantFlagNodeRuleProviderMembersInjector);
  }
}
