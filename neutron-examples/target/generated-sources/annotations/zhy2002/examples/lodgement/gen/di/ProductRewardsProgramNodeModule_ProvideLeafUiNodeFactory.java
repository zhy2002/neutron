package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRewardsProgramNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductRewardsProgramNodeModule module;

  public ProductRewardsProgramNodeModule_ProvideLeafUiNodeFactory(
      ProductRewardsProgramNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductRewardsProgramNodeModule module) {
    return new ProductRewardsProgramNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductRewardsProgramNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ProductRewardsProgramNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}