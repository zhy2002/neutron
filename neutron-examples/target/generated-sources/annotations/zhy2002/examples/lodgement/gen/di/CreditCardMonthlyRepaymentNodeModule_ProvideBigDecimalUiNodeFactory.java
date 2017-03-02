package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.BigDecimalUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardMonthlyRepaymentNodeModule_ProvideBigDecimalUiNodeFactory
    implements Factory<BigDecimalUiNode<?>> {
  private final CreditCardMonthlyRepaymentNodeModule module;

  public CreditCardMonthlyRepaymentNodeModule_ProvideBigDecimalUiNodeFactory(
      CreditCardMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BigDecimalUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBigDecimalUiNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BigDecimalUiNode<?>> create(CreditCardMonthlyRepaymentNodeModule module) {
    return new CreditCardMonthlyRepaymentNodeModule_ProvideBigDecimalUiNodeFactory(module);
  }

  /** Proxies {@link CreditCardMonthlyRepaymentNodeModule#provideBigDecimalUiNode()}. */
  public static BigDecimalUiNode<?> proxyProvideBigDecimalUiNode(
      CreditCardMonthlyRepaymentNodeModule instance) {
    return instance.provideBigDecimalUiNode();
  }
}
