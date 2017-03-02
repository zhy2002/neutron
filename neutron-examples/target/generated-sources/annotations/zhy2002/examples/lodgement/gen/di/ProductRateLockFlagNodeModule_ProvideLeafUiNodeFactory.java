package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRateLockFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductRateLockFlagNodeModule module;

  public ProductRateLockFlagNodeModule_ProvideLeafUiNodeFactory(
      ProductRateLockFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductRateLockFlagNodeModule module) {
    return new ProductRateLockFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductRateLockFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ProductRateLockFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
