package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLvrLmiNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ProductTotalLvrLmiNodeModule module;

  public ProductTotalLvrLmiNodeModule_ProvideUiNodeFactory(ProductTotalLvrLmiNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductTotalLvrLmiNodeModule module) {
    return new ProductTotalLvrLmiNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductTotalLvrLmiNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductTotalLvrLmiNodeModule instance) {
    return instance.provideUiNode();
  }
}
