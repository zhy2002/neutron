package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.BigDecimalUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseMonthlyRepaymentNodeModule_ProvideBigDecimalUiNodeFactory
    implements Factory<BigDecimalUiNode<?>> {
  private final ExpenseMonthlyRepaymentNodeModule module;

  public ExpenseMonthlyRepaymentNodeModule_ProvideBigDecimalUiNodeFactory(
      ExpenseMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BigDecimalUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBigDecimalUiNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BigDecimalUiNode<?>> create(ExpenseMonthlyRepaymentNodeModule module) {
    return new ExpenseMonthlyRepaymentNodeModule_ProvideBigDecimalUiNodeFactory(module);
  }

  /** Proxies {@link ExpenseMonthlyRepaymentNodeModule#provideBigDecimalUiNode()}. */
  public static BigDecimalUiNode<?> proxyProvideBigDecimalUiNode(
      ExpenseMonthlyRepaymentNodeModule instance) {
    return instance.provideBigDecimalUiNode();
  }
}
