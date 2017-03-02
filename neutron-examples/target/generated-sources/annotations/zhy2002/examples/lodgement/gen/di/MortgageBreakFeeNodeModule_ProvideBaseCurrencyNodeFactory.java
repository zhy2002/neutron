package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageBreakFeeNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final MortgageBreakFeeNodeModule module;

  public MortgageBreakFeeNodeModule_ProvideBaseCurrencyNodeFactory(
      MortgageBreakFeeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(MortgageBreakFeeNodeModule module) {
    return new MortgageBreakFeeNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link MortgageBreakFeeNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      MortgageBreakFeeNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
