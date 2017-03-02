package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.BooleanUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectAccountHolderFlagNodeModule_ProvideBooleanUiNodeFactory
    implements Factory<BooleanUiNode<?>> {
  private final SelectAccountHolderFlagNodeModule module;

  public SelectAccountHolderFlagNodeModule_ProvideBooleanUiNodeFactory(
      SelectAccountHolderFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BooleanUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBooleanUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BooleanUiNode<?>> create(SelectAccountHolderFlagNodeModule module) {
    return new SelectAccountHolderFlagNodeModule_ProvideBooleanUiNodeFactory(module);
  }

  /** Proxies {@link SelectAccountHolderFlagNodeModule#provideBooleanUiNode()}. */
  public static BooleanUiNode<?> proxyProvideBooleanUiNode(
      SelectAccountHolderFlagNodeModule instance) {
    return instance.provideBooleanUiNode();
  }
}
