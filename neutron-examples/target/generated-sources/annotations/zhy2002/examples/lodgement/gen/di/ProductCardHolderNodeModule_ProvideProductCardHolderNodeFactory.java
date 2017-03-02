package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductCardHolderNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCardHolderNodeModule_ProvideProductCardHolderNodeFactory
    implements Factory<ProductCardHolderNode> {
  private final ProductCardHolderNodeModule module;

  public ProductCardHolderNodeModule_ProvideProductCardHolderNodeFactory(
      ProductCardHolderNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductCardHolderNode get() {
    return Preconditions.checkNotNull(
        module.provideProductCardHolderNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductCardHolderNode> create(ProductCardHolderNodeModule module) {
    return new ProductCardHolderNodeModule_ProvideProductCardHolderNodeFactory(module);
  }

  /** Proxies {@link ProductCardHolderNodeModule#provideProductCardHolderNode()}. */
  public static ProductCardHolderNode proxyProvideProductCardHolderNode(
      ProductCardHolderNodeModule instance) {
    return instance.provideProductCardHolderNode();
  }
}
