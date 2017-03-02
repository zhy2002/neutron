package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ErrorNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ErrorNodeModule module;

  public ErrorNodeModule_ProvideUiNodeFactory(ErrorNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ErrorNodeModule module) {
    return new ErrorNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ErrorNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ErrorNodeModule instance) {
    return instance.provideUiNode();
  }
}
