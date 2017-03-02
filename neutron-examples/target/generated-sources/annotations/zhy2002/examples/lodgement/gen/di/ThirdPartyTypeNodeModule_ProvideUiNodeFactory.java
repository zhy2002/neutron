package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyTypeNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ThirdPartyTypeNodeModule module;

  public ThirdPartyTypeNodeModule_ProvideUiNodeFactory(ThirdPartyTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ThirdPartyTypeNodeModule module) {
    return new ThirdPartyTypeNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyTypeNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ThirdPartyTypeNodeModule instance) {
    return instance.provideUiNode();
  }
}
