package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalSecurityAmountNodeRuleProvider_Factory
    implements Factory<ProductTotalSecurityAmountNodeRuleProvider> {
  private final MembersInjector<ProductTotalSecurityAmountNodeRuleProvider>
      productTotalSecurityAmountNodeRuleProviderMembersInjector;

  public ProductTotalSecurityAmountNodeRuleProvider_Factory(
      MembersInjector<ProductTotalSecurityAmountNodeRuleProvider>
          productTotalSecurityAmountNodeRuleProviderMembersInjector) {
    assert productTotalSecurityAmountNodeRuleProviderMembersInjector != null;
    this.productTotalSecurityAmountNodeRuleProviderMembersInjector =
        productTotalSecurityAmountNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductTotalSecurityAmountNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productTotalSecurityAmountNodeRuleProviderMembersInjector,
        new ProductTotalSecurityAmountNodeRuleProvider());
  }

  public static Factory<ProductTotalSecurityAmountNodeRuleProvider> create(
      MembersInjector<ProductTotalSecurityAmountNodeRuleProvider>
          productTotalSecurityAmountNodeRuleProviderMembersInjector) {
    return new ProductTotalSecurityAmountNodeRuleProvider_Factory(
        productTotalSecurityAmountNodeRuleProviderMembersInjector);
  }
}
