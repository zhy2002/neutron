package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCreditCardLimitNodeRuleProvider_Factory
    implements Factory<ProductCreditCardLimitNodeRuleProvider> {
  private final MembersInjector<ProductCreditCardLimitNodeRuleProvider>
      productCreditCardLimitNodeRuleProviderMembersInjector;

  public ProductCreditCardLimitNodeRuleProvider_Factory(
      MembersInjector<ProductCreditCardLimitNodeRuleProvider>
          productCreditCardLimitNodeRuleProviderMembersInjector) {
    assert productCreditCardLimitNodeRuleProviderMembersInjector != null;
    this.productCreditCardLimitNodeRuleProviderMembersInjector =
        productCreditCardLimitNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductCreditCardLimitNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productCreditCardLimitNodeRuleProviderMembersInjector,
        new ProductCreditCardLimitNodeRuleProvider());
  }

  public static Factory<ProductCreditCardLimitNodeRuleProvider> create(
      MembersInjector<ProductCreditCardLimitNodeRuleProvider>
          productCreditCardLimitNodeRuleProviderMembersInjector) {
    return new ProductCreditCardLimitNodeRuleProvider_Factory(
        productCreditCardLimitNodeRuleProviderMembersInjector);
  }
}
