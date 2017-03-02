package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyResponsibleLendNodeRuleProvider_Factory
    implements Factory<CompanyResponsibleLendNodeRuleProvider> {
  private final MembersInjector<CompanyResponsibleLendNodeRuleProvider>
      companyResponsibleLendNodeRuleProviderMembersInjector;

  public CompanyResponsibleLendNodeRuleProvider_Factory(
      MembersInjector<CompanyResponsibleLendNodeRuleProvider>
          companyResponsibleLendNodeRuleProviderMembersInjector) {
    assert companyResponsibleLendNodeRuleProviderMembersInjector != null;
    this.companyResponsibleLendNodeRuleProviderMembersInjector =
        companyResponsibleLendNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyResponsibleLendNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyResponsibleLendNodeRuleProviderMembersInjector,
        new CompanyResponsibleLendNodeRuleProvider());
  }

  public static Factory<CompanyResponsibleLendNodeRuleProvider> create(
      MembersInjector<CompanyResponsibleLendNodeRuleProvider>
          companyResponsibleLendNodeRuleProviderMembersInjector) {
    return new CompanyResponsibleLendNodeRuleProvider_Factory(
        companyResponsibleLendNodeRuleProviderMembersInjector);
  }
}
