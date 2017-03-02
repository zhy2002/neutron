package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactLastNameNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final AccessContactLastNameNodeModule module;

  public AccessContactLastNameNodeModule_ProvideUiNodeFactory(
      AccessContactLastNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(AccessContactLastNameNodeModule module) {
    return new AccessContactLastNameNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link AccessContactLastNameNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(AccessContactLastNameNodeModule instance) {
    return instance.provideUiNode();
  }
}
