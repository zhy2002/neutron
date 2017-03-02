package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final ProductNodeModule module;

  public ProductNodeModule_ProvideParentUiNodeFactory(ProductNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(ProductNodeModule module) {
    return new ProductNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link ProductNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(ProductNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
