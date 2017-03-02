package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCostRecuctionFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductCostRecuctionFlagNodeModule module;

  public ProductCostRecuctionFlagNodeModule_ProvideLeafUiNodeFactory(
      ProductCostRecuctionFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductCostRecuctionFlagNodeModule module) {
    return new ProductCostRecuctionFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductCostRecuctionFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      ProductCostRecuctionFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
