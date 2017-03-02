package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanySelectDirectorNodeRuleProvider_Factory
    implements Factory<CompanySelectDirectorNodeRuleProvider> {
  private final MembersInjector<CompanySelectDirectorNodeRuleProvider>
      companySelectDirectorNodeRuleProviderMembersInjector;

  public CompanySelectDirectorNodeRuleProvider_Factory(
      MembersInjector<CompanySelectDirectorNodeRuleProvider>
          companySelectDirectorNodeRuleProviderMembersInjector) {
    assert companySelectDirectorNodeRuleProviderMembersInjector != null;
    this.companySelectDirectorNodeRuleProviderMembersInjector =
        companySelectDirectorNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanySelectDirectorNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companySelectDirectorNodeRuleProviderMembersInjector,
        new CompanySelectDirectorNodeRuleProvider());
  }

  public static Factory<CompanySelectDirectorNodeRuleProvider> create(
      MembersInjector<CompanySelectDirectorNodeRuleProvider>
          companySelectDirectorNodeRuleProviderMembersInjector) {
    return new CompanySelectDirectorNodeRuleProvider_Factory(
        companySelectDirectorNodeRuleProviderMembersInjector);
  }
}
