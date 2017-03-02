package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCreditCardTypeNodeRuleProvider_Factory
    implements Factory<ProductCreditCardTypeNodeRuleProvider> {
  private final MembersInjector<ProductCreditCardTypeNodeRuleProvider>
      productCreditCardTypeNodeRuleProviderMembersInjector;

  public ProductCreditCardTypeNodeRuleProvider_Factory(
      MembersInjector<ProductCreditCardTypeNodeRuleProvider>
          productCreditCardTypeNodeRuleProviderMembersInjector) {
    assert productCreditCardTypeNodeRuleProviderMembersInjector != null;
    this.productCreditCardTypeNodeRuleProviderMembersInjector =
        productCreditCardTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductCreditCardTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productCreditCardTypeNodeRuleProviderMembersInjector,
        new ProductCreditCardTypeNodeRuleProvider());
  }

  public static Factory<ProductCreditCardTypeNodeRuleProvider> create(
      MembersInjector<ProductCreditCardTypeNodeRuleProvider>
          productCreditCardTypeNodeRuleProviderMembersInjector) {
    return new ProductCreditCardTypeNodeRuleProvider_Factory(
        productCreditCardTypeNodeRuleProviderMembersInjector);
  }
}
