package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgqageUnpaidBalanceNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final MortgqageUnpaidBalanceNodeModule module;

  public MortgqageUnpaidBalanceNodeModule_ProvideLeafUiNodeFactory(
      MortgqageUnpaidBalanceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(MortgqageUnpaidBalanceNodeModule module) {
    return new MortgqageUnpaidBalanceNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link MortgqageUnpaidBalanceNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(MortgqageUnpaidBalanceNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
