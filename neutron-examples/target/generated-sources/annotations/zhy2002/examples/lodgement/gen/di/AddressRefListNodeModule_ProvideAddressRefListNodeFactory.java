package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AddressRefListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddressRefListNodeModule_ProvideAddressRefListNodeFactory
    implements Factory<AddressRefListNode> {
  private final AddressRefListNodeModule module;

  public AddressRefListNodeModule_ProvideAddressRefListNodeFactory(
      AddressRefListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AddressRefListNode get() {
    return Preconditions.checkNotNull(
        module.provideAddressRefListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AddressRefListNode> create(AddressRefListNodeModule module) {
    return new AddressRefListNodeModule_ProvideAddressRefListNodeFactory(module);
  }

  /** Proxies {@link AddressRefListNodeModule#provideAddressRefListNode()}. */
  public static AddressRefListNode proxyProvideAddressRefListNode(
      AddressRefListNodeModule instance) {
    return instance.provideAddressRefListNode();
  }
}
