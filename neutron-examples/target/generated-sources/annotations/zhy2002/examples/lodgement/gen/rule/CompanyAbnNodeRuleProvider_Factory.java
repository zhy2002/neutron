package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyAbnNodeRuleProvider_Factory
    implements Factory<CompanyAbnNodeRuleProvider> {
  private final MembersInjector<CompanyAbnNodeRuleProvider>
      companyAbnNodeRuleProviderMembersInjector;

  public CompanyAbnNodeRuleProvider_Factory(
      MembersInjector<CompanyAbnNodeRuleProvider> companyAbnNodeRuleProviderMembersInjector) {
    assert companyAbnNodeRuleProviderMembersInjector != null;
    this.companyAbnNodeRuleProviderMembersInjector = companyAbnNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyAbnNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyAbnNodeRuleProviderMembersInjector, new CompanyAbnNodeRuleProvider());
  }

  public static Factory<CompanyAbnNodeRuleProvider> create(
      MembersInjector<CompanyAbnNodeRuleProvider> companyAbnNodeRuleProviderMembersInjector) {
    return new CompanyAbnNodeRuleProvider_Factory(companyAbnNodeRuleProviderMembersInjector);
  }
}
