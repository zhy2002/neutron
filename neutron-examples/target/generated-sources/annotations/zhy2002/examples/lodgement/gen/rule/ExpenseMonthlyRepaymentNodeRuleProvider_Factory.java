package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseMonthlyRepaymentNodeRuleProvider_Factory
    implements Factory<ExpenseMonthlyRepaymentNodeRuleProvider> {
  private final MembersInjector<ExpenseMonthlyRepaymentNodeRuleProvider>
      expenseMonthlyRepaymentNodeRuleProviderMembersInjector;

  public ExpenseMonthlyRepaymentNodeRuleProvider_Factory(
      MembersInjector<ExpenseMonthlyRepaymentNodeRuleProvider>
          expenseMonthlyRepaymentNodeRuleProviderMembersInjector) {
    assert expenseMonthlyRepaymentNodeRuleProviderMembersInjector != null;
    this.expenseMonthlyRepaymentNodeRuleProviderMembersInjector =
        expenseMonthlyRepaymentNodeRuleProviderMembersInjector;
  }

  @Override
  public ExpenseMonthlyRepaymentNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        expenseMonthlyRepaymentNodeRuleProviderMembersInjector,
        new ExpenseMonthlyRepaymentNodeRuleProvider());
  }

  public static Factory<ExpenseMonthlyRepaymentNodeRuleProvider> create(
      MembersInjector<ExpenseMonthlyRepaymentNodeRuleProvider>
          expenseMonthlyRepaymentNodeRuleProviderMembersInjector) {
    return new ExpenseMonthlyRepaymentNodeRuleProvider_Factory(
        expenseMonthlyRepaymentNodeRuleProviderMembersInjector);
  }
}
