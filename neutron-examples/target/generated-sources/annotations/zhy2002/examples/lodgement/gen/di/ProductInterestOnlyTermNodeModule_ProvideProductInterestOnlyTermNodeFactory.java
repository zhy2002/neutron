package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductInterestOnlyTermNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductInterestOnlyTermNodeModule_ProvideProductInterestOnlyTermNodeFactory
    implements Factory<ProductInterestOnlyTermNode> {
  private final ProductInterestOnlyTermNodeModule module;

  public ProductInterestOnlyTermNodeModule_ProvideProductInterestOnlyTermNodeFactory(
      ProductInterestOnlyTermNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductInterestOnlyTermNode get() {
    return Preconditions.checkNotNull(
        module.provideProductInterestOnlyTermNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductInterestOnlyTermNode> create(
      ProductInterestOnlyTermNodeModule module) {
    return new ProductInterestOnlyTermNodeModule_ProvideProductInterestOnlyTermNodeFactory(module);
  }

  /** Proxies {@link ProductInterestOnlyTermNodeModule#provideProductInterestOnlyTermNode()}. */
  public static ProductInterestOnlyTermNode proxyProvideProductInterestOnlyTermNode(
      ProductInterestOnlyTermNodeModule instance) {
    return instance.provideProductInterestOnlyTermNode();
  }
}
