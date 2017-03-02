package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductFeaturesNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final ProductFeaturesNodeModule module;

  public ProductFeaturesNodeModule_ProvideParentUiNodeFactory(ProductFeaturesNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(ProductFeaturesNodeModule module) {
    return new ProductFeaturesNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link ProductFeaturesNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(ProductFeaturesNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
