package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRequestedAmountNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductRequestedAmountNodeModule module;

  public ProductRequestedAmountNodeModule_ProvideLeafUiNodeFactory(
      ProductRequestedAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductRequestedAmountNodeModule module) {
    return new ProductRequestedAmountNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductRequestedAmountNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ProductRequestedAmountNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
