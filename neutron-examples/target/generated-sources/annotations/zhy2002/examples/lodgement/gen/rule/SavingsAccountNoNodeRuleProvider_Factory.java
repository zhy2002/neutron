package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountNoNodeRuleProvider_Factory
    implements Factory<SavingsAccountNoNodeRuleProvider> {
  private final MembersInjector<SavingsAccountNoNodeRuleProvider>
      savingsAccountNoNodeRuleProviderMembersInjector;

  public SavingsAccountNoNodeRuleProvider_Factory(
      MembersInjector<SavingsAccountNoNodeRuleProvider>
          savingsAccountNoNodeRuleProviderMembersInjector) {
    assert savingsAccountNoNodeRuleProviderMembersInjector != null;
    this.savingsAccountNoNodeRuleProviderMembersInjector =
        savingsAccountNoNodeRuleProviderMembersInjector;
  }

  @Override
  public SavingsAccountNoNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        savingsAccountNoNodeRuleProviderMembersInjector, new SavingsAccountNoNodeRuleProvider());
  }

  public static Factory<SavingsAccountNoNodeRuleProvider> create(
      MembersInjector<SavingsAccountNoNodeRuleProvider>
          savingsAccountNoNodeRuleProviderMembersInjector) {
    return new SavingsAccountNoNodeRuleProvider_Factory(
        savingsAccountNoNodeRuleProviderMembersInjector);
  }
}
