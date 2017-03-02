package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductPaymentTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductPaymentTypeNodeModule_ProvideProductPaymentTypeNodeFactory
    implements Factory<ProductPaymentTypeNode> {
  private final ProductPaymentTypeNodeModule module;

  public ProductPaymentTypeNodeModule_ProvideProductPaymentTypeNodeFactory(
      ProductPaymentTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductPaymentTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideProductPaymentTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductPaymentTypeNode> create(ProductPaymentTypeNodeModule module) {
    return new ProductPaymentTypeNodeModule_ProvideProductPaymentTypeNodeFactory(module);
  }

  /** Proxies {@link ProductPaymentTypeNodeModule#provideProductPaymentTypeNode()}. */
  public static ProductPaymentTypeNode proxyProvideProductPaymentTypeNode(
      ProductPaymentTypeNodeModule instance) {
    return instance.provideProductPaymentTypeNode();
  }
}
