package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductConsolidationFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductConsolidationFlagNodeModule module;

  public ProductConsolidationFlagNodeModule_ProvideLeafUiNodeFactory(
      ProductConsolidationFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductConsolidationFlagNodeModule module) {
    return new ProductConsolidationFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductConsolidationFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      ProductConsolidationFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
