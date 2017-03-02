package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductPackageNameNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ProductPackageNameNodeModule module;

  public ProductPackageNameNodeModule_ProvideUiNodeFactory(ProductPackageNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductPackageNameNodeModule module) {
    return new ProductPackageNameNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductPackageNameNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductPackageNameNodeModule instance) {
    return instance.provideUiNode();
  }
}
