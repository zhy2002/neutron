package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductOptOutReasonNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProductOptOutReasonNodeModule module;

  public ProductOptOutReasonNodeModule_ProvideLeafUiNodeFactory(
      ProductOptOutReasonNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProductOptOutReasonNodeModule module) {
    return new ProductOptOutReasonNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProductOptOutReasonNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ProductOptOutReasonNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
