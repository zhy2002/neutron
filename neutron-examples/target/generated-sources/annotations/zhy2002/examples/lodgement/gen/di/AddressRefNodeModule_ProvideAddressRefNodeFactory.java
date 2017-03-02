package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AddressRefNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddressRefNodeModule_ProvideAddressRefNodeFactory
    implements Factory<AddressRefNode> {
  private final AddressRefNodeModule module;

  public AddressRefNodeModule_ProvideAddressRefNodeFactory(AddressRefNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AddressRefNode get() {
    return Preconditions.checkNotNull(
        module.provideAddressRefNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AddressRefNode> create(AddressRefNodeModule module) {
    return new AddressRefNodeModule_ProvideAddressRefNodeFactory(module);
  }

  /** Proxies {@link AddressRefNodeModule#provideAddressRefNode()}. */
  public static AddressRefNode proxyProvideAddressRefNode(AddressRefNodeModule instance) {
    return instance.provideAddressRefNode();
  }
}
