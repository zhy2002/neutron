package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductAccountHolderListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final ProductAccountHolderListNodeModule module;

  public ProductAccountHolderListNodeModule_ProvideParentUiNodeFactory(
      ProductAccountHolderListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(ProductAccountHolderListNodeModule module) {
    return new ProductAccountHolderListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link ProductAccountHolderListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(
      ProductAccountHolderListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
