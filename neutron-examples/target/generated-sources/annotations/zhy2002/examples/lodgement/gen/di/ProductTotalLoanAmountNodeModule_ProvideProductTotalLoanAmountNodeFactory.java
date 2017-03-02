package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductTotalLoanAmountNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLoanAmountNodeModule_ProvideProductTotalLoanAmountNodeFactory
    implements Factory<ProductTotalLoanAmountNode> {
  private final ProductTotalLoanAmountNodeModule module;

  public ProductTotalLoanAmountNodeModule_ProvideProductTotalLoanAmountNodeFactory(
      ProductTotalLoanAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductTotalLoanAmountNode get() {
    return Preconditions.checkNotNull(
        module.provideProductTotalLoanAmountNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductTotalLoanAmountNode> create(
      ProductTotalLoanAmountNodeModule module) {
    return new ProductTotalLoanAmountNodeModule_ProvideProductTotalLoanAmountNodeFactory(module);
  }

  /** Proxies {@link ProductTotalLoanAmountNodeModule#provideProductTotalLoanAmountNode()}. */
  public static ProductTotalLoanAmountNode proxyProvideProductTotalLoanAmountNode(
      ProductTotalLoanAmountNodeModule instance) {
    return instance.provideProductTotalLoanAmountNode();
  }
}
