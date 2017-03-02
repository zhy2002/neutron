package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ExpenseTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseTypeNodeModule_ProvideExpenseTypeNodeFactory
    implements Factory<ExpenseTypeNode> {
  private final ExpenseTypeNodeModule module;

  public ExpenseTypeNodeModule_ProvideExpenseTypeNodeFactory(ExpenseTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ExpenseTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideExpenseTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ExpenseTypeNode> create(ExpenseTypeNodeModule module) {
    return new ExpenseTypeNodeModule_ProvideExpenseTypeNodeFactory(module);
  }

  /** Proxies {@link ExpenseTypeNodeModule#provideExpenseTypeNode()}. */
  public static ExpenseTypeNode proxyProvideExpenseTypeNode(ExpenseTypeNodeModule instance) {
    return instance.provideExpenseTypeNode();
  }
}
