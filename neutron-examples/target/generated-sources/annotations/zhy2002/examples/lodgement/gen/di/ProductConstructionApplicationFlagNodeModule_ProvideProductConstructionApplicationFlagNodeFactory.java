package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductConstructionApplicationFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final
class ProductConstructionApplicationFlagNodeModule_ProvideProductConstructionApplicationFlagNodeFactory
    implements Factory<ProductConstructionApplicationFlagNode> {
  private final ProductConstructionApplicationFlagNodeModule module;

  public
  ProductConstructionApplicationFlagNodeModule_ProvideProductConstructionApplicationFlagNodeFactory(
      ProductConstructionApplicationFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductConstructionApplicationFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideProductConstructionApplicationFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductConstructionApplicationFlagNode> create(
      ProductConstructionApplicationFlagNodeModule module) {
    return new ProductConstructionApplicationFlagNodeModule_ProvideProductConstructionApplicationFlagNodeFactory(
        module);
  }

  /**
   * Proxies {@link
   * ProductConstructionApplicationFlagNodeModule#provideProductConstructionApplicationFlagNode()}.
   */
  public static ProductConstructionApplicationFlagNode
      proxyProvideProductConstructionApplicationFlagNode(
          ProductConstructionApplicationFlagNodeModule instance) {
    return instance.provideProductConstructionApplicationFlagNode();
  }
}
