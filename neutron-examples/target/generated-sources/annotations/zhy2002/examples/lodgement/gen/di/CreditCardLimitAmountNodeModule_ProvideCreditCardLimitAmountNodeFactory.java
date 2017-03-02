package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CreditCardLimitAmountNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardLimitAmountNodeModule_ProvideCreditCardLimitAmountNodeFactory
    implements Factory<CreditCardLimitAmountNode> {
  private final CreditCardLimitAmountNodeModule module;

  public CreditCardLimitAmountNodeModule_ProvideCreditCardLimitAmountNodeFactory(
      CreditCardLimitAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CreditCardLimitAmountNode get() {
    return Preconditions.checkNotNull(
        module.provideCreditCardLimitAmountNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CreditCardLimitAmountNode> create(CreditCardLimitAmountNodeModule module) {
    return new CreditCardLimitAmountNodeModule_ProvideCreditCardLimitAmountNodeFactory(module);
  }

  /** Proxies {@link CreditCardLimitAmountNodeModule#provideCreditCardLimitAmountNode()}. */
  public static CreditCardLimitAmountNode proxyProvideCreditCardLimitAmountNode(
      CreditCardLimitAmountNodeModule instance) {
    return instance.provideCreditCardLimitAmountNode();
  }
}
