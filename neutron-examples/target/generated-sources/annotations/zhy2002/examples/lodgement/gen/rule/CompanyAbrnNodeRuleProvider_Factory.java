package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyAbrnNodeRuleProvider_Factory
    implements Factory<CompanyAbrnNodeRuleProvider> {
  private final MembersInjector<CompanyAbrnNodeRuleProvider>
      companyAbrnNodeRuleProviderMembersInjector;

  public CompanyAbrnNodeRuleProvider_Factory(
      MembersInjector<CompanyAbrnNodeRuleProvider> companyAbrnNodeRuleProviderMembersInjector) {
    assert companyAbrnNodeRuleProviderMembersInjector != null;
    this.companyAbrnNodeRuleProviderMembersInjector = companyAbrnNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyAbrnNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyAbrnNodeRuleProviderMembersInjector, new CompanyAbrnNodeRuleProvider());
  }

  public static Factory<CompanyAbrnNodeRuleProvider> create(
      MembersInjector<CompanyAbrnNodeRuleProvider> companyAbrnNodeRuleProviderMembersInjector) {
    return new CompanyAbrnNodeRuleProvider_Factory(companyAbrnNodeRuleProviderMembersInjector);
  }
}
