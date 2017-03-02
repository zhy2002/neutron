package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductGroupNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductGroupNodeModule_ProvideProductGroupNodeFactory
    implements Factory<ProductGroupNode> {
  private final ProductGroupNodeModule module;

  public ProductGroupNodeModule_ProvideProductGroupNodeFactory(ProductGroupNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductGroupNode get() {
    return Preconditions.checkNotNull(
        module.provideProductGroupNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductGroupNode> create(ProductGroupNodeModule module) {
    return new ProductGroupNodeModule_ProvideProductGroupNodeFactory(module);
  }

  /** Proxies {@link ProductGroupNodeModule#provideProductGroupNode()}. */
  public static ProductGroupNode proxyProvideProductGroupNode(ProductGroupNodeModule instance) {
    return instance.provideProductGroupNode();
  }
}
