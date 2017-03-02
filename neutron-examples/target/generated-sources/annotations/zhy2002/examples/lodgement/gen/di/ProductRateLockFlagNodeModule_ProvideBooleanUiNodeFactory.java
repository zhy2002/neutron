package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.BooleanUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRateLockFlagNodeModule_ProvideBooleanUiNodeFactory
    implements Factory<BooleanUiNode<?>> {
  private final ProductRateLockFlagNodeModule module;

  public ProductRateLockFlagNodeModule_ProvideBooleanUiNodeFactory(
      ProductRateLockFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BooleanUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBooleanUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BooleanUiNode<?>> create(ProductRateLockFlagNodeModule module) {
    return new ProductRateLockFlagNodeModule_ProvideBooleanUiNodeFactory(module);
  }

  /** Proxies {@link ProductRateLockFlagNodeModule#provideBooleanUiNode()}. */
  public static BooleanUiNode<?> proxyProvideBooleanUiNode(ProductRateLockFlagNodeModule instance) {
    return instance.provideBooleanUiNode();
  }
}
