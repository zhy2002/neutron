package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductLoanPrimaryPurposeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductLoanPrimaryPurposeNodeModule_ProvideProductLoanPrimaryPurposeNodeFactory
    implements Factory<ProductLoanPrimaryPurposeNode> {
  private final ProductLoanPrimaryPurposeNodeModule module;

  public ProductLoanPrimaryPurposeNodeModule_ProvideProductLoanPrimaryPurposeNodeFactory(
      ProductLoanPrimaryPurposeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductLoanPrimaryPurposeNode get() {
    return Preconditions.checkNotNull(
        module.provideProductLoanPrimaryPurposeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductLoanPrimaryPurposeNode> create(
      ProductLoanPrimaryPurposeNodeModule module) {
    return new ProductLoanPrimaryPurposeNodeModule_ProvideProductLoanPrimaryPurposeNodeFactory(
        module);
  }

  /** Proxies {@link ProductLoanPrimaryPurposeNodeModule#provideProductLoanPrimaryPurposeNode()}. */
  public static ProductLoanPrimaryPurposeNode proxyProvideProductLoanPrimaryPurposeNode(
      ProductLoanPrimaryPurposeNodeModule instance) {
    return instance.provideProductLoanPrimaryPurposeNode();
  }
}
