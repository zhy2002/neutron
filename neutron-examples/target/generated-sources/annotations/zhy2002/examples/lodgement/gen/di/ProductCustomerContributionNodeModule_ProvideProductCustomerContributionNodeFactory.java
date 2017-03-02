package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProductCustomerContributionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final
class ProductCustomerContributionNodeModule_ProvideProductCustomerContributionNodeFactory
    implements Factory<ProductCustomerContributionNode> {
  private final ProductCustomerContributionNodeModule module;

  public ProductCustomerContributionNodeModule_ProvideProductCustomerContributionNodeFactory(
      ProductCustomerContributionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProductCustomerContributionNode get() {
    return Preconditions.checkNotNull(
        module.provideProductCustomerContributionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductCustomerContributionNode> create(
      ProductCustomerContributionNodeModule module) {
    return new ProductCustomerContributionNodeModule_ProvideProductCustomerContributionNodeFactory(
        module);
  }

  /**
   * Proxies {@link ProductCustomerContributionNodeModule#provideProductCustomerContributionNode()}.
   */
  public static ProductCustomerContributionNode proxyProvideProductCustomerContributionNode(
      ProductCustomerContributionNodeModule instance) {
    return instance.provideProductCustomerContributionNode();
  }
}
