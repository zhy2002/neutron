package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLvrNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ProductTotalLvrNodeModule module;

  public ProductTotalLvrNodeModule_ProvideUiNodeFactory(ProductTotalLvrNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductTotalLvrNodeModule module) {
    return new ProductTotalLvrNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductTotalLvrNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductTotalLvrNodeModule instance) {
    return instance.provideUiNode();
  }
}
