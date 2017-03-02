package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLoanTermNodeRuleProvider_Factory
    implements Factory<ProductTotalLoanTermNodeRuleProvider> {
  private final MembersInjector<ProductTotalLoanTermNodeRuleProvider>
      productTotalLoanTermNodeRuleProviderMembersInjector;

  public ProductTotalLoanTermNodeRuleProvider_Factory(
      MembersInjector<ProductTotalLoanTermNodeRuleProvider>
          productTotalLoanTermNodeRuleProviderMembersInjector) {
    assert productTotalLoanTermNodeRuleProviderMembersInjector != null;
    this.productTotalLoanTermNodeRuleProviderMembersInjector =
        productTotalLoanTermNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductTotalLoanTermNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productTotalLoanTermNodeRuleProviderMembersInjector,
        new ProductTotalLoanTermNodeRuleProvider());
  }

  public static Factory<ProductTotalLoanTermNodeRuleProvider> create(
      MembersInjector<ProductTotalLoanTermNodeRuleProvider>
          productTotalLoanTermNodeRuleProviderMembersInjector) {
    return new ProductTotalLoanTermNodeRuleProvider_Factory(
        productTotalLoanTermNodeRuleProviderMembersInjector);
  }
}
