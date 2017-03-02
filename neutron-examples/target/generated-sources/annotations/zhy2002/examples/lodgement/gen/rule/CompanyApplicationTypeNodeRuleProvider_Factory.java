package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyApplicationTypeNodeRuleProvider_Factory
    implements Factory<CompanyApplicationTypeNodeRuleProvider> {
  private final MembersInjector<CompanyApplicationTypeNodeRuleProvider>
      companyApplicationTypeNodeRuleProviderMembersInjector;

  public CompanyApplicationTypeNodeRuleProvider_Factory(
      MembersInjector<CompanyApplicationTypeNodeRuleProvider>
          companyApplicationTypeNodeRuleProviderMembersInjector) {
    assert companyApplicationTypeNodeRuleProviderMembersInjector != null;
    this.companyApplicationTypeNodeRuleProviderMembersInjector =
        companyApplicationTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyApplicationTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyApplicationTypeNodeRuleProviderMembersInjector,
        new CompanyApplicationTypeNodeRuleProvider());
  }

  public static Factory<CompanyApplicationTypeNodeRuleProvider> create(
      MembersInjector<CompanyApplicationTypeNodeRuleProvider>
          companyApplicationTypeNodeRuleProviderMembersInjector) {
    return new CompanyApplicationTypeNodeRuleProvider_Factory(
        companyApplicationTypeNodeRuleProviderMembersInjector);
  }
}
