package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.EmailNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactEmailNodeModule_ProvideEmailNodeFactory implements Factory<EmailNode<?>> {
  private final ContactEmailNodeModule module;

  public ContactEmailNodeModule_ProvideEmailNodeFactory(ContactEmailNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public EmailNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideEmailNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EmailNode<?>> create(ContactEmailNodeModule module) {
    return new ContactEmailNodeModule_ProvideEmailNodeFactory(module);
  }

  /** Proxies {@link ContactEmailNodeModule#provideEmailNode()}. */
  public static EmailNode<?> proxyProvideEmailNode(ContactEmailNodeModule instance) {
    return instance.provideEmailNode();
  }
}
