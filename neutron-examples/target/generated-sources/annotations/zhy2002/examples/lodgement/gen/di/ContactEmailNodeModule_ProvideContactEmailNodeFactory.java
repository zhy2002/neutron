package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ContactEmailNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactEmailNodeModule_ProvideContactEmailNodeFactory
    implements Factory<ContactEmailNode> {
  private final ContactEmailNodeModule module;

  public ContactEmailNodeModule_ProvideContactEmailNodeFactory(ContactEmailNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ContactEmailNode get() {
    return Preconditions.checkNotNull(
        module.provideContactEmailNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ContactEmailNode> create(ContactEmailNodeModule module) {
    return new ContactEmailNodeModule_ProvideContactEmailNodeFactory(module);
  }

  /** Proxies {@link ContactEmailNodeModule#provideContactEmailNode()}. */
  public static ContactEmailNode proxyProvideContactEmailNode(ContactEmailNodeModule instance) {
    return instance.provideContactEmailNode();
  }
}
