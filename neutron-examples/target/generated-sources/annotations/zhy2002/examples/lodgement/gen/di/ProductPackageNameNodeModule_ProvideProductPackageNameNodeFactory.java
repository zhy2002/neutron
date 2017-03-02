package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductPackageNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductPackageNameNodeModule_ProvideProductPackageNameNodeFactory
    implements Factory<ProductPackageNameNode> {
  private final ProductPackageNameNodeModule module;

  public ProductPackageNameNodeModule_ProvideProductPackageNameNodeFactory(
      ProductPackageNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductPackageNameNode get() {
    return Preconditions.checkNotNull(
        module.provideProductPackageNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductPackageNameNode> create(ProductPackageNameNodeModule module) {
    return new ProductPackageNameNodeModule_ProvideProductPackageNameNodeFactory(module);
  }

  /** Proxies {@link ProductPackageNameNodeModule#provideProductPackageNameNode()}. */
  public static ProductPackageNameNode proxyProvideProductPackageNameNode(
      ProductPackageNameNodeModule instance) {
    return instance.provideProductPackageNameNode();
  }
}
