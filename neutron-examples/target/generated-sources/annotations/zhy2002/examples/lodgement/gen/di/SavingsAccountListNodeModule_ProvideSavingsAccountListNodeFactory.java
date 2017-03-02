package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SavingsAccountListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountListNodeModule_ProvideSavingsAccountListNodeFactory
    implements Factory<SavingsAccountListNode> {
  private final SavingsAccountListNodeModule module;

  public SavingsAccountListNodeModule_ProvideSavingsAccountListNodeFactory(
      SavingsAccountListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SavingsAccountListNode get() {
    return Preconditions.checkNotNull(
        module.provideSavingsAccountListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SavingsAccountListNode> create(SavingsAccountListNodeModule module) {
    return new SavingsAccountListNodeModule_ProvideSavingsAccountListNodeFactory(module);
  }

  /** Proxies {@link SavingsAccountListNodeModule#provideSavingsAccountListNode()}. */
  public static SavingsAccountListNode proxyProvideSavingsAccountListNode(
      SavingsAccountListNodeModule instance) {
    return instance.provideSavingsAccountListNode();
  }
}
