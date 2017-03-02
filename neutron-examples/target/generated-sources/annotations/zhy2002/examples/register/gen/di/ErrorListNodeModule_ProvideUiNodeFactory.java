package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ErrorListNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ErrorListNodeModule module;

  public ErrorListNodeModule_ProvideUiNodeFactory(ErrorListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ErrorListNodeModule module) {
    return new ErrorListNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ErrorListNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ErrorListNodeModule instance) {
    return instance.provideUiNode();
  }
}