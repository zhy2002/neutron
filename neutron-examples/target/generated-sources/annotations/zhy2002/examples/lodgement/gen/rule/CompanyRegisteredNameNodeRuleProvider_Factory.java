package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyRegisteredNameNodeRuleProvider_Factory
    implements Factory<CompanyRegisteredNameNodeRuleProvider> {
  private final MembersInjector<CompanyRegisteredNameNodeRuleProvider>
      companyRegisteredNameNodeRuleProviderMembersInjector;

  public CompanyRegisteredNameNodeRuleProvider_Factory(
      MembersInjector<CompanyRegisteredNameNodeRuleProvider>
          companyRegisteredNameNodeRuleProviderMembersInjector) {
    assert companyRegisteredNameNodeRuleProviderMembersInjector != null;
    this.companyRegisteredNameNodeRuleProviderMembersInjector =
        companyRegisteredNameNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyRegisteredNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyRegisteredNameNodeRuleProviderMembersInjector,
        new CompanyRegisteredNameNodeRuleProvider());
  }

  public static Factory<CompanyRegisteredNameNodeRuleProvider> create(
      MembersInjector<CompanyRegisteredNameNodeRuleProvider>
          companyRegisteredNameNodeRuleProviderMembersInjector) {
    return new CompanyRegisteredNameNodeRuleProvider_Factory(
        companyRegisteredNameNodeRuleProviderMembersInjector);
  }
}
