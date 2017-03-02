package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OwnershipListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsOwnershipListNodeModule_ProvideOwnershipListNodeFactory
    implements Factory<OwnershipListNode<?>> {
  private final SavingsOwnershipListNodeModule module;

  public SavingsOwnershipListNodeModule_ProvideOwnershipListNodeFactory(
      SavingsOwnershipListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OwnershipListNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideOwnershipListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OwnershipListNode<?>> create(SavingsOwnershipListNodeModule module) {
    return new SavingsOwnershipListNodeModule_ProvideOwnershipListNodeFactory(module);
  }

  /** Proxies {@link SavingsOwnershipListNodeModule#provideOwnershipListNode()}. */
  public static OwnershipListNode<?> proxyProvideOwnershipListNode(
      SavingsOwnershipListNodeModule instance) {
    return instance.provideOwnershipListNode();
  }
}
