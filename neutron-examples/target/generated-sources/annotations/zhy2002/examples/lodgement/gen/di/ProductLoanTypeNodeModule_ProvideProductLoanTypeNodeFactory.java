package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductLoanTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductLoanTypeNodeModule_ProvideProductLoanTypeNodeFactory
    implements Factory<ProductLoanTypeNode> {
  private final ProductLoanTypeNodeModule module;

  public ProductLoanTypeNodeModule_ProvideProductLoanTypeNodeFactory(
      ProductLoanTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductLoanTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideProductLoanTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductLoanTypeNode> create(ProductLoanTypeNodeModule module) {
    return new ProductLoanTypeNodeModule_ProvideProductLoanTypeNodeFactory(module);
  }

  /** Proxies {@link ProductLoanTypeNodeModule#provideProductLoanTypeNode()}. */
  public static ProductLoanTypeNode proxyProvideProductLoanTypeNode(
      ProductLoanTypeNodeModule instance) {
    return instance.provideProductLoanTypeNode();
  }
}
