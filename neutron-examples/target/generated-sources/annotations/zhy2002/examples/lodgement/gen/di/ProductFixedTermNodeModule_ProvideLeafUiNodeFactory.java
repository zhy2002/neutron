package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductFixedTermNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductFixedTermNodeModule module;

  public ProductFixedTermNodeModule_ProvideLeafUiNodeFactory(ProductFixedTermNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductFixedTermNodeModule module) {
    return new ProductFixedTermNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductFixedTermNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ProductFixedTermNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
