package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductTotalLoanTermNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLoanTermNodeModule_ProvideProductTotalLoanTermNodeFactory
    implements Factory<ProductTotalLoanTermNode> {
  private final ProductTotalLoanTermNodeModule module;

  public ProductTotalLoanTermNodeModule_ProvideProductTotalLoanTermNodeFactory(
      ProductTotalLoanTermNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductTotalLoanTermNode get() {
    return Preconditions.checkNotNull(
        module.provideProductTotalLoanTermNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductTotalLoanTermNode> create(ProductTotalLoanTermNodeModule module) {
    return new ProductTotalLoanTermNodeModule_ProvideProductTotalLoanTermNodeFactory(module);
  }

  /** Proxies {@link ProductTotalLoanTermNodeModule#provideProductTotalLoanTermNode()}. */
  public static ProductTotalLoanTermNode proxyProvideProductTotalLoanTermNode(
      ProductTotalLoanTermNodeModule instance) {
    return instance.provideProductTotalLoanTermNode();
  }
}
