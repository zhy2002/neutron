package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductExpressConsentFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductExpressConsentFlagNodeModule module;

  public ProductExpressConsentFlagNodeModule_ProvideLeafUiNodeFactory(
      ProductExpressConsentFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductExpressConsentFlagNodeModule module) {
    return new ProductExpressConsentFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductExpressConsentFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      ProductExpressConsentFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
