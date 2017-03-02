package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageClearingFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final MortgageClearingFlagNodeModule module;

  public MortgageClearingFlagNodeModule_ProvideLeafUiNodeFactory(
      MortgageClearingFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(MortgageClearingFlagNodeModule module) {
    return new MortgageClearingFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link MortgageClearingFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(MortgageClearingFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
