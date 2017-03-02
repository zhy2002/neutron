package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductRewardsMembershipNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRewardsMembershipNodeModule_ProvideProductRewardsMembershipNodeFactory
    implements Factory<ProductRewardsMembershipNode> {
  private final ProductRewardsMembershipNodeModule module;

  public ProductRewardsMembershipNodeModule_ProvideProductRewardsMembershipNodeFactory(
      ProductRewardsMembershipNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductRewardsMembershipNode get() {
    return Preconditions.checkNotNull(
        module.provideProductRewardsMembershipNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductRewardsMembershipNode> create(
      ProductRewardsMembershipNodeModule module) {
    return new ProductRewardsMembershipNodeModule_ProvideProductRewardsMembershipNodeFactory(
        module);
  }

  /** Proxies {@link ProductRewardsMembershipNodeModule#provideProductRewardsMembershipNode()}. */
  public static ProductRewardsMembershipNode proxyProvideProductRewardsMembershipNode(
      ProductRewardsMembershipNodeModule instance) {
    return instance.provideProductRewardsMembershipNode();
  }
}
