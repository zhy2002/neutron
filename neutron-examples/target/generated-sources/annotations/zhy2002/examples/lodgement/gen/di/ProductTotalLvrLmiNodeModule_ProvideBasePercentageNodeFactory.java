package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BasePercentageNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLvrLmiNodeModule_ProvideBasePercentageNodeFactory
    implements Factory<BasePercentageNode<?>> {
  private final ProductTotalLvrLmiNodeModule module;

  public ProductTotalLvrLmiNodeModule_ProvideBasePercentageNodeFactory(
      ProductTotalLvrLmiNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BasePercentageNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBasePercentageNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BasePercentageNode<?>> create(ProductTotalLvrLmiNodeModule module) {
    return new ProductTotalLvrLmiNodeModule_ProvideBasePercentageNodeFactory(module);
  }

  /** Proxies {@link ProductTotalLvrLmiNodeModule#provideBasePercentageNode()}. */
  public static BasePercentageNode<?> proxyProvideBasePercentageNode(
      ProductTotalLvrLmiNodeModule instance) {
    return instance.provideBasePercentageNode();
  }
}
