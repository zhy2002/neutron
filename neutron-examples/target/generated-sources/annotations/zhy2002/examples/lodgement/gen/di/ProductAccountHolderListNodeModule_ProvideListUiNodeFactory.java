package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductAccountHolderListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final ProductAccountHolderListNodeModule module;

  public ProductAccountHolderListNodeModule_ProvideListUiNodeFactory(
      ProductAccountHolderListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(ProductAccountHolderListNodeModule module) {
    return new ProductAccountHolderListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link ProductAccountHolderListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(
      ProductAccountHolderListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
