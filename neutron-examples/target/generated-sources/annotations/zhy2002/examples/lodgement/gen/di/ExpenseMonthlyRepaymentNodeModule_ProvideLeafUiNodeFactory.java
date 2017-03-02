package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseMonthlyRepaymentNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ExpenseMonthlyRepaymentNodeModule module;

  public ExpenseMonthlyRepaymentNodeModule_ProvideLeafUiNodeFactory(
      ExpenseMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ExpenseMonthlyRepaymentNodeModule module) {
    return new ExpenseMonthlyRepaymentNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ExpenseMonthlyRepaymentNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      ExpenseMonthlyRepaymentNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
