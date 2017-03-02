package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountListNodeRuleProvider_Factory
    implements Factory<SavingsAccountListNodeRuleProvider> {
  private final MembersInjector<SavingsAccountListNodeRuleProvider>
      savingsAccountListNodeRuleProviderMembersInjector;

  public SavingsAccountListNodeRuleProvider_Factory(
      MembersInjector<SavingsAccountListNodeRuleProvider>
          savingsAccountListNodeRuleProviderMembersInjector) {
    assert savingsAccountListNodeRuleProviderMembersInjector != null;
    this.savingsAccountListNodeRuleProviderMembersInjector =
        savingsAccountListNodeRuleProviderMembersInjector;
  }

  @Override
  public SavingsAccountListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        savingsAccountListNodeRuleProviderMembersInjector,
        new SavingsAccountListNodeRuleProvider());
  }

  public static Factory<SavingsAccountListNodeRuleProvider> create(
      MembersInjector<SavingsAccountListNodeRuleProvider>
          savingsAccountListNodeRuleProviderMembersInjector) {
    return new SavingsAccountListNodeRuleProvider_Factory(
        savingsAccountListNodeRuleProviderMembersInjector);
  }
}
