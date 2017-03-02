package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectAccountHolderNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final SelectAccountHolderNodeModule module;

  public SelectAccountHolderNodeModule_ProvideParentUiNodeFactory(
      SelectAccountHolderNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(SelectAccountHolderNodeModule module) {
    return new SelectAccountHolderNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link SelectAccountHolderNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(SelectAccountHolderNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
