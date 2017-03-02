package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseNodeRuleProvider_Factory implements Factory<ExpenseNodeRuleProvider> {
  private final MembersInjector<ExpenseNodeRuleProvider> expenseNodeRuleProviderMembersInjector;

  public ExpenseNodeRuleProvider_Factory(
      MembersInjector<ExpenseNodeRuleProvider> expenseNodeRuleProviderMembersInjector) {
    assert expenseNodeRuleProviderMembersInjector != null;
    this.expenseNodeRuleProviderMembersInjector = expenseNodeRuleProviderMembersInjector;
  }

  @Override
  public ExpenseNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        expenseNodeRuleProviderMembersInjector, new ExpenseNodeRuleProvider());
  }

  public static Factory<ExpenseNodeRuleProvider> create(
      MembersInjector<ExpenseNodeRuleProvider> expenseNodeRuleProviderMembersInjector) {
    return new ExpenseNodeRuleProvider_Factory(expenseNodeRuleProviderMembersInjector);
  }
}
