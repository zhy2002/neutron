package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AddressNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyAddressNodeModule_ProvideAddressNodeFactory
    implements Factory<AddressNode<?>> {
  private final PropertyAddressNodeModule module;

  public PropertyAddressNodeModule_ProvideAddressNodeFactory(PropertyAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AddressNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideAddressNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AddressNode<?>> create(PropertyAddressNodeModule module) {
    return new PropertyAddressNodeModule_ProvideAddressNodeFactory(module);
  }

  /** Proxies {@link PropertyAddressNodeModule#provideAddressNode()}. */
  public static AddressNode<?> proxyProvideAddressNode(PropertyAddressNodeModule instance) {
    return instance.provideAddressNode();
  }
}
