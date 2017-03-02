package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanMonthlyRepaymentNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final LoanMonthlyRepaymentNodeModule module;

  public LoanMonthlyRepaymentNodeModule_ProvideBaseCurrencyNodeFactory(
      LoanMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(LoanMonthlyRepaymentNodeModule module) {
    return new LoanMonthlyRepaymentNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link LoanMonthlyRepaymentNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      LoanMonthlyRepaymentNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
