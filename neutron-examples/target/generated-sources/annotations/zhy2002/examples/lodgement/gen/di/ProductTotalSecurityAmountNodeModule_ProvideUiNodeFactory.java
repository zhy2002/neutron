package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalSecurityAmountNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ProductTotalSecurityAmountNodeModule module;

  public ProductTotalSecurityAmountNodeModule_ProvideUiNodeFactory(
      ProductTotalSecurityAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductTotalSecurityAmountNodeModule module) {
    return new ProductTotalSecurityAmountNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductTotalSecurityAmountNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductTotalSecurityAmountNodeModule instance) {
    return instance.provideUiNode();
  }
}
