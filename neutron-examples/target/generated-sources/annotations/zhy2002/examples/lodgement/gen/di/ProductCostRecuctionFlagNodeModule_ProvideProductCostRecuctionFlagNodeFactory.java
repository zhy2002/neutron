package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductCostRecuctionFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCostRecuctionFlagNodeModule_ProvideProductCostRecuctionFlagNodeFactory
    implements Factory<ProductCostRecuctionFlagNode> {
  private final ProductCostRecuctionFlagNodeModule module;

  public ProductCostRecuctionFlagNodeModule_ProvideProductCostRecuctionFlagNodeFactory(
      ProductCostRecuctionFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductCostRecuctionFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideProductCostRecuctionFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductCostRecuctionFlagNode> create(
      ProductCostRecuctionFlagNodeModule module) {
    return new ProductCostRecuctionFlagNodeModule_ProvideProductCostRecuctionFlagNodeFactory(
        module);
  }

  /** Proxies {@link ProductCostRecuctionFlagNodeModule#provideProductCostRecuctionFlagNode()}. */
  public static ProductCostRecuctionFlagNode proxyProvideProductCostRecuctionFlagNode(
      ProductCostRecuctionFlagNodeModule instance) {
    return instance.provideProductCostRecuctionFlagNode();
  }
}
