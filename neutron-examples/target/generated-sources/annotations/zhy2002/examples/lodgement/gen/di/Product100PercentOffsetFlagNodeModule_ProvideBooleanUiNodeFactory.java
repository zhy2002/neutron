package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.BooleanUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Product100PercentOffsetFlagNodeModule_ProvideBooleanUiNodeFactory
    implements Factory<BooleanUiNode<?>> {
  private final Product100PercentOffsetFlagNodeModule module;

  public Product100PercentOffsetFlagNodeModule_ProvideBooleanUiNodeFactory(
      Product100PercentOffsetFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BooleanUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBooleanUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BooleanUiNode<?>> create(Product100PercentOffsetFlagNodeModule module) {
    return new Product100PercentOffsetFlagNodeModule_ProvideBooleanUiNodeFactory(module);
  }

  /** Proxies {@link Product100PercentOffsetFlagNodeModule#provideBooleanUiNode()}. */
  public static BooleanUiNode<?> proxyProvideBooleanUiNode(
      Product100PercentOffsetFlagNodeModule instance) {
    return instance.provideBooleanUiNode();
  }
}
