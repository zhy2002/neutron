package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactEmailNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ContactEmailNodeModule module;

  public ContactEmailNodeModule_ProvideUiNodeFactory(ContactEmailNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ContactEmailNodeModule module) {
    return new ContactEmailNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ContactEmailNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ContactEmailNodeModule instance) {
    return instance.provideUiNode();
  }
}
