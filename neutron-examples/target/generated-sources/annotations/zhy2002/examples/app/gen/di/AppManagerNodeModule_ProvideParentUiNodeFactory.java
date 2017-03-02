package zhy2002.examples.app.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppManagerNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final AppManagerNodeModule module;

  public AppManagerNodeModule_ProvideParentUiNodeFactory(AppManagerNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(AppManagerNodeModule module) {
    return new AppManagerNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link AppManagerNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(AppManagerNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
