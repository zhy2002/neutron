package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Product100PercentOffsetFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final Product100PercentOffsetFlagNodeModule module;

  public Product100PercentOffsetFlagNodeModule_ProvideLeafUiNodeFactory(
      Product100PercentOffsetFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(Product100PercentOffsetFlagNodeModule module) {
    return new Product100PercentOffsetFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link Product100PercentOffsetFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      Product100PercentOffsetFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
