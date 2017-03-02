package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyGeneralNodeRuleProvider_Factory
    implements Factory<CompanyGeneralNodeRuleProvider> {
  private final MembersInjector<CompanyGeneralNodeRuleProvider>
      companyGeneralNodeRuleProviderMembersInjector;

  public CompanyGeneralNodeRuleProvider_Factory(
      MembersInjector<CompanyGeneralNodeRuleProvider>
          companyGeneralNodeRuleProviderMembersInjector) {
    assert companyGeneralNodeRuleProviderMembersInjector != null;
    this.companyGeneralNodeRuleProviderMembersInjector =
        companyGeneralNodeRuleProviderMembersInjector;
  }

  @Override
  public CompanyGeneralNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        companyGeneralNodeRuleProviderMembersInjector, new CompanyGeneralNodeRuleProvider());
  }

  public static Factory<CompanyGeneralNodeRuleProvider> create(
      MembersInjector<CompanyGeneralNodeRuleProvider>
          companyGeneralNodeRuleProviderMembersInjector) {
    return new CompanyGeneralNodeRuleProvider_Factory(
        companyGeneralNodeRuleProviderMembersInjector);
  }
}
