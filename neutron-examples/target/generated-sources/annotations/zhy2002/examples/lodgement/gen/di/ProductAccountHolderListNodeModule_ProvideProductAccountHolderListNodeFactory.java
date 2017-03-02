package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductAccountHolderListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductAccountHolderListNodeModule_ProvideProductAccountHolderListNodeFactory
    implements Factory<ProductAccountHolderListNode> {
  private final ProductAccountHolderListNodeModule module;

  public ProductAccountHolderListNodeModule_ProvideProductAccountHolderListNodeFactory(
      ProductAccountHolderListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductAccountHolderListNode get() {
    return Preconditions.checkNotNull(
        module.provideProductAccountHolderListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductAccountHolderListNode> create(
      ProductAccountHolderListNodeModule module) {
    return new ProductAccountHolderListNodeModule_ProvideProductAccountHolderListNodeFactory(
        module);
  }

  /** Proxies {@link ProductAccountHolderListNodeModule#provideProductAccountHolderListNode()}. */
  public static ProductAccountHolderListNode proxyProvideProductAccountHolderListNode(
      ProductAccountHolderListNodeModule instance) {
    return instance.provideProductAccountHolderListNode();
  }
}
