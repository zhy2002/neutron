package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanBreakCostNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final LoanBreakCostNodeModule module;

  public LoanBreakCostNodeModule_ProvideBaseCurrencyNodeFactory(LoanBreakCostNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(LoanBreakCostNodeModule module) {
    return new LoanBreakCostNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link LoanBreakCostNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(LoanBreakCostNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
