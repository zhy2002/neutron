package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRequestedAmountNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ProductRequestedAmountNodeModule module;

  public ProductRequestedAmountNodeModule_ProvideUiNodeFactory(
      ProductRequestedAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductRequestedAmountNodeModule module) {
    return new ProductRequestedAmountNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductRequestedAmountNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductRequestedAmountNodeModule instance) {
    return instance.provideUiNode();
  }
}
