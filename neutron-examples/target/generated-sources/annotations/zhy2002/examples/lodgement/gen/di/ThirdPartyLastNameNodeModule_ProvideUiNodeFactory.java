package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyLastNameNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ThirdPartyLastNameNodeModule module;

  public ThirdPartyLastNameNodeModule_ProvideUiNodeFactory(ThirdPartyLastNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ThirdPartyLastNameNodeModule module) {
    return new ThirdPartyLastNameNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyLastNameNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ThirdPartyLastNameNodeModule instance) {
    return instance.provideUiNode();
  }
}
