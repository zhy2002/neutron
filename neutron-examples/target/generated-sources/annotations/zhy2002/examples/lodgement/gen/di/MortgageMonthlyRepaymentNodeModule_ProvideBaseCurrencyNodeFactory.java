package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageMonthlyRepaymentNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final MortgageMonthlyRepaymentNodeModule module;

  public MortgageMonthlyRepaymentNodeModule_ProvideBaseCurrencyNodeFactory(
      MortgageMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(MortgageMonthlyRepaymentNodeModule module) {
    return new MortgageMonthlyRepaymentNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link MortgageMonthlyRepaymentNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      MortgageMonthlyRepaymentNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
