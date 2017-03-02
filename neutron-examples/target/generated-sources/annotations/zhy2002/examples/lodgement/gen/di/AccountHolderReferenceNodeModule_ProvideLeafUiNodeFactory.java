package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccountHolderReferenceNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final AccountHolderReferenceNodeModule module;

  public AccountHolderReferenceNodeModule_ProvideLeafUiNodeFactory(
      AccountHolderReferenceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(AccountHolderReferenceNodeModule module) {
    return new AccountHolderReferenceNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link AccountHolderReferenceNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(AccountHolderReferenceNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
