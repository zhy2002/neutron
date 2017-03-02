package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductSpecificFeaturesFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final
class ProductSpecificFeaturesFlagNodeModule_ProvideProductSpecificFeaturesFlagNodeFactory
    implements Factory<ProductSpecificFeaturesFlagNode> {
  private final ProductSpecificFeaturesFlagNodeModule module;

  public ProductSpecificFeaturesFlagNodeModule_ProvideProductSpecificFeaturesFlagNodeFactory(
      ProductSpecificFeaturesFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductSpecificFeaturesFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideProductSpecificFeaturesFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductSpecificFeaturesFlagNode> create(
      ProductSpecificFeaturesFlagNodeModule module) {
    return new ProductSpecificFeaturesFlagNodeModule_ProvideProductSpecificFeaturesFlagNodeFactory(
        module);
  }

  /**
   * Proxies {@link ProductSpecificFeaturesFlagNodeModule#provideProductSpecificFeaturesFlagNode()}.
   */
  public static ProductSpecificFeaturesFlagNode proxyProvideProductSpecificFeaturesFlagNode(
      ProductSpecificFeaturesFlagNodeModule instance) {
    return instance.provideProductSpecificFeaturesFlagNode();
  }
}
