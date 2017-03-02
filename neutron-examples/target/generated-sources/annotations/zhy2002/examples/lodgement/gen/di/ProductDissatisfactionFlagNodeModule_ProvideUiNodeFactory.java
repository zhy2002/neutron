package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductDissatisfactionFlagNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ProductDissatisfactionFlagNodeModule module;

  public ProductDissatisfactionFlagNodeModule_ProvideUiNodeFactory(
      ProductDissatisfactionFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductDissatisfactionFlagNodeModule module) {
    return new ProductDissatisfactionFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductDissatisfactionFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductDissatisfactionFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
