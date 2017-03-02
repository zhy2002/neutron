package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductFeaturesNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductFeaturesNodeModule_ProvideProductFeaturesNodeFactory
    implements Factory<ProductFeaturesNode> {
  private final ProductFeaturesNodeModule module;

  public ProductFeaturesNodeModule_ProvideProductFeaturesNodeFactory(
      ProductFeaturesNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductFeaturesNode get() {
    return Preconditions.checkNotNull(
        module.provideProductFeaturesNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductFeaturesNode> create(ProductFeaturesNodeModule module) {
    return new ProductFeaturesNodeModule_ProvideProductFeaturesNodeFactory(module);
  }

  /** Proxies {@link ProductFeaturesNodeModule#provideProductFeaturesNode()}. */
  public static ProductFeaturesNode proxyProvideProductFeaturesNode(
      ProductFeaturesNodeModule instance) {
    return instance.provideProductFeaturesNode();
  }
}
