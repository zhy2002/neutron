package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardLimitAmountNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final CreditCardLimitAmountNodeModule module;

  public CreditCardLimitAmountNodeModule_ProvideBaseCurrencyNodeFactory(
      CreditCardLimitAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(CreditCardLimitAmountNodeModule module) {
    return new CreditCardLimitAmountNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link CreditCardLimitAmountNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      CreditCardLimitAmountNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
