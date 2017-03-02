package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageMonthlyRepaymentNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final MortgageMonthlyRepaymentNodeModule module;

  public MortgageMonthlyRepaymentNodeModule_ProvideUiNodeFactory(
      MortgageMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(MortgageMonthlyRepaymentNodeModule module) {
    return new MortgageMonthlyRepaymentNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link MortgageMonthlyRepaymentNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(MortgageMonthlyRepaymentNodeModule instance) {
    return instance.provideUiNode();
  }
}
