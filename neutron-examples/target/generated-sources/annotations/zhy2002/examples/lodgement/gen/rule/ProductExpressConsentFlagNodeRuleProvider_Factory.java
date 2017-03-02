package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductExpressConsentFlagNodeRuleProvider_Factory
    implements Factory<ProductExpressConsentFlagNodeRuleProvider> {
  private final MembersInjector<ProductExpressConsentFlagNodeRuleProvider>
      productExpressConsentFlagNodeRuleProviderMembersInjector;

  public ProductExpressConsentFlagNodeRuleProvider_Factory(
      MembersInjector<ProductExpressConsentFlagNodeRuleProvider>
          productExpressConsentFlagNodeRuleProviderMembersInjector) {
    assert productExpressConsentFlagNodeRuleProviderMembersInjector != null;
    this.productExpressConsentFlagNodeRuleProviderMembersInjector =
        productExpressConsentFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductExpressConsentFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productExpressConsentFlagNodeRuleProviderMembersInjector,
        new ProductExpressConsentFlagNodeRuleProvider());
  }

  public static Factory<ProductExpressConsentFlagNodeRuleProvider> create(
      MembersInjector<ProductExpressConsentFlagNodeRuleProvider>
          productExpressConsentFlagNodeRuleProviderMembersInjector) {
    return new ProductExpressConsentFlagNodeRuleProvider_Factory(
        productExpressConsentFlagNodeRuleProviderMembersInjector);
  }
}
