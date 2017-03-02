package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyApplicantTypeNodeRuleProvider_Factory
    implements Factory<CompanyApplicantTypeNodeRuleProvider> {
  private final MembersInjector<CompanyApplicantTypeNodeRuleProvider>
      companyApplicantTypeNodeRuleProviderMembersInjector;

  public CompanyApplicantTypeNodeRuleProvider_Factory(
      MembersInjector<CompanyApplicantTypeNodeRuleProvider>
          companyApplicantTypeNodeRuleProviderMembersInjector) {
    assert companyApplicantTypeNodeRuleProviderMembersInjector != null;
    this.companyApplicantTypeNodeRuleProviderMembersInjector =
        companyApplicantTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyApplicantTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyApplicantTypeNodeRuleProviderMembersInjector,
        new CompanyApplicantTypeNodeRuleProvider());
  }

  public static Factory<CompanyApplicantTypeNodeRuleProvider> create(
      MembersInjector<CompanyApplicantTypeNodeRuleProvider>
          companyApplicantTypeNodeRuleProviderMembersInjector) {
    return new CompanyApplicantTypeNodeRuleProvider_Factory(
        companyApplicantTypeNodeRuleProviderMembersInjector);
  }
}
