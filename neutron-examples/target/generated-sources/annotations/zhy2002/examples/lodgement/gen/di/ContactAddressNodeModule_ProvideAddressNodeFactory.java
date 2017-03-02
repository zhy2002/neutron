package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AddressNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactAddressNodeModule_ProvideAddressNodeFactory
    implements Factory<AddressNode<?>> {
  private final ContactAddressNodeModule module;

  public ContactAddressNodeModule_ProvideAddressNodeFactory(ContactAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AddressNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideAddressNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AddressNode<?>> create(ContactAddressNodeModule module) {
    return new ContactAddressNodeModule_ProvideAddressNodeFactory(module);
  }

  /** Proxies {@link ContactAddressNodeModule#provideAddressNode()}. */
  public static AddressNode<?> proxyProvideAddressNode(ContactAddressNodeModule instance) {
    return instance.provideAddressNode();
  }
}
