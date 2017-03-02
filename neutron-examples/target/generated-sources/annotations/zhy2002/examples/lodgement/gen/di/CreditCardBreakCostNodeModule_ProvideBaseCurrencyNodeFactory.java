package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardBreakCostNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final CreditCardBreakCostNodeModule module;

  public CreditCardBreakCostNodeModule_ProvideBaseCurrencyNodeFactory(
      CreditCardBreakCostNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(CreditCardBreakCostNodeModule module) {
    return new CreditCardBreakCostNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link CreditCardBreakCostNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      CreditCardBreakCostNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
