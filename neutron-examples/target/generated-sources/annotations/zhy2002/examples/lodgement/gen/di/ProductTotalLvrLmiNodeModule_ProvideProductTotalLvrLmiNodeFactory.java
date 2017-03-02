package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductTotalLvrLmiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLvrLmiNodeModule_ProvideProductTotalLvrLmiNodeFactory
    implements Factory<ProductTotalLvrLmiNode> {
  private final ProductTotalLvrLmiNodeModule module;

  public ProductTotalLvrLmiNodeModule_ProvideProductTotalLvrLmiNodeFactory(
      ProductTotalLvrLmiNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductTotalLvrLmiNode get() {
    return Preconditions.checkNotNull(
        module.provideProductTotalLvrLmiNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductTotalLvrLmiNode> create(ProductTotalLvrLmiNodeModule module) {
    return new ProductTotalLvrLmiNodeModule_ProvideProductTotalLvrLmiNodeFactory(module);
  }

  /** Proxies {@link ProductTotalLvrLmiNodeModule#provideProductTotalLvrLmiNode()}. */
  public static ProductTotalLvrLmiNode proxyProvideProductTotalLvrLmiNode(
      ProductTotalLvrLmiNodeModule instance) {
    return instance.provideProductTotalLvrLmiNode();
  }
}
