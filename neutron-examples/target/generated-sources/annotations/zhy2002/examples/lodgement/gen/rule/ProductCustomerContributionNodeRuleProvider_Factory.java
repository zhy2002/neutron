package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCustomerContributionNodeRuleProvider_Factory
    implements Factory<ProductCustomerContributionNodeRuleProvider> {
  private final MembersInjector<ProductCustomerContributionNodeRuleProvider>
      productCustomerContributionNodeRuleProviderMembersInjector;

  public ProductCustomerContributionNodeRuleProvider_Factory(
      MembersInjector<ProductCustomerContributionNodeRuleProvider>
          productCustomerContributionNodeRuleProviderMembersInjector) {
    assert productCustomerContributionNodeRuleProviderMembersInjector != null;
    this.productCustomerContributionNodeRuleProviderMembersInjector =
        productCustomerContributionNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductCustomerContributionNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productCustomerContributionNodeRuleProviderMembersInjector,
        new ProductCustomerContributionNodeRuleProvider());
  }

  public static Factory<ProductCustomerContributionNodeRuleProvider> create(
      MembersInjector<ProductCustomerContributionNodeRuleProvider>
          productCustomerContributionNodeRuleProviderMembersInjector) {
    return new ProductCustomerContributionNodeRuleProvider_Factory(
        productCustomerContributionNodeRuleProviderMembersInjector);
  }
}
