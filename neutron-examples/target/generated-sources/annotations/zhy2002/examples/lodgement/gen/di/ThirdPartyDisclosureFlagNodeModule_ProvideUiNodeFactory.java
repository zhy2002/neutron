package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyDisclosureFlagNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ThirdPartyDisclosureFlagNodeModule module;

  public ThirdPartyDisclosureFlagNodeModule_ProvideUiNodeFactory(
      ThirdPartyDisclosureFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ThirdPartyDisclosureFlagNodeModule module) {
    return new ThirdPartyDisclosureFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyDisclosureFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ThirdPartyDisclosureFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
