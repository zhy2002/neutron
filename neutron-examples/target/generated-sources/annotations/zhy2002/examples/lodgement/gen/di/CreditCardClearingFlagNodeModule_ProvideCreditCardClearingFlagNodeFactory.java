package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CreditCardClearingFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardClearingFlagNodeModule_ProvideCreditCardClearingFlagNodeFactory
    implements Factory<CreditCardClearingFlagNode> {
  private final CreditCardClearingFlagNodeModule module;

  public CreditCardClearingFlagNodeModule_ProvideCreditCardClearingFlagNodeFactory(
      CreditCardClearingFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CreditCardClearingFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideCreditCardClearingFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CreditCardClearingFlagNode> create(
      CreditCardClearingFlagNodeModule module) {
    return new CreditCardClearingFlagNodeModule_ProvideCreditCardClearingFlagNodeFactory(module);
  }

  /** Proxies {@link CreditCardClearingFlagNodeModule#provideCreditCardClearingFlagNode()}. */
  public static CreditCardClearingFlagNode proxyProvideCreditCardClearingFlagNode(
      CreditCardClearingFlagNodeModule instance) {
    return instance.provideCreditCardClearingFlagNode();
  }
}
