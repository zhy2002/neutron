package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PropertyAddressNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyAddressNodeModule_ProvidePropertyAddressNodeFactory
    implements Factory<PropertyAddressNode> {
  private final PropertyAddressNodeModule module;

  public PropertyAddressNodeModule_ProvidePropertyAddressNodeFactory(
      PropertyAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PropertyAddressNode get() {
    return Preconditions.checkNotNull(
        module.providePropertyAddressNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PropertyAddressNode> create(PropertyAddressNodeModule module) {
    return new PropertyAddressNodeModule_ProvidePropertyAddressNodeFactory(module);
  }

  /** Proxies {@link PropertyAddressNodeModule#providePropertyAddressNode()}. */
  public static PropertyAddressNode proxyProvidePropertyAddressNode(
      PropertyAddressNodeModule instance) {
    return instance.providePropertyAddressNode();
  }
}
