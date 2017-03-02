package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductPaymentTypeNodeRuleProvider_Factory
    implements Factory<ProductPaymentTypeNodeRuleProvider> {
  private final MembersInjector<ProductPaymentTypeNodeRuleProvider>
      productPaymentTypeNodeRuleProviderMembersInjector;

  public ProductPaymentTypeNodeRuleProvider_Factory(
      MembersInjector<ProductPaymentTypeNodeRuleProvider>
          productPaymentTypeNodeRuleProviderMembersInjector) {
    assert productPaymentTypeNodeRuleProviderMembersInjector != null;
    this.productPaymentTypeNodeRuleProviderMembersInjector =
        productPaymentTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductPaymentTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productPaymentTypeNodeRuleProviderMembersInjector,
        new ProductPaymentTypeNodeRuleProvider());
  }

  public static Factory<ProductPaymentTypeNodeRuleProvider> create(
      MembersInjector<ProductPaymentTypeNodeRuleProvider>
          productPaymentTypeNodeRuleProviderMembersInjector) {
    return new ProductPaymentTypeNodeRuleProvider_Factory(
        productPaymentTypeNodeRuleProviderMembersInjector);
  }
}
