package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductPaymentTypeNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductPaymentTypeNodeModule module;

  public ProductPaymentTypeNodeModule_ProvideLeafUiNodeFactory(
      ProductPaymentTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductPaymentTypeNodeModule module) {
    return new ProductPaymentTypeNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductPaymentTypeNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ProductPaymentTypeNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
