package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLoanLmiAmountNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ProductTotalLoanLmiAmountNodeModule module;

  public ProductTotalLoanLmiAmountNodeModule_ProvideUiNodeFactory(
      ProductTotalLoanLmiAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductTotalLoanLmiAmountNodeModule module) {
    return new ProductTotalLoanLmiAmountNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductTotalLoanLmiAmountNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductTotalLoanLmiAmountNodeModule instance) {
    return instance.provideUiNode();
  }
}
