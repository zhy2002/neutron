package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeAmountNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final OtherIncomeAmountNodeModule module;

  public OtherIncomeAmountNodeModule_ProvideBaseCurrencyNodeFactory(
      OtherIncomeAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(OtherIncomeAmountNodeModule module) {
    return new OtherIncomeAmountNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link OtherIncomeAmountNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      OtherIncomeAmountNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
