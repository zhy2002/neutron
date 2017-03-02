package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PropertyTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyTypeNodeModule_ProvidePropertyTypeNodeFactory
    implements Factory<PropertyTypeNode> {
  private final PropertyTypeNodeModule module;

  public PropertyTypeNodeModule_ProvidePropertyTypeNodeFactory(PropertyTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PropertyTypeNode get() {
    return Preconditions.checkNotNull(
        module.providePropertyTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PropertyTypeNode> create(PropertyTypeNodeModule module) {
    return new PropertyTypeNodeModule_ProvidePropertyTypeNodeFactory(module);
  }

  /** Proxies {@link PropertyTypeNodeModule#providePropertyTypeNode()}. */
  public static PropertyTypeNode proxyProvidePropertyTypeNode(PropertyTypeNodeModule instance) {
    return instance.providePropertyTypeNode();
  }
}
