package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsernameNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final UsernameNodeModule module;

  public UsernameNodeModule_ProvideUiNodeFactory(UsernameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(UsernameNodeModule module) {
    return new UsernameNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link UsernameNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(UsernameNodeModule instance) {
    return instance.provideUiNode();
  }
}
