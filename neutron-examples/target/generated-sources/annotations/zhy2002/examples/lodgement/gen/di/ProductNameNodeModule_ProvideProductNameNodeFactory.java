package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductNameNodeModule_ProvideProductNameNodeFactory
    implements Factory<ProductNameNode> {
  private final ProductNameNodeModule module;

  public ProductNameNodeModule_ProvideProductNameNodeFactory(ProductNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductNameNode get() {
    return Preconditions.checkNotNull(
        module.provideProductNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductNameNode> create(ProductNameNodeModule module) {
    return new ProductNameNodeModule_ProvideProductNameNodeFactory(module);
  }

  /** Proxies {@link ProductNameNodeModule#provideProductNameNode()}. */
  public static ProductNameNode proxyProvideProductNameNode(ProductNameNodeModule instance) {
    return instance.provideProductNameNode();
  }
}
