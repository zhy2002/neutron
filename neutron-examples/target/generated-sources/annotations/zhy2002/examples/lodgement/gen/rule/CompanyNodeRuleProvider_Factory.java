package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyNodeRuleProvider_Factory implements Factory<CompanyNodeRuleProvider> {
  private final MembersInjector<CompanyNodeRuleProvider> companyNodeRuleProviderMembersInjector;

  public CompanyNodeRuleProvider_Factory(
      MembersInjector<CompanyNodeRuleProvider> companyNodeRuleProviderMembersInjector) {
    assert companyNodeRuleProviderMembersInjector != null;
    this.companyNodeRuleProviderMembersInjector = companyNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyNodeRuleProviderMembersInjector, new CompanyNodeRuleProvider());
  }

  public static Factory<CompanyNodeRuleProvider> create(
      MembersInjector<CompanyNodeRuleProvider> companyNodeRuleProviderMembersInjector) {
    return new CompanyNodeRuleProvider_Factory(companyNodeRuleProviderMembersInjector);
  }
}
