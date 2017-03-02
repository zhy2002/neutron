package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactTelephoneNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ContactTelephoneNodeModule module;

  public ContactTelephoneNodeModule_ProvideUiNodeFactory(ContactTelephoneNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ContactTelephoneNodeModule module) {
    return new ContactTelephoneNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ContactTelephoneNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ContactTelephoneNodeModule instance) {
    return instance.provideUiNode();
  }
}
