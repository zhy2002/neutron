package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseListNodeRuleProvider_Factory
    implements Factory<ExpenseListNodeRuleProvider> {
  private final MembersInjector<ExpenseListNodeRuleProvider>
      expenseListNodeRuleProviderMembersInjector;

  public ExpenseListNodeRuleProvider_Factory(
      MembersInjector<ExpenseListNodeRuleProvider> expenseListNodeRuleProviderMembersInjector) {
    assert expenseListNodeRuleProviderMembersInjector != null;
    this.expenseListNodeRuleProviderMembersInjector = expenseListNodeRuleProviderMembersInjector;
  }

  @Override
  public ExpenseListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        expenseListNodeRuleProviderMembersInjector, new ExpenseListNodeRuleProvider());
  }

  public static Factory<ExpenseListNodeRuleProvider> create(
      MembersInjector<ExpenseListNodeRuleProvider> expenseListNodeRuleProviderMembersInjector) {
    return new ExpenseListNodeRuleProvider_Factory(expenseListNodeRuleProviderMembersInjector);
  }
}
