package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductFeesNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ProductFeesNodeModule module;

  public ProductFeesNodeModule_ProvideUiNodeFactory(ProductFeesNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductFeesNodeModule module) {
    return new ProductFeesNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductFeesNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductFeesNodeModule instance) {
    return instance.provideUiNode();
  }
}
