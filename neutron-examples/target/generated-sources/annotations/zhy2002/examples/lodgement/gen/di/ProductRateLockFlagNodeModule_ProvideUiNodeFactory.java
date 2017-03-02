package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRateLockFlagNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ProductRateLockFlagNodeModule module;

  public ProductRateLockFlagNodeModule_ProvideUiNodeFactory(ProductRateLockFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductRateLockFlagNodeModule module) {
    return new ProductRateLockFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductRateLockFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductRateLockFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
