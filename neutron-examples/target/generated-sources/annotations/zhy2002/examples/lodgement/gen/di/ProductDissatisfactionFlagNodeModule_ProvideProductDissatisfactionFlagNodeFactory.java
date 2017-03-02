package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductDissatisfactionFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductDissatisfactionFlagNodeModule_ProvideProductDissatisfactionFlagNodeFactory
    implements Factory<ProductDissatisfactionFlagNode> {
  private final ProductDissatisfactionFlagNodeModule module;

  public ProductDissatisfactionFlagNodeModule_ProvideProductDissatisfactionFlagNodeFactory(
      ProductDissatisfactionFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductDissatisfactionFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideProductDissatisfactionFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductDissatisfactionFlagNode> create(
      ProductDissatisfactionFlagNodeModule module) {
    return new ProductDissatisfactionFlagNodeModule_ProvideProductDissatisfactionFlagNodeFactory(
        module);
  }

  /**
   * Proxies {@link ProductDissatisfactionFlagNodeModule#provideProductDissatisfactionFlagNode()}.
   */
  public static ProductDissatisfactionFlagNode proxyProvideProductDissatisfactionFlagNode(
      ProductDissatisfactionFlagNodeModule instance) {
    return instance.provideProductDissatisfactionFlagNode();
  }
}
