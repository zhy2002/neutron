package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCardHodlerNameNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ProductCardHodlerNameNodeModule module;

  public ProductCardHodlerNameNodeModule_ProvideUiNodeFactory(
      ProductCardHodlerNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductCardHodlerNameNodeModule module) {
    return new ProductCardHodlerNameNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductCardHodlerNameNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductCardHodlerNameNodeModule instance) {
    return instance.provideUiNode();
  }
}
