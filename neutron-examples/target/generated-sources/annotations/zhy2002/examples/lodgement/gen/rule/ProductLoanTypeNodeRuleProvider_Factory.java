package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductLoanTypeNodeRuleProvider_Factory
    implements Factory<ProductLoanTypeNodeRuleProvider> {
  private final MembersInjector<ProductLoanTypeNodeRuleProvider>
      productLoanTypeNodeRuleProviderMembersInjector;

  public ProductLoanTypeNodeRuleProvider_Factory(
      MembersInjector<ProductLoanTypeNodeRuleProvider>
          productLoanTypeNodeRuleProviderMembersInjector) {
    assert productLoanTypeNodeRuleProviderMembersInjector != null;
    this.productLoanTypeNodeRuleProviderMembersInjector =
        productLoanTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductLoanTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productLoanTypeNodeRuleProviderMembersInjector, new ProductLoanTypeNodeRuleProvider());
  }

  public static Factory<ProductLoanTypeNodeRuleProvider> create(
      MembersInjector<ProductLoanTypeNodeRuleProvider>
          productLoanTypeNodeRuleProviderMembersInjector) {
    return new ProductLoanTypeNodeRuleProvider_Factory(
        productLoanTypeNodeRuleProviderMembersInjector);
  }
}
