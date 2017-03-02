package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageMonthlyRepaymentNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final MortgageMonthlyRepaymentNodeModule module;

  public MortgageMonthlyRepaymentNodeModule_ProvideLeafUiNodeFactory(
      MortgageMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(MortgageMonthlyRepaymentNodeModule module) {
    return new MortgageMonthlyRepaymentNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link MortgageMonthlyRepaymentNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      MortgageMonthlyRepaymentNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
