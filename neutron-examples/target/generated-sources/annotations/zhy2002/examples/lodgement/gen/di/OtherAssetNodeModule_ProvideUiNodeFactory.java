package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final OtherAssetNodeModule module;

  public OtherAssetNodeModule_ProvideUiNodeFactory(OtherAssetNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(OtherAssetNodeModule module) {
    return new OtherAssetNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link OtherAssetNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(OtherAssetNodeModule instance) {
    return instance.provideUiNode();
  }
}
