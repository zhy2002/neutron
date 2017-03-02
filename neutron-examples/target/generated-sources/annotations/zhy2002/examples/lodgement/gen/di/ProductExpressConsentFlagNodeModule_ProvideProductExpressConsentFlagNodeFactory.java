package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductExpressConsentFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductExpressConsentFlagNodeModule_ProvideProductExpressConsentFlagNodeFactory
    implements Factory<ProductExpressConsentFlagNode> {
  private final ProductExpressConsentFlagNodeModule module;

  public ProductExpressConsentFlagNodeModule_ProvideProductExpressConsentFlagNodeFactory(
      ProductExpressConsentFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductExpressConsentFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideProductExpressConsentFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductExpressConsentFlagNode> create(
      ProductExpressConsentFlagNodeModule module) {
    return new ProductExpressConsentFlagNodeModule_ProvideProductExpressConsentFlagNodeFactory(
        module);
  }

  /** Proxies {@link ProductExpressConsentFlagNodeModule#provideProductExpressConsentFlagNode()}. */
  public static ProductExpressConsentFlagNode proxyProvideProductExpressConsentFlagNode(
      ProductExpressConsentFlagNodeModule instance) {
    return instance.provideProductExpressConsentFlagNode();
  }
}
