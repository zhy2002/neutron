package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountNameNodeRuleProvider_Factory
    implements Factory<SavingsAccountNameNodeRuleProvider> {
  private final MembersInjector<SavingsAccountNameNodeRuleProvider>
      savingsAccountNameNodeRuleProviderMembersInjector;

  public SavingsAccountNameNodeRuleProvider_Factory(
      MembersInjector<SavingsAccountNameNodeRuleProvider>
          savingsAccountNameNodeRuleProviderMembersInjector) {
    assert savingsAccountNameNodeRuleProviderMembersInjector != null;
    this.savingsAccountNameNodeRuleProviderMembersInjector =
        savingsAccountNameNodeRuleProviderMembersInjector;
  }

  @Override
  public SavingsAccountNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        savingsAccountNameNodeRuleProviderMembersInjector,
        new SavingsAccountNameNodeRuleProvider());
  }

  public static Factory<SavingsAccountNameNodeRuleProvider> create(
      MembersInjector<SavingsAccountNameNodeRuleProvider>
          savingsAccountNameNodeRuleProviderMembersInjector) {
    return new SavingsAccountNameNodeRuleProvider_Factory(
        savingsAccountNameNodeRuleProviderMembersInjector);
  }
}
