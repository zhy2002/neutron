package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseNodeChildProvider_MembersInjector
    implements MembersInjector<ExpenseNodeChildProvider> {
  private final MembersInjector<ExpenseDescriptionNode>
      expenseDescriptionNodeInjectorMembersInjector;

  private final MembersInjector<ExpenseTypeNode> expenseTypeNodeInjectorMembersInjector;

  private final MembersInjector<ExpenseMonthlyRepaymentNode>
      expenseMonthlyRepaymentNodeInjectorMembersInjector;

  public ExpenseNodeChildProvider_MembersInjector(
      MembersInjector<ExpenseDescriptionNode> expenseDescriptionNodeInjectorMembersInjector,
      MembersInjector<ExpenseTypeNode> expenseTypeNodeInjectorMembersInjector,
      MembersInjector<ExpenseMonthlyRepaymentNode>
          expenseMonthlyRepaymentNodeInjectorMembersInjector) {
    assert expenseDescriptionNodeInjectorMembersInjector != null;
    this.expenseDescriptionNodeInjectorMembersInjector =
        expenseDescriptionNodeInjectorMembersInjector;
    assert expenseTypeNodeInjectorMembersInjector != null;
    this.expenseTypeNodeInjectorMembersInjector = expenseTypeNodeInjectorMembersInjector;
    assert expenseMonthlyRepaymentNodeInjectorMembersInjector != null;
    this.expenseMonthlyRepaymentNodeInjectorMembersInjector =
        expenseMonthlyRepaymentNodeInjectorMembersInjector;
  }

  public static MembersInjector<ExpenseNodeChildProvider> create(
      MembersInjector<ExpenseDescriptionNode> expenseDescriptionNodeInjectorMembersInjector,
      MembersInjector<ExpenseTypeNode> expenseTypeNodeInjectorMembersInjector,
      MembersInjector<ExpenseMonthlyRepaymentNode>
          expenseMonthlyRepaymentNodeInjectorMembersInjector) {
    return new ExpenseNodeChildProvider_MembersInjector(
        expenseDescriptionNodeInjectorMembersInjector,
        expenseTypeNodeInjectorMembersInjector,
        expenseMonthlyRepaymentNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(ExpenseNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.expenseDescriptionNodeInjector = expenseDescriptionNodeInjectorMembersInjector;
    instance.expenseTypeNodeInjector = expenseTypeNodeInjectorMembersInjector;
    instance.expenseMonthlyRepaymentNodeInjector =
        expenseMonthlyRepaymentNodeInjectorMembersInjector;
  }

  public static void injectExpenseDescriptionNodeInjector(
      ExpenseNodeChildProvider instance,
      MembersInjector<ExpenseDescriptionNode> expenseDescriptionNodeInjector) {
    instance.expenseDescriptionNodeInjector = expenseDescriptionNodeInjector;
  }

  public static void injectExpenseTypeNodeInjector(
      ExpenseNodeChildProvider instance, MembersInjector<ExpenseTypeNode> expenseTypeNodeInjector) {
    instance.expenseTypeNodeInjector = expenseTypeNodeInjector;
  }

  public static void injectExpenseMonthlyRepaymentNodeInjector(
      ExpenseNodeChildProvider instance,
      MembersInjector<ExpenseMonthlyRepaymentNode> expenseMonthlyRepaymentNodeInjector) {
    instance.expenseMonthlyRepaymentNodeInjector = expenseMonthlyRepaymentNodeInjector;
  }
}
