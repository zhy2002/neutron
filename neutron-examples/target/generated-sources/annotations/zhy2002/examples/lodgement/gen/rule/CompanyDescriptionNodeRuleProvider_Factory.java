package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyDescriptionNodeRuleProvider_Factory
    implements Factory<CompanyDescriptionNodeRuleProvider> {
  private final MembersInjector<CompanyDescriptionNodeRuleProvider>
      companyDescriptionNodeRuleProviderMembersInjector;

  public CompanyDescriptionNodeRuleProvider_Factory(
      MembersInjector<CompanyDescriptionNodeRuleProvider>
          companyDescriptionNodeRuleProviderMembersInjector) {
    assert companyDescriptionNodeRuleProviderMembersInjector != null;
    this.companyDescriptionNodeRuleProviderMembersInjector =
        companyDescriptionNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyDescriptionNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyDescriptionNodeRuleProviderMembersInjector,
        new CompanyDescriptionNodeRuleProvider());
  }

  public static Factory<CompanyDescriptionNodeRuleProvider> create(
      MembersInjector<CompanyDescriptionNodeRuleProvider>
          companyDescriptionNodeRuleProviderMembersInjector) {
    return new CompanyDescriptionNodeRuleProvider_Factory(
        companyDescriptionNodeRuleProviderMembersInjector);
  }
}
