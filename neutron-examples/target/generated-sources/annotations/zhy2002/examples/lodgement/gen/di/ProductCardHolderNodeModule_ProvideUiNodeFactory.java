package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCardHolderNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ProductCardHolderNodeModule module;

  public ProductCardHolderNodeModule_ProvideUiNodeFactory(ProductCardHolderNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductCardHolderNodeModule module) {
    return new ProductCardHolderNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductCardHolderNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductCardHolderNodeModule instance) {
    return instance.provideUiNode();
  }
}
