package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectAccountHolderFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final SelectAccountHolderFlagNodeModule module;

  public SelectAccountHolderFlagNodeModule_ProvideLeafUiNodeFactory(
      SelectAccountHolderFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(SelectAccountHolderFlagNodeModule module) {
    return new SelectAccountHolderFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link SelectAccountHolderFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      SelectAccountHolderFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
