package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsInstitutionNameNodeRuleProvider_Factory
    implements Factory<SavingsInstitutionNameNodeRuleProvider> {
  private final MembersInjector<SavingsInstitutionNameNodeRuleProvider>
      savingsInstitutionNameNodeRuleProviderMembersInjector;

  public SavingsInstitutionNameNodeRuleProvider_Factory(
      MembersInjector<SavingsInstitutionNameNodeRuleProvider>
          savingsInstitutionNameNodeRuleProviderMembersInjector) {
    assert savingsInstitutionNameNodeRuleProviderMembersInjector != null;
    this.savingsInstitutionNameNodeRuleProviderMembersInjector =
        savingsInstitutionNameNodeRuleProviderMembersInjector;
  }

  @Override
  public SavingsInstitutionNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        savingsInstitutionNameNodeRuleProviderMembersInjector,
        new SavingsInstitutionNameNodeRuleProvider());
  }

  public static Factory<SavingsInstitutionNameNodeRuleProvider> create(
      MembersInjector<SavingsInstitutionNameNodeRuleProvider>
          savingsInstitutionNameNodeRuleProviderMembersInjector) {
    return new SavingsInstitutionNameNodeRuleProvider_Factory(
        savingsInstitutionNameNodeRuleProviderMembersInjector);
  }
}
