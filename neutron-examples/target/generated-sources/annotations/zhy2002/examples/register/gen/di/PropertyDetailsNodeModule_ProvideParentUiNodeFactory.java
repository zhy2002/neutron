package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyDetailsNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final PropertyDetailsNodeModule module;

  public PropertyDetailsNodeModule_ProvideParentUiNodeFactory(PropertyDetailsNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(PropertyDetailsNodeModule module) {
    return new PropertyDetailsNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link PropertyDetailsNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(PropertyDetailsNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
