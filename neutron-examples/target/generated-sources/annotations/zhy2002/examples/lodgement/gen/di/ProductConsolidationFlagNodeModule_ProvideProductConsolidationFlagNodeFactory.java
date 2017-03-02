package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductConsolidationFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductConsolidationFlagNodeModule_ProvideProductConsolidationFlagNodeFactory
    implements Factory<ProductConsolidationFlagNode> {
  private final ProductConsolidationFlagNodeModule module;

  public ProductConsolidationFlagNodeModule_ProvideProductConsolidationFlagNodeFactory(
      ProductConsolidationFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductConsolidationFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideProductConsolidationFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductConsolidationFlagNode> create(
      ProductConsolidationFlagNodeModule module) {
    return new ProductConsolidationFlagNodeModule_ProvideProductConsolidationFlagNodeFactory(
        module);
  }

  /** Proxies {@link ProductConsolidationFlagNodeModule#provideProductConsolidationFlagNode()}. */
  public static ProductConsolidationFlagNode proxyProvideProductConsolidationFlagNode(
      ProductConsolidationFlagNodeModule instance) {
    return instance.provideProductConsolidationFlagNode();
  }
}
