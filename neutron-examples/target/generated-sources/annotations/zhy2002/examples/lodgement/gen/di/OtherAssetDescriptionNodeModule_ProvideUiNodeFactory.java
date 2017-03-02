package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetDescriptionNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final OtherAssetDescriptionNodeModule module;

  public OtherAssetDescriptionNodeModule_ProvideUiNodeFactory(
      OtherAssetDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(OtherAssetDescriptionNodeModule module) {
    return new OtherAssetDescriptionNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link OtherAssetDescriptionNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(OtherAssetDescriptionNodeModule instance) {
    return instance.provideUiNode();
  }
}
