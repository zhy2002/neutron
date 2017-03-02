package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseTypeNodeRuleProvider_Factory
    implements Factory<ExpenseTypeNodeRuleProvider> {
  private final MembersInjector<ExpenseTypeNodeRuleProvider>
      expenseTypeNodeRuleProviderMembersInjector;

  public ExpenseTypeNodeRuleProvider_Factory(
      MembersInjector<ExpenseTypeNodeRuleProvider> expenseTypeNodeRuleProviderMembersInjector) {
    assert expenseTypeNodeRuleProviderMembersInjector != null;
    this.expenseTypeNodeRuleProviderMembersInjector = expenseTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public ExpenseTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        expenseTypeNodeRuleProviderMembersInjector, new ExpenseTypeNodeRuleProvider());
  }

  public static Factory<ExpenseTypeNodeRuleProvider> create(
      MembersInjector<ExpenseTypeNodeRuleProvider> expenseTypeNodeRuleProviderMembersInjector) {
    return new ExpenseTypeNodeRuleProvider_Factory(expenseTypeNodeRuleProviderMembersInjector);
  }
}
