package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLoanLmiAmountNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final ProductTotalLoanLmiAmountNodeModule module;

  public ProductTotalLoanLmiAmountNodeModule_ProvideBaseCurrencyNodeFactory(
      ProductTotalLoanLmiAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(ProductTotalLoanLmiAmountNodeModule module) {
    return new ProductTotalLoanLmiAmountNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link ProductTotalLoanLmiAmountNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      ProductTotalLoanLmiAmountNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
