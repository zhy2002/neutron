package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgqageUnpaidBalanceNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final MortgqageUnpaidBalanceNodeModule module;

  public MortgqageUnpaidBalanceNodeModule_ProvideBaseCurrencyNodeFactory(
      MortgqageUnpaidBalanceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(MortgqageUnpaidBalanceNodeModule module) {
    return new MortgqageUnpaidBalanceNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link MortgqageUnpaidBalanceNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      MortgqageUnpaidBalanceNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
