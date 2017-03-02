package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final SavingsAccountListNodeModule module;

  public SavingsAccountListNodeModule_ProvideParentUiNodeFactory(
      SavingsAccountListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(SavingsAccountListNodeModule module) {
    return new SavingsAccountListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link SavingsAccountListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(SavingsAccountListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
