package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductNodeModule_ProvideProductNodeFactory implements Factory<ProductNode> {
  private final ProductNodeModule module;

  public ProductNodeModule_ProvideProductNodeFactory(ProductNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductNode get() {
    return Preconditions.checkNotNull(
        module.provideProductNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductNode> create(ProductNodeModule module) {
    return new ProductNodeModule_ProvideProductNodeFactory(module);
  }

  /** Proxies {@link ProductNodeModule#provideProductNode()}. */
  public static ProductNode proxyProvideProductNode(ProductNodeModule instance) {
    return instance.provideProductNode();
  }
}
