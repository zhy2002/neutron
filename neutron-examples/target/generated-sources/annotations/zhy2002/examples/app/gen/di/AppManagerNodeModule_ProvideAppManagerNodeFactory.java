package zhy2002.examples.app.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.app.gen.node.AppManagerNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppManagerNodeModule_ProvideAppManagerNodeFactory
    implements Factory<AppManagerNode> {
  private final AppManagerNodeModule module;

  public AppManagerNodeModule_ProvideAppManagerNodeFactory(AppManagerNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AppManagerNode get() {
    return Preconditions.checkNotNull(
        module.provideAppManagerNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AppManagerNode> create(AppManagerNodeModule module) {
    return new AppManagerNodeModule_ProvideAppManagerNodeFactory(module);
  }

  /** Proxies {@link AppManagerNodeModule#provideAppManagerNode()}. */
  public static AppManagerNode proxyProvideAppManagerNode(AppManagerNodeModule instance) {
    return instance.provideAppManagerNode();
  }
}
