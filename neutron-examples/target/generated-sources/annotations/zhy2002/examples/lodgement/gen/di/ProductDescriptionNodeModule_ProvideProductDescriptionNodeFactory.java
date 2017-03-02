package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductDescriptionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductDescriptionNodeModule_ProvideProductDescriptionNodeFactory
    implements Factory<ProductDescriptionNode> {
  private final ProductDescriptionNodeModule module;

  public ProductDescriptionNodeModule_ProvideProductDescriptionNodeFactory(
      ProductDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductDescriptionNode get() {
    return Preconditions.checkNotNull(
        module.provideProductDescriptionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductDescriptionNode> create(ProductDescriptionNodeModule module) {
    return new ProductDescriptionNodeModule_ProvideProductDescriptionNodeFactory(module);
  }

  /** Proxies {@link ProductDescriptionNodeModule#provideProductDescriptionNode()}. */
  public static ProductDescriptionNode proxyProvideProductDescriptionNode(
      ProductDescriptionNodeModule instance) {
    return instance.provideProductDescriptionNode();
  }
}
