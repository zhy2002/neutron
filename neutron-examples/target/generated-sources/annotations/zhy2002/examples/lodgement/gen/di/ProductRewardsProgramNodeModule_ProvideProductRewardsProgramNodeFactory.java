package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductRewardsProgramNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRewardsProgramNodeModule_ProvideProductRewardsProgramNodeFactory
    implements Factory<ProductRewardsProgramNode> {
  private final ProductRewardsProgramNodeModule module;

  public ProductRewardsProgramNodeModule_ProvideProductRewardsProgramNodeFactory(
      ProductRewardsProgramNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductRewardsProgramNode get() {
    return Preconditions.checkNotNull(
        module.provideProductRewardsProgramNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductRewardsProgramNode> create(ProductRewardsProgramNodeModule module) {
    return new ProductRewardsProgramNodeModule_ProvideProductRewardsProgramNodeFactory(module);
  }

  /** Proxies {@link ProductRewardsProgramNodeModule#provideProductRewardsProgramNode()}. */
  public static ProductRewardsProgramNode proxyProvideProductRewardsProgramNode(
      ProductRewardsProgramNodeModule instance) {
    return instance.provideProductRewardsProgramNode();
  }
}
