package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.PropertyDetailsNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyDetailsNodeModule_ProvidePropertyDetailsNodeFactory
    implements Factory<PropertyDetailsNode> {
  private final PropertyDetailsNodeModule module;

  public PropertyDetailsNodeModule_ProvidePropertyDetailsNodeFactory(
      PropertyDetailsNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PropertyDetailsNode get() {
    return Preconditions.checkNotNull(
        module.providePropertyDetailsNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PropertyDetailsNode> create(PropertyDetailsNodeModule module) {
    return new PropertyDetailsNodeModule_ProvidePropertyDetailsNodeFactory(module);
  }

  /** Proxies {@link PropertyDetailsNodeModule#providePropertyDetailsNode()}. */
  public static PropertyDetailsNode proxyProvidePropertyDetailsNode(
      PropertyDetailsNodeModule instance) {
    return instance.providePropertyDetailsNode();
  }
}
