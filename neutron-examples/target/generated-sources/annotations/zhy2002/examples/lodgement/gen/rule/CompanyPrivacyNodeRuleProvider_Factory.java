package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyPrivacyNodeRuleProvider_Factory
    implements Factory<CompanyPrivacyNodeRuleProvider> {
  private final MembersInjector<CompanyPrivacyNodeRuleProvider>
      companyPrivacyNodeRuleProviderMembersInjector;

  public CompanyPrivacyNodeRuleProvider_Factory(
      MembersInjector<CompanyPrivacyNodeRuleProvider>
          companyPrivacyNodeRuleProviderMembersInjector) {
    assert companyPrivacyNodeRuleProviderMembersInjector != null;
    this.companyPrivacyNodeRuleProviderMembersInjector =
        companyPrivacyNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyPrivacyNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyPrivacyNodeRuleProviderMembersInjector, new CompanyPrivacyNodeRuleProvider());
  }

  public static Factory<CompanyPrivacyNodeRuleProvider> create(
      MembersInjector<CompanyPrivacyNodeRuleProvider>
          companyPrivacyNodeRuleProviderMembersInjector) {
    return new CompanyPrivacyNodeRuleProvider_Factory(
        companyPrivacyNodeRuleProviderMembersInjector);
  }
}
