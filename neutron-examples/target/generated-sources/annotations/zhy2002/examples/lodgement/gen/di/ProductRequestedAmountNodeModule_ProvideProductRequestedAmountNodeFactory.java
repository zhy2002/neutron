package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductRequestedAmountNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRequestedAmountNodeModule_ProvideProductRequestedAmountNodeFactory
    implements Factory<ProductRequestedAmountNode> {
  private final ProductRequestedAmountNodeModule module;

  public ProductRequestedAmountNodeModule_ProvideProductRequestedAmountNodeFactory(
      ProductRequestedAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductRequestedAmountNode get() {
    return Preconditions.checkNotNull(
        module.provideProductRequestedAmountNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductRequestedAmountNode> create(
      ProductRequestedAmountNodeModule module) {
    return new ProductRequestedAmountNodeModule_ProvideProductRequestedAmountNodeFactory(module);
  }

  /** Proxies {@link ProductRequestedAmountNodeModule#provideProductRequestedAmountNode()}. */
  public static ProductRequestedAmountNode proxyProvideProductRequestedAmountNode(
      ProductRequestedAmountNodeModule instance) {
    return instance.provideProductRequestedAmountNode();
  }
}
