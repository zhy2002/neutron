package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductCreditCardTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCreditCardTypeNodeModule_ProvideProductCreditCardTypeNodeFactory
    implements Factory<ProductCreditCardTypeNode> {
  private final ProductCreditCardTypeNodeModule module;

  public ProductCreditCardTypeNodeModule_ProvideProductCreditCardTypeNodeFactory(
      ProductCreditCardTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductCreditCardTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideProductCreditCardTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductCreditCardTypeNode> create(ProductCreditCardTypeNodeModule module) {
    return new ProductCreditCardTypeNodeModule_ProvideProductCreditCardTypeNodeFactory(module);
  }

  /** Proxies {@link ProductCreditCardTypeNodeModule#provideProductCreditCardTypeNode()}. */
  public static ProductCreditCardTypeNode proxyProvideProductCreditCardTypeNode(
      ProductCreditCardTypeNodeModule instance) {
    return instance.provideProductCreditCardTypeNode();
  }
}
