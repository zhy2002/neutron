package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductTotalSecurityAmountNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalSecurityAmountNodeModule_ProvideProductTotalSecurityAmountNodeFactory
    implements Factory<ProductTotalSecurityAmountNode> {
  private final ProductTotalSecurityAmountNodeModule module;

  public ProductTotalSecurityAmountNodeModule_ProvideProductTotalSecurityAmountNodeFactory(
      ProductTotalSecurityAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductTotalSecurityAmountNode get() {
    return Preconditions.checkNotNull(
        module.provideProductTotalSecurityAmountNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductTotalSecurityAmountNode> create(
      ProductTotalSecurityAmountNodeModule module) {
    return new ProductTotalSecurityAmountNodeModule_ProvideProductTotalSecurityAmountNodeFactory(
        module);
  }

  /**
   * Proxies {@link ProductTotalSecurityAmountNodeModule#provideProductTotalSecurityAmountNode()}.
   */
  public static ProductTotalSecurityAmountNode proxyProvideProductTotalSecurityAmountNode(
      ProductTotalSecurityAmountNodeModule instance) {
    return instance.provideProductTotalSecurityAmountNode();
  }
}
