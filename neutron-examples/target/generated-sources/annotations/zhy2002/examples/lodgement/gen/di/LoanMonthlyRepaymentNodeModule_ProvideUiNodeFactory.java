package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanMonthlyRepaymentNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final LoanMonthlyRepaymentNodeModule module;

  public LoanMonthlyRepaymentNodeModule_ProvideUiNodeFactory(
      LoanMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(LoanMonthlyRepaymentNodeModule module) {
    return new LoanMonthlyRepaymentNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link LoanMonthlyRepaymentNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(LoanMonthlyRepaymentNodeModule instance) {
    return instance.provideUiNode();
  }
}
