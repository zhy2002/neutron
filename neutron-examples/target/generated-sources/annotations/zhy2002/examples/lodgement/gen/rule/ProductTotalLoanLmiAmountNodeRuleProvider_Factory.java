package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLoanLmiAmountNodeRuleProvider_Factory
    implements Factory<ProductTotalLoanLmiAmountNodeRuleProvider> {
  private final MembersInjector<ProductTotalLoanLmiAmountNodeRuleProvider>
      productTotalLoanLmiAmountNodeRuleProviderMembersInjector;

  public ProductTotalLoanLmiAmountNodeRuleProvider_Factory(
      MembersInjector<ProductTotalLoanLmiAmountNodeRuleProvider>
          productTotalLoanLmiAmountNodeRuleProviderMembersInjector) {
    assert productTotalLoanLmiAmountNodeRuleProviderMembersInjector != null;
    this.productTotalLoanLmiAmountNodeRuleProviderMembersInjector =
        productTotalLoanLmiAmountNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductTotalLoanLmiAmountNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productTotalLoanLmiAmountNodeRuleProviderMembersInjector,
        new ProductTotalLoanLmiAmountNodeRuleProvider());
  }

  public static Factory<ProductTotalLoanLmiAmountNodeRuleProvider> create(
      MembersInjector<ProductTotalLoanLmiAmountNodeRuleProvider>
          productTotalLoanLmiAmountNodeRuleProviderMembersInjector) {
    return new ProductTotalLoanLmiAmountNodeRuleProvider_Factory(
        productTotalLoanLmiAmountNodeRuleProviderMembersInjector);
  }
}
