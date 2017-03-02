package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ExpenseNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseNodeModule_ProvideExpenseNodeFactory implements Factory<ExpenseNode> {
  private final ExpenseNodeModule module;

  public ExpenseNodeModule_ProvideExpenseNodeFactory(ExpenseNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ExpenseNode get() {
    return Preconditions.checkNotNull(
        module.provideExpenseNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ExpenseNode> create(ExpenseNodeModule module) {
    return new ExpenseNodeModule_ProvideExpenseNodeFactory(module);
  }

  /** Proxies {@link ExpenseNodeModule#provideExpenseNode()}. */
  public static ExpenseNode proxyProvideExpenseNode(ExpenseNodeModule instance) {
    return instance.provideExpenseNode();
  }
}
