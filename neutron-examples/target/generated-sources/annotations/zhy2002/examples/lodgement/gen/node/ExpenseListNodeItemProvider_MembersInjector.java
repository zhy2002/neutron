package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseListNodeItemProvider_MembersInjector
    implements MembersInjector<ExpenseListNodeItemProvider> {
  private final MembersInjector<ExpenseNode> expenseNodeInjectorMembersInjector;

  public ExpenseListNodeItemProvider_MembersInjector(
      MembersInjector<ExpenseNode> expenseNodeInjectorMembersInjector) {
    assert expenseNodeInjectorMembersInjector != null;
    this.expenseNodeInjectorMembersInjector = expenseNodeInjectorMembersInjector;
  }

  public static MembersInjector<ExpenseListNodeItemProvider> create(
      MembersInjector<ExpenseNode> expenseNodeInjectorMembersInjector) {
    return new ExpenseListNodeItemProvider_MembersInjector(expenseNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(ExpenseListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.expenseNodeInjector = expenseNodeInjectorMembersInjector;
  }

  public static void injectExpenseNodeInjector(
      ExpenseListNodeItemProvider instance, MembersInjector<ExpenseNode> expenseNodeInjector) {
    instance.expenseNodeInjector = expenseNodeInjector;
  }
}
