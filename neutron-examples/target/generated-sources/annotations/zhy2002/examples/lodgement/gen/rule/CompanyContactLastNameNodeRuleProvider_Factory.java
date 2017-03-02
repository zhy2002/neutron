package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyContactLastNameNodeRuleProvider_Factory
    implements Factory<CompanyContactLastNameNodeRuleProvider> {
  private final MembersInjector<CompanyContactLastNameNodeRuleProvider>
      companyContactLastNameNodeRuleProviderMembersInjector;

  public CompanyContactLastNameNodeRuleProvider_Factory(
      MembersInjector<CompanyContactLastNameNodeRuleProvider>
          companyContactLastNameNodeRuleProviderMembersInjector) {
    assert companyContactLastNameNodeRuleProviderMembersInjector != null;
    this.companyContactLastNameNodeRuleProviderMembersInjector =
        companyContactLastNameNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyContactLastNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyContactLastNameNodeRuleProviderMembersInjector,
        new CompanyContactLastNameNodeRuleProvider());
  }

  public static Factory<CompanyContactLastNameNodeRuleProvider> create(
      MembersInjector<CompanyContactLastNameNodeRuleProvider>
          companyContactLastNameNodeRuleProviderMembersInjector) {
    return new CompanyContactLastNameNodeRuleProvider_Factory(
        companyContactLastNameNodeRuleProviderMembersInjector);
  }
}
