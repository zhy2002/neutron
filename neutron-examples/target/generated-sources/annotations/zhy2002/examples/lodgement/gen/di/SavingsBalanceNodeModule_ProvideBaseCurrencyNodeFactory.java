package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsBalanceNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final SavingsBalanceNodeModule module;

  public SavingsBalanceNodeModule_ProvideBaseCurrencyNodeFactory(SavingsBalanceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(SavingsBalanceNodeModule module) {
    return new SavingsBalanceNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link SavingsBalanceNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      SavingsBalanceNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
