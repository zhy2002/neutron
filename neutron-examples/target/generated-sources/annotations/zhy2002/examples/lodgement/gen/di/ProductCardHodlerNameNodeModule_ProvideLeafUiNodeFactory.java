package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCardHodlerNameNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductCardHodlerNameNodeModule module;

  public ProductCardHodlerNameNodeModule_ProvideLeafUiNodeFactory(
      ProductCardHodlerNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductCardHodlerNameNodeModule module) {
    return new ProductCardHodlerNameNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductCardHodlerNameNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ProductCardHodlerNameNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
