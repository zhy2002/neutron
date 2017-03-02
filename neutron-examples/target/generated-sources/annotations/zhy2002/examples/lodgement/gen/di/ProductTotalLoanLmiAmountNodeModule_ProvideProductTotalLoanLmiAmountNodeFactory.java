package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductTotalLoanLmiAmountNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLoanLmiAmountNodeModule_ProvideProductTotalLoanLmiAmountNodeFactory
    implements Factory<ProductTotalLoanLmiAmountNode> {
  private final ProductTotalLoanLmiAmountNodeModule module;

  public ProductTotalLoanLmiAmountNodeModule_ProvideProductTotalLoanLmiAmountNodeFactory(
      ProductTotalLoanLmiAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductTotalLoanLmiAmountNode get() {
    return Preconditions.checkNotNull(
        module.provideProductTotalLoanLmiAmountNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductTotalLoanLmiAmountNode> create(
      ProductTotalLoanLmiAmountNodeModule module) {
    return new ProductTotalLoanLmiAmountNodeModule_ProvideProductTotalLoanLmiAmountNodeFactory(
        module);
  }

  /** Proxies {@link ProductTotalLoanLmiAmountNodeModule#provideProductTotalLoanLmiAmountNode()}. */
  public static ProductTotalLoanLmiAmountNode proxyProvideProductTotalLoanLmiAmountNode(
      ProductTotalLoanLmiAmountNodeModule instance) {
    return instance.provideProductTotalLoanLmiAmountNode();
  }
}
