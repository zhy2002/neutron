package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLoanAmountNodeRuleProvider_Factory
    implements Factory<ProductTotalLoanAmountNodeRuleProvider> {
  private final MembersInjector<ProductTotalLoanAmountNodeRuleProvider>
      productTotalLoanAmountNodeRuleProviderMembersInjector;

  public ProductTotalLoanAmountNodeRuleProvider_Factory(
      MembersInjector<ProductTotalLoanAmountNodeRuleProvider>
          productTotalLoanAmountNodeRuleProviderMembersInjector) {
    assert productTotalLoanAmountNodeRuleProviderMembersInjector != null;
    this.productTotalLoanAmountNodeRuleProviderMembersInjector =
        productTotalLoanAmountNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductTotalLoanAmountNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productTotalLoanAmountNodeRuleProviderMembersInjector,
        new ProductTotalLoanAmountNodeRuleProvider());
  }

  public static Factory<ProductTotalLoanAmountNodeRuleProvider> create(
      MembersInjector<ProductTotalLoanAmountNodeRuleProvider>
          productTotalLoanAmountNodeRuleProviderMembersInjector) {
    return new ProductTotalLoanAmountNodeRuleProvider_Factory(
        productTotalLoanAmountNodeRuleProviderMembersInjector);
  }
}
