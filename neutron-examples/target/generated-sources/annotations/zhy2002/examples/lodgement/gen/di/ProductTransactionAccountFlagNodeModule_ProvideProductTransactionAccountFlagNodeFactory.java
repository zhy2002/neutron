package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductTransactionAccountFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final
class ProductTransactionAccountFlagNodeModule_ProvideProductTransactionAccountFlagNodeFactory
    implements Factory<ProductTransactionAccountFlagNode> {
  private final ProductTransactionAccountFlagNodeModule module;

  public ProductTransactionAccountFlagNodeModule_ProvideProductTransactionAccountFlagNodeFactory(
      ProductTransactionAccountFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductTransactionAccountFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideProductTransactionAccountFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductTransactionAccountFlagNode> create(
      ProductTransactionAccountFlagNodeModule module) {
    return new ProductTransactionAccountFlagNodeModule_ProvideProductTransactionAccountFlagNodeFactory(
        module);
  }

  /**
   * Proxies {@link
   * ProductTransactionAccountFlagNodeModule#provideProductTransactionAccountFlagNode()}.
   */
  public static ProductTransactionAccountFlagNode proxyProvideProductTransactionAccountFlagNode(
      ProductTransactionAccountFlagNodeModule instance) {
    return instance.provideProductTransactionAccountFlagNode();
  }
}
