package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCreditCardTypeNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductCreditCardTypeNodeModule module;

  public ProductCreditCardTypeNodeModule_ProvideLeafUiNodeFactory(
      ProductCreditCardTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductCreditCardTypeNodeModule module) {
    return new ProductCreditCardTypeNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductCreditCardTypeNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ProductCreditCardTypeNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
