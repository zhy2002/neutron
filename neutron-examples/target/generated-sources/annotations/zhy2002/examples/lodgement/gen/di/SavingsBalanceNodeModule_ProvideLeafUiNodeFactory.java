package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsBalanceNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final SavingsBalanceNodeModule module;

  public SavingsBalanceNodeModule_ProvideLeafUiNodeFactory(SavingsBalanceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(SavingsBalanceNodeModule module) {
    return new SavingsBalanceNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link SavingsBalanceNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(SavingsBalanceNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
