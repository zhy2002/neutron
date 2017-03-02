package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyContactNodeRuleProvider_Factory
    implements Factory<CompanyContactNodeRuleProvider> {
  private final MembersInjector<CompanyContactNodeRuleProvider>
      companyContactNodeRuleProviderMembersInjector;

  public CompanyContactNodeRuleProvider_Factory(
      MembersInjector<CompanyContactNodeRuleProvider>
          companyContactNodeRuleProviderMembersInjector) {
    assert companyContactNodeRuleProviderMembersInjector != null;
    this.companyContactNodeRuleProviderMembersInjector =
        companyContactNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyContactNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyContactNodeRuleProviderMembersInjector, new CompanyContactNodeRuleProvider());
  }

  public static Factory<CompanyContactNodeRuleProvider> create(
      MembersInjector<CompanyContactNodeRuleProvider>
          companyContactNodeRuleProviderMembersInjector) {
    return new CompanyContactNodeRuleProvider_Factory(
        companyContactNodeRuleProviderMembersInjector);
  }
}
