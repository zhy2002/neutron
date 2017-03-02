package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactTelephoneNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ContactTelephoneNodeModule module;

  public ContactTelephoneNodeModule_ProvideLeafUiNodeFactory(ContactTelephoneNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ContactTelephoneNodeModule module) {
    return new ContactTelephoneNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ContactTelephoneNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ContactTelephoneNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
