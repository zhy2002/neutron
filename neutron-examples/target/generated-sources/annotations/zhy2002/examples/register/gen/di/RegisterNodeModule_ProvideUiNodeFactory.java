package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final RegisterNodeModule module;

  public RegisterNodeModule_ProvideUiNodeFactory(RegisterNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(RegisterNodeModule module) {
    return new RegisterNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link RegisterNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(RegisterNodeModule instance) {
    return instance.provideUiNode();
  }
}
