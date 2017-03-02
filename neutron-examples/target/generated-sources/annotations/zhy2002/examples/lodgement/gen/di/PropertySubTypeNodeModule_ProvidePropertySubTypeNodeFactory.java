package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PropertySubTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertySubTypeNodeModule_ProvidePropertySubTypeNodeFactory
    implements Factory<PropertySubTypeNode> {
  private final PropertySubTypeNodeModule module;

  public PropertySubTypeNodeModule_ProvidePropertySubTypeNodeFactory(
      PropertySubTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PropertySubTypeNode get() {
    return Preconditions.checkNotNull(
        module.providePropertySubTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PropertySubTypeNode> create(PropertySubTypeNodeModule module) {
    return new PropertySubTypeNodeModule_ProvidePropertySubTypeNodeFactory(module);
  }

  /** Proxies {@link PropertySubTypeNodeModule#providePropertySubTypeNode()}. */
  public static PropertySubTypeNode proxyProvidePropertySubTypeNode(
      PropertySubTypeNodeModule instance) {
    return instance.providePropertySubTypeNode();
  }
}
