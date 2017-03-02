package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TelephoneNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactTelephoneNodeModule_ProvideTelephoneNodeFactory
    implements Factory<TelephoneNode<?>> {
  private final ContactTelephoneNodeModule module;

  public ContactTelephoneNodeModule_ProvideTelephoneNodeFactory(ContactTelephoneNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TelephoneNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideTelephoneNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TelephoneNode<?>> create(ContactTelephoneNodeModule module) {
    return new ContactTelephoneNodeModule_ProvideTelephoneNodeFactory(module);
  }

  /** Proxies {@link ContactTelephoneNodeModule#provideTelephoneNode()}. */
  public static TelephoneNode<?> proxyProvideTelephoneNode(ContactTelephoneNodeModule instance) {
    return instance.provideTelephoneNode();
  }
}
