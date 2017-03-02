package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLimitAmountNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final MortgageLimitAmountNodeModule module;

  public MortgageLimitAmountNodeModule_ProvideBaseCurrencyNodeFactory(
      MortgageLimitAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(MortgageLimitAmountNodeModule module) {
    return new MortgageLimitAmountNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link MortgageLimitAmountNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      MortgageLimitAmountNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
