package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductCardHodlerNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCardHodlerNameNodeModule_ProvideProductCardHodlerNameNodeFactory
    implements Factory<ProductCardHodlerNameNode> {
  private final ProductCardHodlerNameNodeModule module;

  public ProductCardHodlerNameNodeModule_ProvideProductCardHodlerNameNodeFactory(
      ProductCardHodlerNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductCardHodlerNameNode get() {
    return Preconditions.checkNotNull(
        module.provideProductCardHodlerNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductCardHodlerNameNode> create(ProductCardHodlerNameNodeModule module) {
    return new ProductCardHodlerNameNodeModule_ProvideProductCardHodlerNameNodeFactory(module);
  }

  /** Proxies {@link ProductCardHodlerNameNodeModule#provideProductCardHodlerNameNode()}. */
  public static ProductCardHodlerNameNode proxyProvideProductCardHodlerNameNode(
      ProductCardHodlerNameNodeModule instance) {
    return instance.provideProductCardHodlerNameNode();
  }
}
