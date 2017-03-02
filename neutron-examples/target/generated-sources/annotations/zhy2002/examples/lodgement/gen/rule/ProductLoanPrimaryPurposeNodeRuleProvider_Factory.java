package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductLoanPrimaryPurposeNodeRuleProvider_Factory
    implements Factory<ProductLoanPrimaryPurposeNodeRuleProvider> {
  private final MembersInjector<ProductLoanPrimaryPurposeNodeRuleProvider>
      productLoanPrimaryPurposeNodeRuleProviderMembersInjector;

  public ProductLoanPrimaryPurposeNodeRuleProvider_Factory(
      MembersInjector<ProductLoanPrimaryPurposeNodeRuleProvider>
          productLoanPrimaryPurposeNodeRuleProviderMembersInjector) {
    assert productLoanPrimaryPurposeNodeRuleProviderMembersInjector != null;
    this.productLoanPrimaryPurposeNodeRuleProviderMembersInjector =
        productLoanPrimaryPurposeNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductLoanPrimaryPurposeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productLoanPrimaryPurposeNodeRuleProviderMembersInjector,
        new ProductLoanPrimaryPurposeNodeRuleProvider());
  }

  public static Factory<ProductLoanPrimaryPurposeNodeRuleProvider> create(
      MembersInjector<ProductLoanPrimaryPurposeNodeRuleProvider>
          productLoanPrimaryPurposeNodeRuleProviderMembersInjector) {
    return new ProductLoanPrimaryPurposeNodeRuleProvider_Factory(
        productLoanPrimaryPurposeNodeRuleProviderMembersInjector);
  }
}
