package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductFeaturesNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final ProductFeaturesNodeModule module;

  public ProductFeaturesNodeModule_ProvideObjectUiNodeFactory(ProductFeaturesNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(ProductFeaturesNodeModule module) {
    return new ProductFeaturesNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link ProductFeaturesNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(ProductFeaturesNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}