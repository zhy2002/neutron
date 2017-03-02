package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalSecurityAmountNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final ProductTotalSecurityAmountNodeModule module;

  public ProductTotalSecurityAmountNodeModule_ProvideBaseCurrencyNodeFactory(
      ProductTotalSecurityAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(ProductTotalSecurityAmountNodeModule module) {
    return new ProductTotalSecurityAmountNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link ProductTotalSecurityAmountNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      ProductTotalSecurityAmountNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
