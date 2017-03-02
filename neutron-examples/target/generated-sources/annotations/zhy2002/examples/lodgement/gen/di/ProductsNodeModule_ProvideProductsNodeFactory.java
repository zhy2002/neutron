package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductsNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductsNodeModule_ProvideProductsNodeFactory implements Factory<ProductsNode> {
  private final ProductsNodeModule module;

  public ProductsNodeModule_ProvideProductsNodeFactory(ProductsNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductsNode get() {
    return Preconditions.checkNotNull(
        module.provideProductsNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductsNode> create(ProductsNodeModule module) {
    return new ProductsNodeModule_ProvideProductsNodeFactory(module);
  }

  /** Proxies {@link ProductsNodeModule#provideProductsNode()}. */
  public static ProductsNode proxyProvideProductsNode(ProductsNodeModule instance) {
    return instance.provideProductsNode();
  }
}
