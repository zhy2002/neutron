package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductFixedTermNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductFixedTermNodeModule_ProvideProductFixedTermNodeFactory
    implements Factory<ProductFixedTermNode> {
  private final ProductFixedTermNodeModule module;

  public ProductFixedTermNodeModule_ProvideProductFixedTermNodeFactory(
      ProductFixedTermNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductFixedTermNode get() {
    return Preconditions.checkNotNull(
        module.provideProductFixedTermNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductFixedTermNode> create(ProductFixedTermNodeModule module) {
    return new ProductFixedTermNodeModule_ProvideProductFixedTermNodeFactory(module);
  }

  /** Proxies {@link ProductFixedTermNodeModule#provideProductFixedTermNode()}. */
  public static ProductFixedTermNode proxyProvideProductFixedTermNode(
      ProductFixedTermNodeModule instance) {
    return instance.provideProductFixedTermNode();
  }
}
