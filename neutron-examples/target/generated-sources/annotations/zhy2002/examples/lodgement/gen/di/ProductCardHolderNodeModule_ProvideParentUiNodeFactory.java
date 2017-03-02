package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCardHolderNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final ProductCardHolderNodeModule module;

  public ProductCardHolderNodeModule_ProvideParentUiNodeFactory(
      ProductCardHolderNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(ProductCardHolderNodeModule module) {
    return new ProductCardHolderNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link ProductCardHolderNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(ProductCardHolderNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
