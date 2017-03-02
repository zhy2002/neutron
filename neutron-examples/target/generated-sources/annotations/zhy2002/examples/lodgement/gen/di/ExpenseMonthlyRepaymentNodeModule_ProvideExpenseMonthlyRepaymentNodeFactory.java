package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ExpenseMonthlyRepaymentNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseMonthlyRepaymentNodeModule_ProvideExpenseMonthlyRepaymentNodeFactory
    implements Factory<ExpenseMonthlyRepaymentNode> {
  private final ExpenseMonthlyRepaymentNodeModule module;

  public ExpenseMonthlyRepaymentNodeModule_ProvideExpenseMonthlyRepaymentNodeFactory(
      ExpenseMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ExpenseMonthlyRepaymentNode get() {
    return Preconditions.checkNotNull(
        module.provideExpenseMonthlyRepaymentNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ExpenseMonthlyRepaymentNode> create(
      ExpenseMonthlyRepaymentNodeModule module) {
    return new ExpenseMonthlyRepaymentNodeModule_ProvideExpenseMonthlyRepaymentNodeFactory(module);
  }

  /** Proxies {@link ExpenseMonthlyRepaymentNodeModule#provideExpenseMonthlyRepaymentNode()}. */
  public static ExpenseMonthlyRepaymentNode proxyProvideExpenseMonthlyRepaymentNode(
      ExpenseMonthlyRepaymentNodeModule instance) {
    return instance.provideExpenseMonthlyRepaymentNode();
  }
}
