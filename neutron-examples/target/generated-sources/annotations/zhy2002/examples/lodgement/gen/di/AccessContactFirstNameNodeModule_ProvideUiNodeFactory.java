package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactFirstNameNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final AccessContactFirstNameNodeModule module;

  public AccessContactFirstNameNodeModule_ProvideUiNodeFactory(
      AccessContactFirstNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(AccessContactFirstNameNodeModule module) {
    return new AccessContactFirstNameNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link AccessContactFirstNameNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(AccessContactFirstNameNodeModule instance) {
    return instance.provideUiNode();
  }
}
