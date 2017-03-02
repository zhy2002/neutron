package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductFeesNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductFeesNodeModule_ProvideProductFeesNodeFactory
    implements Factory<ProductFeesNode> {
  private final ProductFeesNodeModule module;

  public ProductFeesNodeModule_ProvideProductFeesNodeFactory(ProductFeesNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductFeesNode get() {
    return Preconditions.checkNotNull(
        module.provideProductFeesNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductFeesNode> create(ProductFeesNodeModule module) {
    return new ProductFeesNodeModule_ProvideProductFeesNodeFactory(module);
  }

  /** Proxies {@link ProductFeesNodeModule#provideProductFeesNode()}. */
  public static ProductFeesNode proxyProvideProductFeesNode(ProductFeesNodeModule instance) {
    return instance.provideProductFeesNode();
  }
}
