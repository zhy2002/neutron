package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SettlementDateNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final SettlementDateNodeModule module;

  public SettlementDateNodeModule_ProvideLeafUiNodeFactory(SettlementDateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(SettlementDateNodeModule module) {
    return new SettlementDateNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link SettlementDateNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(SettlementDateNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
