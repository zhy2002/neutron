package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SavingsOwnershipListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsOwnershipListNodeModule_ProvideSavingsOwnershipListNodeFactory
    implements Factory<SavingsOwnershipListNode> {
  private final SavingsOwnershipListNodeModule module;

  public SavingsOwnershipListNodeModule_ProvideSavingsOwnershipListNodeFactory(
      SavingsOwnershipListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SavingsOwnershipListNode get() {
    return Preconditions.checkNotNull(
        module.provideSavingsOwnershipListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SavingsOwnershipListNode> create(SavingsOwnershipListNodeModule module) {
    return new SavingsOwnershipListNodeModule_ProvideSavingsOwnershipListNodeFactory(module);
  }

  /** Proxies {@link SavingsOwnershipListNodeModule#provideSavingsOwnershipListNode()}. */
  public static SavingsOwnershipListNode proxyProvideSavingsOwnershipListNode(
      SavingsOwnershipListNodeModule instance) {
    return instance.provideSavingsOwnershipListNode();
  }
}
