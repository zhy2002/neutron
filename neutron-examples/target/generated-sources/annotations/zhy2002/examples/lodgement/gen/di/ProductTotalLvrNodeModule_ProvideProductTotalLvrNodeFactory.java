package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductTotalLvrNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLvrNodeModule_ProvideProductTotalLvrNodeFactory
    implements Factory<ProductTotalLvrNode> {
  private final ProductTotalLvrNodeModule module;

  public ProductTotalLvrNodeModule_ProvideProductTotalLvrNodeFactory(
      ProductTotalLvrNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductTotalLvrNode get() {
    return Preconditions.checkNotNull(
        module.provideProductTotalLvrNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductTotalLvrNode> create(ProductTotalLvrNodeModule module) {
    return new ProductTotalLvrNodeModule_ProvideProductTotalLvrNodeFactory(module);
  }

  /** Proxies {@link ProductTotalLvrNodeModule#provideProductTotalLvrNode()}. */
  public static ProductTotalLvrNode proxyProvideProductTotalLvrNode(
      ProductTotalLvrNodeModule instance) {
    return instance.provideProductTotalLvrNode();
  }
}
