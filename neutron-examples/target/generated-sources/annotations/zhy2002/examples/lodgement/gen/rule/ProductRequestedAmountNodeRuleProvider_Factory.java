package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRequestedAmountNodeRuleProvider_Factory
    implements Factory<ProductRequestedAmountNodeRuleProvider> {
  private final MembersInjector<ProductRequestedAmountNodeRuleProvider>
      productRequestedAmountNodeRuleProviderMembersInjector;

  public ProductRequestedAmountNodeRuleProvider_Factory(
      MembersInjector<ProductRequestedAmountNodeRuleProvider>
          productRequestedAmountNodeRuleProviderMembersInjector) {
    assert productRequestedAmountNodeRuleProviderMembersInjector != null;
    this.productRequestedAmountNodeRuleProviderMembersInjector =
        productRequestedAmountNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductRequestedAmountNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productRequestedAmountNodeRuleProviderMembersInjector,
        new ProductRequestedAmountNodeRuleProvider());
  }

  public static Factory<ProductRequestedAmountNodeRuleProvider> create(
      MembersInjector<ProductRequestedAmountNodeRuleProvider>
          productRequestedAmountNodeRuleProviderMembersInjector) {
    return new ProductRequestedAmountNodeRuleProvider_Factory(
        productRequestedAmountNodeRuleProviderMembersInjector);
  }
}
