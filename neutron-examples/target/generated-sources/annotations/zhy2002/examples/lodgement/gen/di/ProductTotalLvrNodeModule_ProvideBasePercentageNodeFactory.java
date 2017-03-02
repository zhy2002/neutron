package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BasePercentageNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLvrNodeModule_ProvideBasePercentageNodeFactory
    implements Factory<BasePercentageNode<?>> {
  private final ProductTotalLvrNodeModule module;

  public ProductTotalLvrNodeModule_ProvideBasePercentageNodeFactory(
      ProductTotalLvrNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BasePercentageNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBasePercentageNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BasePercentageNode<?>> create(ProductTotalLvrNodeModule module) {
    return new ProductTotalLvrNodeModule_ProvideBasePercentageNodeFactory(module);
  }

  /** Proxies {@link ProductTotalLvrNodeModule#provideBasePercentageNode()}. */
  public static BasePercentageNode<?> proxyProvideBasePercentageNode(
      ProductTotalLvrNodeModule instance) {
    return instance.provideBasePercentageNode();
  }
}
