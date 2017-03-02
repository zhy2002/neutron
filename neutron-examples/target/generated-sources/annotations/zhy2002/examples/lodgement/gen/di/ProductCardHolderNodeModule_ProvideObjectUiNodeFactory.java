package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCardHolderNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final ProductCardHolderNodeModule module;

  public ProductCardHolderNodeModule_ProvideObjectUiNodeFactory(
      ProductCardHolderNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(ProductCardHolderNodeModule module) {
    return new ProductCardHolderNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link ProductCardHolderNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(ProductCardHolderNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
