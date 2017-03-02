package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsBalanceNodeRuleProvider_Factory
    implements Factory<SavingsBalanceNodeRuleProvider> {
  private final MembersInjector<SavingsBalanceNodeRuleProvider>
      savingsBalanceNodeRuleProviderMembersInjector;

  public SavingsBalanceNodeRuleProvider_Factory(
      MembersInjector<SavingsBalanceNodeRuleProvider>
          savingsBalanceNodeRuleProviderMembersInjector) {
    assert savingsBalanceNodeRuleProviderMembersInjector != null;
    this.savingsBalanceNodeRuleProviderMembersInjector =
        savingsBalanceNodeRuleProviderMembersInjector;
  }

  @Override
  public SavingsBalanceNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        savingsBalanceNodeRuleProviderMembersInjector, new SavingsBalanceNodeRuleProvider());
  }

  public static Factory<SavingsBalanceNodeRuleProvider> create(
      MembersInjector<SavingsBalanceNodeRuleProvider>
          savingsBalanceNodeRuleProviderMembersInjector) {
    return new SavingsBalanceNodeRuleProvider_Factory(
        savingsBalanceNodeRuleProviderMembersInjector);
  }
}
