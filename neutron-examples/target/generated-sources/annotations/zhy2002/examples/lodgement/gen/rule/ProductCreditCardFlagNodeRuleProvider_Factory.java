package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCreditCardFlagNodeRuleProvider_Factory
    implements Factory<ProductCreditCardFlagNodeRuleProvider> {
  private final MembersInjector<ProductCreditCardFlagNodeRuleProvider>
      productCreditCardFlagNodeRuleProviderMembersInjector;

  public ProductCreditCardFlagNodeRuleProvider_Factory(
      MembersInjector<ProductCreditCardFlagNodeRuleProvider>
          productCreditCardFlagNodeRuleProviderMembersInjector) {
    assert productCreditCardFlagNodeRuleProviderMembersInjector != null;
    this.productCreditCardFlagNodeRuleProviderMembersInjector =
        productCreditCardFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductCreditCardFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productCreditCardFlagNodeRuleProviderMembersInjector,
        new ProductCreditCardFlagNodeRuleProvider());
  }

  public static Factory<ProductCreditCardFlagNodeRuleProvider> create(
      MembersInjector<ProductCreditCardFlagNodeRuleProvider>
          productCreditCardFlagNodeRuleProviderMembersInjector) {
    return new ProductCreditCardFlagNodeRuleProvider_Factory(
        productCreditCardFlagNodeRuleProviderMembersInjector);
  }
}
