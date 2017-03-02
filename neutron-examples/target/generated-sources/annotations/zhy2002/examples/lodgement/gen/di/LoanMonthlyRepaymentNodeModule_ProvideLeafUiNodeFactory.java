package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanMonthlyRepaymentNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final LoanMonthlyRepaymentNodeModule module;

  public LoanMonthlyRepaymentNodeModule_ProvideLeafUiNodeFactory(
      LoanMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(LoanMonthlyRepaymentNodeModule module) {
    return new LoanMonthlyRepaymentNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link LoanMonthlyRepaymentNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(LoanMonthlyRepaymentNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
