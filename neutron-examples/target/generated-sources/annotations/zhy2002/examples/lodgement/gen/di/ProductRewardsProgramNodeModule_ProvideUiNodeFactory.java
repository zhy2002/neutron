package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRewardsProgramNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ProductRewardsProgramNodeModule module;

  public ProductRewardsProgramNodeModule_ProvideUiNodeFactory(
      ProductRewardsProgramNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductRewardsProgramNodeModule module) {
    return new ProductRewardsProgramNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductRewardsProgramNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductRewardsProgramNodeModule instance) {
    return instance.provideUiNode();
  }
}
