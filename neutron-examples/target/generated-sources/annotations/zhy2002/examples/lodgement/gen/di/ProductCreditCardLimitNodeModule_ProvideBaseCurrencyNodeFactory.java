package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCreditCardLimitNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final ProductCreditCardLimitNodeModule module;

  public ProductCreditCardLimitNodeModule_ProvideBaseCurrencyNodeFactory(
      ProductCreditCardLimitNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(ProductCreditCardLimitNodeModule module) {
    return new ProductCreditCardLimitNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link ProductCreditCardLimitNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      ProductCreditCardLimitNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}