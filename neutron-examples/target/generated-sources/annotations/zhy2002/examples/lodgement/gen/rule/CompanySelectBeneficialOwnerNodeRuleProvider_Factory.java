package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanySelectBeneficialOwnerNodeRuleProvider_Factory
    implements Factory<CompanySelectBeneficialOwnerNodeRuleProvider> {
  private final MembersInjector<CompanySelectBeneficialOwnerNodeRuleProvider>
      companySelectBeneficialOwnerNodeRuleProviderMembersInjector;

  public CompanySelectBeneficialOwnerNodeRuleProvider_Factory(
      MembersInjector<CompanySelectBeneficialOwnerNodeRuleProvider>
          companySelectBeneficialOwnerNodeRuleProviderMembersInjector) {
    assert companySelectBeneficialOwnerNodeRuleProviderMembersInjector != null;
    this.companySelectBeneficialOwnerNodeRuleProviderMembersInjector =
        companySelectBeneficialOwnerNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanySelectBeneficialOwnerNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companySelectBeneficialOwnerNodeRuleProviderMembersInjector,
        new CompanySelectBeneficialOwnerNodeRuleProvider());
  }

  public static Factory<CompanySelectBeneficialOwnerNodeRuleProvider> create(
      MembersInjector<CompanySelectBeneficialOwnerNodeRuleProvider>
          companySelectBeneficialOwnerNodeRuleProviderMembersInjector) {
    return new CompanySelectBeneficialOwnerNodeRuleProvider_Factory(
        companySelectBeneficialOwnerNodeRuleProviderMembersInjector);
  }
}
