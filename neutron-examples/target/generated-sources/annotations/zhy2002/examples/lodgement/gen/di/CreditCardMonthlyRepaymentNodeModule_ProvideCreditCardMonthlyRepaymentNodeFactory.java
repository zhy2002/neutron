package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CreditCardMonthlyRepaymentNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardMonthlyRepaymentNodeModule_ProvideCreditCardMonthlyRepaymentNodeFactory
    implements Factory<CreditCardMonthlyRepaymentNode> {
  private final CreditCardMonthlyRepaymentNodeModule module;

  public CreditCardMonthlyRepaymentNodeModule_ProvideCreditCardMonthlyRepaymentNodeFactory(
      CreditCardMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CreditCardMonthlyRepaymentNode get() {
    return Preconditions.checkNotNull(
        module.provideCreditCardMonthlyRepaymentNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CreditCardMonthlyRepaymentNode> create(
      CreditCardMonthlyRepaymentNodeModule module) {
    return new CreditCardMonthlyRepaymentNodeModule_ProvideCreditCardMonthlyRepaymentNodeFactory(
        module);
  }

  /**
   * Proxies {@link CreditCardMonthlyRepaymentNodeModule#provideCreditCardMonthlyRepaymentNode()}.
   */
  public static CreditCardMonthlyRepaymentNode proxyProvideCreditCardMonthlyRepaymentNode(
      CreditCardMonthlyRepaymentNodeModule instance) {
    return instance.provideCreditCardMonthlyRepaymentNode();
  }
}
