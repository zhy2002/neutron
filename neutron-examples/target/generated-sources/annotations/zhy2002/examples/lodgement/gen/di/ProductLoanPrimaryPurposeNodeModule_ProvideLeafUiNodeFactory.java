package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductLoanPrimaryPurposeNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductLoanPrimaryPurposeNodeModule module;

  public ProductLoanPrimaryPurposeNodeModule_ProvideLeafUiNodeFactory(
      ProductLoanPrimaryPurposeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductLoanPrimaryPurposeNodeModule module) {
    return new ProductLoanPrimaryPurposeNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductLoanPrimaryPurposeNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      ProductLoanPrimaryPurposeNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
