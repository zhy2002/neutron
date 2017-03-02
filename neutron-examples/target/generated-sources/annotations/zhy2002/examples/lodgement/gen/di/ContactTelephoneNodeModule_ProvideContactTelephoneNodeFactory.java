package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ContactTelephoneNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactTelephoneNodeModule_ProvideContactTelephoneNodeFactory
    implements Factory<ContactTelephoneNode> {
  private final ContactTelephoneNodeModule module;

  public ContactTelephoneNodeModule_ProvideContactTelephoneNodeFactory(
      ContactTelephoneNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ContactTelephoneNode get() {
    return Preconditions.checkNotNull(
        module.provideContactTelephoneNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ContactTelephoneNode> create(ContactTelephoneNodeModule module) {
    return new ContactTelephoneNodeModule_ProvideContactTelephoneNodeFactory(module);
  }

  /** Proxies {@link ContactTelephoneNodeModule#provideContactTelephoneNode()}. */
  public static ContactTelephoneNode proxyProvideContactTelephoneNode(
      ContactTelephoneNodeModule instance) {
    return instance.provideContactTelephoneNode();
  }
}
