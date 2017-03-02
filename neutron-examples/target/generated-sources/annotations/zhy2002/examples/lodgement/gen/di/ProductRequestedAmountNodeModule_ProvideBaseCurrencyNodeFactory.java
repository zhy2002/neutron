package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRequestedAmountNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final ProductRequestedAmountNodeModule module;

  public ProductRequestedAmountNodeModule_ProvideBaseCurrencyNodeFactory(
      ProductRequestedAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(ProductRequestedAmountNodeModule module) {
    return new ProductRequestedAmountNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link ProductRequestedAmountNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      ProductRequestedAmountNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
