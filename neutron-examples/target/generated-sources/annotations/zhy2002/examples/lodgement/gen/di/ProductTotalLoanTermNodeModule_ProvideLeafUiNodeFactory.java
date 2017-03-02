package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLoanTermNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductTotalLoanTermNodeModule module;

  public ProductTotalLoanTermNodeModule_ProvideLeafUiNodeFactory(
      ProductTotalLoanTermNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductTotalLoanTermNodeModule module) {
    return new ProductTotalLoanTermNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductTotalLoanTermNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ProductTotalLoanTermNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
