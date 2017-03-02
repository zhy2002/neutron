package zhy2002.examples.app.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppManagerNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final AppManagerNodeModule module;

  public AppManagerNodeModule_ProvideUiNodeFactory(AppManagerNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(AppManagerNodeModule module) {
    return new AppManagerNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link AppManagerNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(AppManagerNodeModule instance) {
    return instance.provideUiNode();
  }
}
