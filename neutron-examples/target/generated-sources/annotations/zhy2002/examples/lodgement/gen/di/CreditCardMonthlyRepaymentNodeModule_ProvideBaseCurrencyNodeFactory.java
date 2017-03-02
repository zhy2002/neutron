package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardMonthlyRepaymentNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final CreditCardMonthlyRepaymentNodeModule module;

  public CreditCardMonthlyRepaymentNodeModule_ProvideBaseCurrencyNodeFactory(
      CreditCardMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(CreditCardMonthlyRepaymentNodeModule module) {
    return new CreditCardMonthlyRepaymentNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link CreditCardMonthlyRepaymentNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      CreditCardMonthlyRepaymentNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
