package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ExpenseDescriptionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseDescriptionNodeModule_ProvideExpenseDescriptionNodeFactory
    implements Factory<ExpenseDescriptionNode> {
  private final ExpenseDescriptionNodeModule module;

  public ExpenseDescriptionNodeModule_ProvideExpenseDescriptionNodeFactory(
      ExpenseDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ExpenseDescriptionNode get() {
    return Preconditions.checkNotNull(
        module.provideExpenseDescriptionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ExpenseDescriptionNode> create(ExpenseDescriptionNodeModule module) {
    return new ExpenseDescriptionNodeModule_ProvideExpenseDescriptionNodeFactory(module);
  }

  /** Proxies {@link ExpenseDescriptionNodeModule#provideExpenseDescriptionNode()}. */
  public static ExpenseDescriptionNode proxyProvideExpenseDescriptionNode(
      ExpenseDescriptionNodeModule instance) {
    return instance.provideExpenseDescriptionNode();
  }
}
