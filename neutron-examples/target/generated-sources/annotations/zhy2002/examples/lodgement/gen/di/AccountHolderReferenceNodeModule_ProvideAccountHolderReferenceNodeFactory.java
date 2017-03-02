package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AccountHolderReferenceNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccountHolderReferenceNodeModule_ProvideAccountHolderReferenceNodeFactory
    implements Factory<AccountHolderReferenceNode> {
  private final AccountHolderReferenceNodeModule module;

  public AccountHolderReferenceNodeModule_ProvideAccountHolderReferenceNodeFactory(
      AccountHolderReferenceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AccountHolderReferenceNode get() {
    return Preconditions.checkNotNull(
        module.provideAccountHolderReferenceNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AccountHolderReferenceNode> create(
      AccountHolderReferenceNodeModule module) {
    return new AccountHolderReferenceNodeModule_ProvideAccountHolderReferenceNodeFactory(module);
  }

  /** Proxies {@link AccountHolderReferenceNodeModule#provideAccountHolderReferenceNode()}. */
  public static AccountHolderReferenceNode proxyProvideAccountHolderReferenceNode(
      AccountHolderReferenceNodeModule instance) {
    return instance.provideAccountHolderReferenceNode();
  }
}
