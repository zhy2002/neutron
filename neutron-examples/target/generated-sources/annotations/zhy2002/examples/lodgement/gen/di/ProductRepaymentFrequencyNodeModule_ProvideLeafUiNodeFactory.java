package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRepaymentFrequencyNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductRepaymentFrequencyNodeModule module;

  public ProductRepaymentFrequencyNodeModule_ProvideLeafUiNodeFactory(
      ProductRepaymentFrequencyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductRepaymentFrequencyNodeModule module) {
    return new ProductRepaymentFrequencyNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductRepaymentFrequencyNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      ProductRepaymentFrequencyNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
