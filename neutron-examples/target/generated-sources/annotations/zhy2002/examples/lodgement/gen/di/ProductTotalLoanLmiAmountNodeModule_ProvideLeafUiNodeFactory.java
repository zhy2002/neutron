package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLoanLmiAmountNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductTotalLoanLmiAmountNodeModule module;

  public ProductTotalLoanLmiAmountNodeModule_ProvideLeafUiNodeFactory(
      ProductTotalLoanLmiAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductTotalLoanLmiAmountNodeModule module) {
    return new ProductTotalLoanLmiAmountNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductTotalLoanLmiAmountNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      ProductTotalLoanLmiAmountNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}