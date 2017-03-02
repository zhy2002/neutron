package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLoanAmountNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final ProductTotalLoanAmountNodeModule module;

  public ProductTotalLoanAmountNodeModule_ProvideBaseCurrencyNodeFactory(
      ProductTotalLoanAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(ProductTotalLoanAmountNodeModule module) {
    return new ProductTotalLoanAmountNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link ProductTotalLoanAmountNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      ProductTotalLoanAmountNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
