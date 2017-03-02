package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyDetailsNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final PropertyDetailsNodeModule module;

  public PropertyDetailsNodeModule_ProvideObjectUiNodeFactory(PropertyDetailsNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(PropertyDetailsNodeModule module) {
    return new PropertyDetailsNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link PropertyDetailsNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(PropertyDetailsNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
