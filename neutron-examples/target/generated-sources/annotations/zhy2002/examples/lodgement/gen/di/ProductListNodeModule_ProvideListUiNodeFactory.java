package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final ProductListNodeModule module;

  public ProductListNodeModule_ProvideListUiNodeFactory(ProductListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(ProductListNodeModule module) {
    return new ProductListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link ProductListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(ProductListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
