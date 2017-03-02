package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductCreditCardLimitNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCreditCardLimitNodeModule_ProvideProductCreditCardLimitNodeFactory
    implements Factory<ProductCreditCardLimitNode> {
  private final ProductCreditCardLimitNodeModule module;

  public ProductCreditCardLimitNodeModule_ProvideProductCreditCardLimitNodeFactory(
      ProductCreditCardLimitNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductCreditCardLimitNode get() {
    return Preconditions.checkNotNull(
        module.provideProductCreditCardLimitNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductCreditCardLimitNode> create(
      ProductCreditCardLimitNodeModule module) {
    return new ProductCreditCardLimitNodeModule_ProvideProductCreditCardLimitNodeFactory(module);
  }

  /** Proxies {@link ProductCreditCardLimitNodeModule#provideProductCreditCardLimitNode()}. */
  public static ProductCreditCardLimitNode proxyProvideProductCreditCardLimitNode(
      ProductCreditCardLimitNodeModule instance) {
    return instance.provideProductCreditCardLimitNode();
  }
}
