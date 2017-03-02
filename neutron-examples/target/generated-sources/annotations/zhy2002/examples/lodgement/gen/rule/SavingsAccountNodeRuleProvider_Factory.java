package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountNodeRuleProvider_Factory
    implements Factory<SavingsAccountNodeRuleProvider> {
  private final MembersInjector<SavingsAccountNodeRuleProvider>
      savingsAccountNodeRuleProviderMembersInjector;

  public SavingsAccountNodeRuleProvider_Factory(
      MembersInjector<SavingsAccountNodeRuleProvider>
          savingsAccountNodeRuleProviderMembersInjector) {
    assert savingsAccountNodeRuleProviderMembersInjector != null;
    this.savingsAccountNodeRuleProviderMembersInjector =
        savingsAccountNodeRuleProviderMembersInjector;
  }

  @Override
  public SavingsAccountNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        savingsAccountNodeRuleProviderMembersInjector, new SavingsAccountNodeRuleProvider());
  }

  public static Factory<SavingsAccountNodeRuleProvider> create(
      MembersInjector<SavingsAccountNodeRuleProvider>
          savingsAccountNodeRuleProviderMembersInjector) {
    return new SavingsAccountNodeRuleProvider_Factory(
        savingsAccountNodeRuleProviderMembersInjector);
  }
}
