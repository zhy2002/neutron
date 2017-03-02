package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PropertyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyNodeModule_ProvidePropertyNodeFactory implements Factory<PropertyNode> {
  private final PropertyNodeModule module;

  public PropertyNodeModule_ProvidePropertyNodeFactory(PropertyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PropertyNode get() {
    return Preconditions.checkNotNull(
        module.providePropertyNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PropertyNode> create(PropertyNodeModule module) {
    return new PropertyNodeModule_ProvidePropertyNodeFactory(module);
  }

  /** Proxies {@link PropertyNodeModule#providePropertyNode()}. */
  public static PropertyNode proxyProvidePropertyNode(PropertyNodeModule instance) {
    return instance.providePropertyNode();
  }
}
