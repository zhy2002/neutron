package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductConsolidationFlagNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ProductConsolidationFlagNodeModule module;

  public ProductConsolidationFlagNodeModule_ProvideUiNodeFactory(
      ProductConsolidationFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductConsolidationFlagNodeModule module) {
    return new ProductConsolidationFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductConsolidationFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductConsolidationFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
