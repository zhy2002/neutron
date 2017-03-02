package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnedOutrightFlagNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final OwnedOutrightFlagNodeModule module;

  public OwnedOutrightFlagNodeModule_ProvideUiNodeFactory(OwnedOutrightFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(OwnedOutrightFlagNodeModule module) {
    return new OwnedOutrightFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link OwnedOutrightFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(OwnedOutrightFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
