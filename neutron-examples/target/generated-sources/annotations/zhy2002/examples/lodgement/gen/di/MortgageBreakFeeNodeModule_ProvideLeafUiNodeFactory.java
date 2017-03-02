package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageBreakFeeNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final MortgageBreakFeeNodeModule module;

  public MortgageBreakFeeNodeModule_ProvideLeafUiNodeFactory(MortgageBreakFeeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(MortgageBreakFeeNodeModule module) {
    return new MortgageBreakFeeNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link MortgageBreakFeeNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(MortgageBreakFeeNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
