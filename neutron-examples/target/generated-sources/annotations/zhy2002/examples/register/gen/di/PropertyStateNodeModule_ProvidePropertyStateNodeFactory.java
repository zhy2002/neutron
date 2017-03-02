package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.PropertyStateNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyStateNodeModule_ProvidePropertyStateNodeFactory
    implements Factory<PropertyStateNode> {
  private final PropertyStateNodeModule module;

  public PropertyStateNodeModule_ProvidePropertyStateNodeFactory(PropertyStateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PropertyStateNode get() {
    return Preconditions.checkNotNull(
        module.providePropertyStateNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PropertyStateNode> create(PropertyStateNodeModule module) {
    return new PropertyStateNodeModule_ProvidePropertyStateNodeFactory(module);
  }

  /** Proxies {@link PropertyStateNodeModule#providePropertyStateNode()}. */
  public static PropertyStateNode proxyProvidePropertyStateNode(PropertyStateNodeModule instance) {
    return instance.providePropertyStateNode();
  }
}
