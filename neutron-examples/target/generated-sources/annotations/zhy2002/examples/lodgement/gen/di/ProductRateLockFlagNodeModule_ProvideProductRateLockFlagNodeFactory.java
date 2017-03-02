package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductRateLockFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRateLockFlagNodeModule_ProvideProductRateLockFlagNodeFactory
    implements Factory<ProductRateLockFlagNode> {
  private final ProductRateLockFlagNodeModule module;

  public ProductRateLockFlagNodeModule_ProvideProductRateLockFlagNodeFactory(
      ProductRateLockFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductRateLockFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideProductRateLockFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductRateLockFlagNode> create(ProductRateLockFlagNodeModule module) {
    return new ProductRateLockFlagNodeModule_ProvideProductRateLockFlagNodeFactory(module);
  }

  /** Proxies {@link ProductRateLockFlagNodeModule#provideProductRateLockFlagNode()}. */
  public static ProductRateLockFlagNode proxyProvideProductRateLockFlagNode(
      ProductRateLockFlagNodeModule instance) {
    return instance.provideProductRateLockFlagNode();
  }
}
