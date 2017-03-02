package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductListNodeModule_ProvideProductListNodeFactory
    implements Factory<ProductListNode> {
  private final ProductListNodeModule module;

  public ProductListNodeModule_ProvideProductListNodeFactory(ProductListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductListNode get() {
    return Preconditions.checkNotNull(
        module.provideProductListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductListNode> create(ProductListNodeModule module) {
    return new ProductListNodeModule_ProvideProductListNodeFactory(module);
  }

  /** Proxies {@link ProductListNodeModule#provideProductListNode()}. */
  public static ProductListNode proxyProvideProductListNode(ProductListNodeModule instance) {
    return instance.provideProductListNode();
  }
}
