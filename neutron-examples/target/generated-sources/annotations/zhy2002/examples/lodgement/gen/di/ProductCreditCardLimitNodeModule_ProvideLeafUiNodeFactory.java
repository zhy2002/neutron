package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCreditCardLimitNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductCreditCardLimitNodeModule module;

  public ProductCreditCardLimitNodeModule_ProvideLeafUiNodeFactory(
      ProductCreditCardLimitNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductCreditCardLimitNodeModule module) {
    return new ProductCreditCardLimitNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductCreditCardLimitNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ProductCreditCardLimitNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
