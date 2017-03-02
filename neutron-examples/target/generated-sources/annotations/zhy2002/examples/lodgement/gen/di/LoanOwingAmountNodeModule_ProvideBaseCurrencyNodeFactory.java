package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanOwingAmountNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final LoanOwingAmountNodeModule module;

  public LoanOwingAmountNodeModule_ProvideBaseCurrencyNodeFactory(
      LoanOwingAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(LoanOwingAmountNodeModule module) {
    return new LoanOwingAmountNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link LoanOwingAmountNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      LoanOwingAmountNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
