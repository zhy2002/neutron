package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCostRecuctionFlagNodeRuleProvider_Factory
    implements Factory<ProductCostRecuctionFlagNodeRuleProvider> {
  private final MembersInjector<ProductCostRecuctionFlagNodeRuleProvider>
      productCostRecuctionFlagNodeRuleProviderMembersInjector;

  public ProductCostRecuctionFlagNodeRuleProvider_Factory(
      MembersInjector<ProductCostRecuctionFlagNodeRuleProvider>
          productCostRecuctionFlagNodeRuleProviderMembersInjector) {
    assert productCostRecuctionFlagNodeRuleProviderMembersInjector != null;
    this.productCostRecuctionFlagNodeRuleProviderMembersInjector =
        productCostRecuctionFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductCostRecuctionFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productCostRecuctionFlagNodeRuleProviderMembersInjector,
        new ProductCostRecuctionFlagNodeRuleProvider());
  }

  public static Factory<ProductCostRecuctionFlagNodeRuleProvider> create(
      MembersInjector<ProductCostRecuctionFlagNodeRuleProvider>
          productCostRecuctionFlagNodeRuleProviderMembersInjector) {
    return new ProductCostRecuctionFlagNodeRuleProvider_Factory(
        productCostRecuctionFlagNodeRuleProviderMembersInjector);
  }
}
