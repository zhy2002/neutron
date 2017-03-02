package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardAmountOwingNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final CreditCardAmountOwingNodeModule module;

  public CreditCardAmountOwingNodeModule_ProvideBaseCurrencyNodeFactory(
      CreditCardAmountOwingNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(CreditCardAmountOwingNodeModule module) {
    return new CreditCardAmountOwingNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link CreditCardAmountOwingNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      CreditCardAmountOwingNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
