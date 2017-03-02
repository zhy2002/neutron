package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTransactionAccountFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductTransactionAccountFlagNodeModule module;

  public ProductTransactionAccountFlagNodeModule_ProvideLeafUiNodeFactory(
      ProductTransactionAccountFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductTransactionAccountFlagNodeModule module) {
    return new ProductTransactionAccountFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductTransactionAccountFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      ProductTransactionAccountFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
