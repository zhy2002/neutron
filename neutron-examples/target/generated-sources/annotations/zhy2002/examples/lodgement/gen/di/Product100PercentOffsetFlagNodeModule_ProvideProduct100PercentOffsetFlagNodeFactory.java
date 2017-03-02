package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.Product100PercentOffsetFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final
class Product100PercentOffsetFlagNodeModule_ProvideProduct100PercentOffsetFlagNodeFactory
    implements Factory<Product100PercentOffsetFlagNode> {
  private final Product100PercentOffsetFlagNodeModule module;

  public Product100PercentOffsetFlagNodeModule_ProvideProduct100PercentOffsetFlagNodeFactory(
      Product100PercentOffsetFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Product100PercentOffsetFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideProduct100PercentOffsetFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Product100PercentOffsetFlagNode> create(
      Product100PercentOffsetFlagNodeModule module) {
    return new Product100PercentOffsetFlagNodeModule_ProvideProduct100PercentOffsetFlagNodeFactory(
        module);
  }

  /**
   * Proxies {@link Product100PercentOffsetFlagNodeModule#provideProduct100PercentOffsetFlagNode()}.
   */
  public static Product100PercentOffsetFlagNode proxyProvideProduct100PercentOffsetFlagNode(
      Product100PercentOffsetFlagNodeModule instance) {
    return instance.provideProduct100PercentOffsetFlagNode();
  }
}
