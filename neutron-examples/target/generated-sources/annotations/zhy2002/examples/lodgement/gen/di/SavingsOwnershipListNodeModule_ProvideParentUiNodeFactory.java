package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsOwnershipListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final SavingsOwnershipListNodeModule module;

  public SavingsOwnershipListNodeModule_ProvideParentUiNodeFactory(
      SavingsOwnershipListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(SavingsOwnershipListNodeModule module) {
    return new SavingsOwnershipListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link SavingsOwnershipListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(SavingsOwnershipListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
