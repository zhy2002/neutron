package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductSpecificFeaturesFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductSpecificFeaturesFlagNodeModule module;

  public ProductSpecificFeaturesFlagNodeModule_ProvideLeafUiNodeFactory(
      ProductSpecificFeaturesFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductSpecificFeaturesFlagNodeModule module) {
    return new ProductSpecificFeaturesFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductSpecificFeaturesFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      ProductSpecificFeaturesFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
