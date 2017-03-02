package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalAssetNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final TotalAssetNodeModule module;

  public TotalAssetNodeModule_ProvideUiNodeFactory(TotalAssetNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(TotalAssetNodeModule module) {
    return new TotalAssetNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link TotalAssetNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(TotalAssetNodeModule instance) {
    return instance.provideUiNode();
  }
}
