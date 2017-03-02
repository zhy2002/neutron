package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ExpenseListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseListNodeModule_ProvideExpenseListNodeFactory
    implements Factory<ExpenseListNode> {
  private final ExpenseListNodeModule module;

  public ExpenseListNodeModule_ProvideExpenseListNodeFactory(ExpenseListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ExpenseListNode get() {
    return Preconditions.checkNotNull(
        module.provideExpenseListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ExpenseListNode> create(ExpenseListNodeModule module) {
    return new ExpenseListNodeModule_ProvideExpenseListNodeFactory(module);
  }

  /** Proxies {@link ExpenseListNodeModule#provideExpenseListNode()}. */
  public static ExpenseListNode proxyProvideExpenseListNode(ExpenseListNodeModule instance) {
    return instance.provideExpenseListNode();
  }
}
