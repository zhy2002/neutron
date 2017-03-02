package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyDobNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ThirdPartyDobNodeModule module;

  public ThirdPartyDobNodeModule_ProvideUiNodeFactory(ThirdPartyDobNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ThirdPartyDobNodeModule module) {
    return new ThirdPartyDobNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyDobNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ThirdPartyDobNodeModule instance) {
    return instance.provideUiNode();
  }
}
