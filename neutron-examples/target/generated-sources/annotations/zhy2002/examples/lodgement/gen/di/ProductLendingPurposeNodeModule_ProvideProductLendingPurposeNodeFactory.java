package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductLendingPurposeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductLendingPurposeNodeModule_ProvideProductLendingPurposeNodeFactory
    implements Factory<ProductLendingPurposeNode> {
  private final ProductLendingPurposeNodeModule module;

  public ProductLendingPurposeNodeModule_ProvideProductLendingPurposeNodeFactory(
      ProductLendingPurposeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductLendingPurposeNode get() {
    return Preconditions.checkNotNull(
        module.provideProductLendingPurposeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductLendingPurposeNode> create(ProductLendingPurposeNodeModule module) {
    return new ProductLendingPurposeNodeModule_ProvideProductLendingPurposeNodeFactory(module);
  }

  /** Proxies {@link ProductLendingPurposeNodeModule#provideProductLendingPurposeNode()}. */
  public static ProductLendingPurposeNode proxyProvideProductLendingPurposeNode(
      ProductLendingPurposeNodeModule instance) {
    return instance.provideProductLendingPurposeNode();
  }
}
