package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ContactAddressNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactAddressNodeModule_ProvideContactAddressNodeFactory
    implements Factory<ContactAddressNode> {
  private final ContactAddressNodeModule module;

  public ContactAddressNodeModule_ProvideContactAddressNodeFactory(
      ContactAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ContactAddressNode get() {
    return Preconditions.checkNotNull(
        module.provideContactAddressNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ContactAddressNode> create(ContactAddressNodeModule module) {
    return new ContactAddressNodeModule_ProvideContactAddressNodeFactory(module);
  }

  /** Proxies {@link ContactAddressNodeModule#provideContactAddressNode()}. */
  public static ContactAddressNode proxyProvideContactAddressNode(
      ContactAddressNodeModule instance) {
    return instance.provideContactAddressNode();
  }
}
