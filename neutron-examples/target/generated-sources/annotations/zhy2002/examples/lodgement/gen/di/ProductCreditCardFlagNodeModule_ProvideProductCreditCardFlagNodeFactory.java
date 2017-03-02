package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductCreditCardFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCreditCardFlagNodeModule_ProvideProductCreditCardFlagNodeFactory
    implements Factory<ProductCreditCardFlagNode> {
  private final ProductCreditCardFlagNodeModule module;

  public ProductCreditCardFlagNodeModule_ProvideProductCreditCardFlagNodeFactory(
      ProductCreditCardFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductCreditCardFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideProductCreditCardFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductCreditCardFlagNode> create(ProductCreditCardFlagNodeModule module) {
    return new ProductCreditCardFlagNodeModule_ProvideProductCreditCardFlagNodeFactory(module);
  }

  /** Proxies {@link ProductCreditCardFlagNodeModule#provideProductCreditCardFlagNode()}. */
  public static ProductCreditCardFlagNode proxyProvideProductCreditCardFlagNode(
      ProductCreditCardFlagNodeModule instance) {
    return instance.provideProductCreditCardFlagNode();
  }
}
