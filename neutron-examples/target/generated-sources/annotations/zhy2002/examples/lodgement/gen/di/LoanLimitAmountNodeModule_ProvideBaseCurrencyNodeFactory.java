package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanLimitAmountNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final LoanLimitAmountNodeModule module;

  public LoanLimitAmountNodeModule_ProvideBaseCurrencyNodeFactory(
      LoanLimitAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(LoanLimitAmountNodeModule module) {
    return new LoanLimitAmountNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link LoanLimitAmountNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      LoanLimitAmountNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
