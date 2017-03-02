package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.BigDecimalUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLvrNodeModule_ProvideBigDecimalUiNodeFactory
    implements Factory<BigDecimalUiNode<?>> {
  private final ProductTotalLvrNodeModule module;

  public ProductTotalLvrNodeModule_ProvideBigDecimalUiNodeFactory(
      ProductTotalLvrNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BigDecimalUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBigDecimalUiNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BigDecimalUiNode<?>> create(ProductTotalLvrNodeModule module) {
    return new ProductTotalLvrNodeModule_ProvideBigDecimalUiNodeFactory(module);
  }

  /** Proxies {@link ProductTotalLvrNodeModule#provideBigDecimalUiNode()}. */
  public static BigDecimalUiNode<?> proxyProvideBigDecimalUiNode(
      ProductTotalLvrNodeModule instance) {
    return instance.provideBigDecimalUiNode();
  }
}
