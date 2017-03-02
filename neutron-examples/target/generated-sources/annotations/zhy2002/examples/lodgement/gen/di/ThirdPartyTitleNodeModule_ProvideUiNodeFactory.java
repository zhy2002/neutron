package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyTitleNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ThirdPartyTitleNodeModule module;

  public ThirdPartyTitleNodeModule_ProvideUiNodeFactory(ThirdPartyTitleNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ThirdPartyTitleNodeModule module) {
    return new ThirdPartyTitleNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyTitleNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ThirdPartyTitleNodeModule instance) {
    return instance.provideUiNode();
  }
}
