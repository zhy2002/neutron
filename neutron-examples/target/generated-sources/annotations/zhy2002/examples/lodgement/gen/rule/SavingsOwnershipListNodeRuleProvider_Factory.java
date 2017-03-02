package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsOwnershipListNodeRuleProvider_Factory
    implements Factory<SavingsOwnershipListNodeRuleProvider> {
  private final MembersInjector<SavingsOwnershipListNodeRuleProvider>
      savingsOwnershipListNodeRuleProviderMembersInjector;

  public SavingsOwnershipListNodeRuleProvider_Factory(
      MembersInjector<SavingsOwnershipListNodeRuleProvider>
          savingsOwnershipListNodeRuleProviderMembersInjector) {
    assert savingsOwnershipListNodeRuleProviderMembersInjector != null;
    this.savingsOwnershipListNodeRuleProviderMembersInjector =
        savingsOwnershipListNodeRuleProviderMembersInjector;
  }

  @Override
  public SavingsOwnershipListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        savingsOwnershipListNodeRuleProviderMembersInjector,
        new SavingsOwnershipListNodeRuleProvider());
  }

  public static Factory<SavingsOwnershipListNodeRuleProvider> create(
      MembersInjector<SavingsOwnershipListNodeRuleProvider>
          savingsOwnershipListNodeRuleProviderMembersInjector) {
    return new SavingsOwnershipListNodeRuleProvider_Factory(
        savingsOwnershipListNodeRuleProviderMembersInjector);
  }
}
