package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductFixedTermNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ProductFixedTermNodeModule module;

  public ProductFixedTermNodeModule_ProvideUiNodeFactory(ProductFixedTermNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductFixedTermNodeModule module) {
    return new ProductFixedTermNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductFixedTermNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductFixedTermNodeModule instance) {
    return instance.provideUiNode();
  }
}
